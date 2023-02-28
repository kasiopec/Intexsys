package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class MainCategory(
    @SerializedName("lev")
    val lev: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("popularity")
    val popularity: String,
    @SerializedName("url")
    val url: String
)