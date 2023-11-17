package com.xml.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var tvName: TextView
    private lateinit var tvAge: TextView
    private lateinit var tvSubscribe: TextView
    private lateinit var tvScore: TextView
    private lateinit var tvLevel: TextView
    private lateinit var tvClass: TextView
    private lateinit var tvRanking: TextView
    private lateinit var tvName2: TextView
    private lateinit var tvAge2: TextView
    private lateinit var tvSubscribe2: TextView
    private lateinit var tvScore2: TextView
    private lateinit var tvLevel2: TextView
    private lateinit var tvClass2: TextView
    private lateinit var tvRanking2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bindViews()
        setObjectData()
        setObjectParametersData()
    }

    private fun bindViews() {
        tvName = findViewById(R.id.tv_name)
        tvAge = findViewById(R.id.tv_age)
        tvSubscribe = findViewById(R.id.tv_subscribe)
        tvScore = findViewById(R.id.tv_score)
        tvLevel = findViewById(R.id.tv_level)
        tvClass = findViewById(R.id.tv_class)
        tvRanking = findViewById(R.id.tv_ranking)
        tvName2 = findViewById(R.id.tv_name_2)
        tvAge2 = findViewById(R.id.tv_age_2)
        tvSubscribe2 = findViewById(R.id.tv_subscribe_2)
        tvScore2 = findViewById(R.id.tv_score_2)
        tvLevel2 = findViewById(R.id.tv_level_2)
        tvClass2 = findViewById(R.id.tv_class_2)
        tvRanking2 = findViewById(R.id.tv_ranking_2)
    }

    private fun setObjectData() {
        val user = intent.getSerializableExtra("user") as User

        tvName.text = user.name
        tvAge.text = "Idade: ${user.age}"
        tvSubscribe.text = if (user.isSubscribe) "Inscrito: SIM" else "Inscrito: não :("
        tvScore.text = "Score ${user.score}"
        tvClass.text = "Class: ${user.userClass}"
        tvRanking.text = "Ranking: ${user.ranking}"
        tvLevel.text = "Level: ${user.level}"
    }

    private fun setObjectParametersData() {
        val name = intent.getStringExtra("name")
        val age = intent.getIntExtra("age", 0)
        val isSubscribe = intent.getBooleanExtra("isSubscribe", true)
        val score = intent.getDoubleExtra("score", 500.00)
        val userClass = intent.getCharExtra("userClass", 'A')
        val ranking = intent.getLongExtra("ranking", 10L)
        val level = intent.getFloatExtra("level", 500F)

        tvName2.text = name
        tvAge2.text = "Idade: $age"
        tvSubscribe2.text = if (isSubscribe) "Inscrito: SIM" else "Inscrito: não :("
        tvScore2.text = "Score: $score"
        tvClass2.text = "Class: $userClass"
        tvRanking2.text = "Ranking: $ranking"
        tvLevel2.text = "Level: $level"
    }
}