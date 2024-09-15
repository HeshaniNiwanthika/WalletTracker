package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class accountdashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.accountdashboard)

        var imageButton12 = findViewById<ImageButton>(R.id.imageButton12)
        imageButton12.setOnClickListener {
            var intent1 = Intent(this, maindashboard::class.java)
            startActivity(intent1)
        }
    }
}
