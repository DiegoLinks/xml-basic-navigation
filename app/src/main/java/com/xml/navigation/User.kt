package com.xml.navigation

import java.io.Serializable

data class User(
    val name: String,
    val age: Int,
    val isSubscribe: Boolean,
    val score: Double
) : Serializable