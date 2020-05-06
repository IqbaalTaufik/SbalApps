package com.example.mainidle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class datadiri : AppCompatActivity() {
private lateinit var btn1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datadiri)
        btn1 = findViewById(R.id.button1)
        btn1.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
