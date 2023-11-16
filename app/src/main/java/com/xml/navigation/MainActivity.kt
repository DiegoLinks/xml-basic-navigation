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

            val userBino = User(
                name = "Bino",
                age = 50,
                isSubscribe = true,
                score = 1234.56,
                level = 150F,
                ranking = 10000000L,
                userClass = 'A'
            )

            val userDino = User(
                name = "Dino",
                age = 30,
                isSubscribe = false,
                score = 1134.98,
                level = 120F,
                ranking = 30000000L,
                userClass = 'B'
            )

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("user", userBino)
            intent.putExtra("name", userDino.name)
            intent.putExtra("age", userDino.age)
            intent.putExtra("isSubscribe", userDino.isSubscribe)
            intent.putExtra("score", userDino.score)
            intent.putExtra("level", userDino.level)
            intent.putExtra("userClass", userDino.userClass)
            intent.putExtra("ranking", userDino.ranking)
            startActivity(intent)
        }
    }
}