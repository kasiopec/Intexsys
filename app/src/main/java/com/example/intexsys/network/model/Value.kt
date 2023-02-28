package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class Value(
    @SerializedName("title")
    val title: String,
    @SerializedName("uom")
    val uom: String
)