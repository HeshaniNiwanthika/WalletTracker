package com.example.myapplication22

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class loaunchscreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loauchscreen2)


        Handler().postDelayed({
            val intent = Intent(this@loaunchscreen2,launchscreen3::class.java)
            startActivity(intent)
            finish()
        }, 3000)

    }
}