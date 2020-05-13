package com.example.mainidle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_wolktru.*

class wolktru : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wolktru)
        viewpager.adapter = MyPagerAdapter(supportFragmentManager)
    }
}
