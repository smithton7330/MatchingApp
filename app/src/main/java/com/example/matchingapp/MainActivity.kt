package com.example.matchingapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaPlayer = MediaPlayer.create(this,R.raw.toughtime)


        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            mediaPlayer.start()
        }


    }
}