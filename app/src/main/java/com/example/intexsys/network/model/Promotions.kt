package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class Promotions(
    @SerializedName("killer_deal")
    val killerDeal: List<KillerDealX>
)