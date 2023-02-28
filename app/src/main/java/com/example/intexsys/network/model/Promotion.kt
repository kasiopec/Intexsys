package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class Promotion(
    @SerializedName("killer_deal")
    val killerDeal: KillerDeal
)