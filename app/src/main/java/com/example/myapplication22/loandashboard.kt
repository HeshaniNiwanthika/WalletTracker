package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class loandashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loandashboard)

        var imageButton16 = findViewById<ImageButton>(R.id.imageButton16)
        imageButton16.setOnClickListener {
            var intent1 = Intent(this, maindashboard::class.java)
            startActivity(intent1)
        }
    }
}
