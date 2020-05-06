package com.example.mainidle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class datadiri : AppCompatActivity() {
private lateinit var btn1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datadiri)
        btn1 = findViewById(R.id.button1)
        btn1.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        val imail =findViewById(R.id.textView14) as TextView
        imail.setOnClickListener{
            val orul = Intent(android.content.Intent.ACTION_VIEW)
            orul.data = Uri.parse("https://mail.google.com/mail/u/2/#inbox?compose=GTvVlcSDbFjvqJMWMHFHSQJkhRwXgBKbBxhlKkMKTzmxpvgVLSHgdwLDsmCnKWrZFWJjqSHmggpsq")
            startActivity(orul)
        }
    }
}
