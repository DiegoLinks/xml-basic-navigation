package com.xml.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    lateinit var tvLabel: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tvLabel = findViewById(R.id.tv_label)

        val label = intent.getStringExtra("label") ?: "vazio"

        tvLabel.text = label
    }
}