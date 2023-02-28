package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class ElementDimensions(
    @SerializedName("height")
    val height: Int,
    @SerializedName("width")
    val width: Int
)