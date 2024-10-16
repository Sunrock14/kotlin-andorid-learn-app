package com.farukkocademir.mylearnapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.farukkocademir.mylearnapp.databinding.ActivityA01PersonBinding

class A01Person : AppCompatActivity() {
    //Const
    private lateinit var binding: ActivityA01PersonBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityA01PersonBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun BindingUsage(){

        binding.button4.text = "Button"
        binding.editText.hint = "Name"

        binding.button4.setOnClickListener {
            binding.textView2.text = "Button Tıklandı"
        }
    }
}