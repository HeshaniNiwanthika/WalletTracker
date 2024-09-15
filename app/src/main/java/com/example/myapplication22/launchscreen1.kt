package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class launchscreen1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loaunchscreen1)

        Handler().postDelayed({
            val intent = Intent(this@launchscreen1,loaunchscreen2::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}

