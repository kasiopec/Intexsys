package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class GridProducts(
    @SerializedName("elements")
    val elements: List<Element>,
    @SerializedName("headingName")
    val headingName: String,
    @SerializedName("url")
    val url: String
)