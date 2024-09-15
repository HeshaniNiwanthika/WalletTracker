package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        var button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            var intent1 = Intent(this, settings::class.java)
            startActivity(intent1)
        }
    }
}
