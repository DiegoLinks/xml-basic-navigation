package com.xml.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btNavigate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btNavigate = findViewById(R.id.bt_navigate)

        btNavigate.setOnClickListener {

            val user = User(
                name = "Bino",
                age = 50,
                isSubscribe = true,
                score = 1234.56
            )

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
        }
    }
}