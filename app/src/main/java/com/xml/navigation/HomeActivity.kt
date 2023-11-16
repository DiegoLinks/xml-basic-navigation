package com.xml.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    lateinit var tvName : TextView
    lateinit var tvAge : TextView
    lateinit var tvSubscribe : TextView
    lateinit var tvScore : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tvName = findViewById(R.id.tv_name)
        tvAge = findViewById(R.id.tv_age)
        tvSubscribe = findViewById(R.id.tv_subscribe)
        tvScore = findViewById(R.id.tv_score)
    }
}