package com.farukkocademir.mylearnapp

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.farukkocademir.mylearnapp.databinding.ActivityA03DataStorageBinding
import com.farukkocademir.mylearnapp.databinding.ActivityA06KronometreBinding

class A06Kronometre : AppCompatActivity() {
    private lateinit var bindind : ActivityA06KronometreBinding
    var count = 0
    var runnable : Runnable = Runnable { }
    var handler : Handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindind = ActivityA06KronometreBinding.inflate(layoutInflater)
        setContentView(bindind.root)
    }

    fun StartKronometre(view : View){
        count = 0
        runnable = object : Runnable {
            override fun run() {
                count++
                bindind.textView3.text = "${count}"
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
        bindind.button18.isEnabled = false
    }
    fun StopKronometre(view : View){
        bindind.button18.isEnabled = true
        count = 0
        bindind.textView3.text = "0"
        handler.removeCallbacks(runnable)
    }
}