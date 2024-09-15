package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)

        var imageButton4 = findViewById<ImageButton>(R.id.imageButton4)
        imageButton4.setOnClickListener {
            var intent1 = Intent(this, maindashboard::class.java)
            startActivity(intent1)
        }
    }
}
