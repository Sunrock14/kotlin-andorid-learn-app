package com.farukkocademir.mylearnapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Person(view: View){
        val intent = Intent(this@MainActivity,A01Person::class.java)
        startActivity(intent)
    }
    fun Second(view: View){
        val intent = Intent(this@MainActivity,A02Calculator::class.java)
        startActivity(intent)
    }
    fun ThirdFunc(view : View){
        val intent = Intent(this@MainActivity,A03DataStorage::class.java)
        startActivity(intent)
    }
    fun FourFunc(view : View){
        val intent = Intent(this@MainActivity,A04AlertMessage::class.java)
        startActivity(intent)
    }
    fun FuncCountDown(view : View){
        val intent = Intent(this@MainActivity, A05CountDown::class.java)
        startActivity(intent)
    }
    fun FuncKronometre(view : View){
        val intent = Intent(this@MainActivity, A06Kronometre::class.java)
        startActivity(intent)
    }
    fun CatchFly(view : View){
        val intent = Intent(this@MainActivity, A07CatchToFly::class.java)
        startActivity(intent)
    }
}

