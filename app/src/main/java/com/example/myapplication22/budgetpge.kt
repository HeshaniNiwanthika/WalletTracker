package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class budgetpge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.budgetpge)

        var button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            var intent1 = Intent(this, loanspge::class.java)
            startActivity(intent1)
        }
    }
}
