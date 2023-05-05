package com.example.matchingapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.matchingapp.R
import com.example.matchingapp.fragment.join.GenderSelectFragment
import com.example.matchingapp.fragment.join.HeightSelectFragment
import com.example.matchingapp.fragment.join.JoinCompletedFragment

private const val TAG = "JoinActivity_테스트"

class JoinActivity : AppCompatActivity() {
    var gender = 0
    var height = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout_join, GenderSelectFragment())
            .addToBackStack(null)
            .commit()
    }
}