package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class AnchorTag(
    @SerializedName("absolute")
    val absolute: Boolean,
    @SerializedName("attributes")
    val attributes: Attributes?,
    @SerializedName("text")
    val text: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)