package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class createaccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.createaccount)

        var button14 = findViewById<Button>(R.id.button14)
        button14.setOnClickListener {
            var intent1 = Intent(this, maindashboard::class.java)
            startActivity(intent1)
        }
    }
}
