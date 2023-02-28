package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class BadgeColor(
    @SerializedName("b")
    val b: Int,
    @SerializedName("g")
    val g: Int,
    @SerializedName("hex")
    val hex: String,
    @SerializedName("r")
    val r: Int
)