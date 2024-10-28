package com.farukkocademir.mylearnapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.farukkocademir.mylearnapp.databinding.ActivityA07CatchToFlyBinding

class A07CatchToFly : AppCompatActivity() {
    private lateinit var binding: ActivityA07CatchToFlyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityA07CatchToFlyBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}