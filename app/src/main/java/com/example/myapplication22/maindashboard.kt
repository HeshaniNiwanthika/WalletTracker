package com.example.myapplication22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class maindashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maindashboard)

        var imageButton6 = findViewById<ImageButton>(R.id.imageButton6)
        imageButton6.setOnClickListener {
            var intent1 = Intent(this, budget::class.java)
            startActivity(intent1)

            var imageButton7 = findViewById<ImageButton>(R.id.imageButton7)
            imageButton7.setOnClickListener {
                var intent1 = Intent(this, loandashboard::class.java)
                startActivity(intent1)

                var imageButton8 = findViewById<ImageButton>(R.id.imageButton8)
                imageButton8.setOnClickListener {
                    var intent1 = Intent(this, accountdashboard::class.java)
                    startActivity(intent1)

                    var imageButton9 = findViewById<ImageButton>(R.id.imageButton9)
                    imageButton9.setOnClickListener {
                        var intent1 = Intent(this, settings::class.java)
                        startActivity(intent1)

                        var imageButton18 = findViewById<ImageButton>(R.id.imageButton18)
                        imageButton18.setOnClickListener {
                            var intent1 = Intent(this, profile::class.java)
                            startActivity(intent1)

                            var imageButton19 = findViewById<ImageButton>(R.id.imageButton19)
                            imageButton19.setOnClickListener {
                                var intent1 = Intent(this, loggin::class.java)
                                startActivity(intent1)
                            }
                        }
                    }
                }
            }
        }
    }
}

