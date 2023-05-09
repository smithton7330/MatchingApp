package com.example.matchingapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.matchingapp.R

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        val testText = findViewById<TextView>(R.id.test)
        testText.text = intent.getStringExtra("post_id")
    }
}