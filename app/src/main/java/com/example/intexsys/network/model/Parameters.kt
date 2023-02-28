package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("%anchorTag%")
    val anchorTag: AnchorTag?
)