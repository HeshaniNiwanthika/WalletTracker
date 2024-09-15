package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loanspge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loanspge)

        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            var intent1 = Intent(this, createaccount::class.java)
            startActivity(intent1)
        }
    }
}
