package com.farukkocademir.mylearnapp

import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.farukkocademir.mylearnapp.databinding.ActivityA05CountDownBinding

class A05CountDown : AppCompatActivity() {
    public lateinit var binding : ActivityA05CountDownBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityA05CountDownBinding.inflate(layoutInflater)
        setContentView(binding.root)

        object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                binding.textView.text = "Left : ${millisUntilFinished / 1000}"
            }

            override fun onFinish() {
                binding.textView.text = "Left : işlem tamamlandı"
            }

        }.start()
    }
}