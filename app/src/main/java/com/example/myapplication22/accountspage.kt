package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class accountspage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.accountspge)

        var button1 = findViewById<Button>(R.id.button20)
        button1.setOnClickListener {
            var intent1 = Intent(this, budgetpge::class.java)
            startActivity(intent1)
        }
    }
}
