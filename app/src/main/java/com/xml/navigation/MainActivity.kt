package com.xml.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var btNavigate: Button
    lateinit var edLabel: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btNavigate = findViewById(R.id.bt_navigate)
        edLabel = findViewById(R.id.ed_label)

        val label = edLabel.text

        btNavigate.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("label", label.toString())
            startActivity(intent)
        }
    }
}