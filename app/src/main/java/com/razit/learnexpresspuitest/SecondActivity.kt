package com.razit.learnexpresspuitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    private lateinit var button_back : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button_back = findViewById(R.id.button_back)

        button_back.setOnClickListener {
            onBackPressed()
        }
    }
}