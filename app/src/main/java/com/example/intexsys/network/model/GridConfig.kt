package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class GridConfig(
    @SerializedName("size")
    val size: Int
)