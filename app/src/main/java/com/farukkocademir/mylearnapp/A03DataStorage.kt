package com.farukkocademir.mylearnapp

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.farukkocademir.mylearnapp.databinding.ActivityA03DataStorageBinding

class A03DataStorage : AppCompatActivity() {
//
    private lateinit var binding: ActivityA03DataStorageBinding
    //SharedPreferences Key - Value
    //Kısa süreli verileri saklamamızı sağlar

    lateinit var  sharedData : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityA03DataStorageBinding.inflate(layoutInflater)
        sharedData = this.getSharedPreferences("com.farukkocademir.mylearnapp", MODE_PRIVATE)

        setContentView(binding.root)
    }
    fun Save(view : View)
    {
        binding.randomText.text = binding.randomInput.text.toString()
        sharedData.edit().putString("data",binding.randomInput.text.toString()).apply()
    }
    fun Delete(view : View)
    {
        binding.randomText.text = ""
    }
}