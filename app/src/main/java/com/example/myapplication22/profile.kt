package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        var imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        imageButton3.setOnClickListener {
            var intent1 = Intent(this, maindashboard::class.java)
            startActivity(intent1)
        }
    }
}