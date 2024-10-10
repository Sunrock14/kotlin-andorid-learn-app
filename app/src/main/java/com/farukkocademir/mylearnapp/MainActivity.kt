package com.farukkocademir.mylearnapp

import Learn
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val learn = Learn()
        learn.variables()
        learn.stringVariable()
        learn.arrayVariable()
        learn.listVariable()
        learn.setVariable()
        learn.mapVariable()
        learn.operators()
        learn.ifStatement()
        learn.switchStatement()
        learn.forLoop()
        learn.whileLoop()


    }
}



