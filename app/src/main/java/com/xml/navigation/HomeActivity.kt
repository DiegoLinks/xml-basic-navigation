package com.xml.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var tvName: TextView
    private lateinit var tvAge: TextView
    private lateinit var tvSubscribe: TextView
    private lateinit var tvScore: TextView
    private lateinit var tvName2: TextView
    private lateinit var tvAge2: TextView
    private lateinit var tvSubscribe2: TextView
    private lateinit var tvScore2: TextView
    private lateinit var tvLevel: TextView
    private lateinit var tvClass: TextView
    private lateinit var tvRanking: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tvName = findViewById(R.id.tv_name)
        tvAge = findViewById(R.id.tv_age)
        tvSubscribe = findViewById(R.id.tv_subscribe)
        tvScore = findViewById(R.id.tv_score)

        val user = intent.getSerializableExtra("user") as User

        tvName.text = user.name
        tvAge.text = "Idade: ${user.age}"
        tvSubscribe.text = if (user.isSubscribe) "Inscrito: SIM" else "Inscrito: não :("
        tvScore.text = "Score ${user.score}"

        val name = intent.getStringExtra("name")
        val age = intent.getIntExtra("age", 0)
        val isSubscribe = intent.getBooleanExtra("isSubscribe", true)
        val score = intent.getDoubleExtra("score", 500.00)
        val level = intent.getFloatExtra("level", 500F)
        val userClass = intent.getCharExtra("userClass", 'A')
        val ranking = intent.getLongExtra("ranking", 10L)

        tvName2 = findViewById(R.id.tv_name_2)
        tvAge2 = findViewById(R.id.tv_age_2)
        tvSubscribe2 = findViewById(R.id.tv_subscribe_2)
        tvScore2 = findViewById(R.id.tv_score_2)
        tvLevel = findViewById(R.id.tv_level)
        tvClass = findViewById(R.id.tv_class)
        tvRanking = findViewById(R.id.tv_ranking)

        tvName2.text = name
        tvAge2.text = "Idade: $age"
        tvSubscribe2.text = if (isSubscribe) "Inscrito: SIM" else "Inscrito: não :("
        tvScore2.text = "Score: $score"
        tvLevel.text = "Level: $level"
        tvClass.text = "Class: $userClass"
        tvRanking.text = "Ranking: $ranking"
    }
}