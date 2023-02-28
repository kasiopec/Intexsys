package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class KillerDeal(
    @SerializedName("anchor_text")
    val anchorText: String,
    @SerializedName("bundles")
    val bundles: List<Any>,
    @SerializedName("description")
    val description: String,
    @SerializedName("end")
    val end: Int,
    @SerializedName("free_gift_ids")
    val freeGiftIds: List<Any>,
    @SerializedName("h1_name")
    val h1Name: String,
    @SerializedName("is_featured")
    val isFeatured: String,
    @SerializedName("is_hidden")
    val isHidden: String,
    @SerializedName("on_product_page")
    val onProductPage: Boolean,
    @SerializedName("promotion_id")
    val promotionId: String,
    @SerializedName("removal")
    val removal: Int,
    @SerializedName("start")
    val start: Int,
    @SerializedName("time_left")
    val timeLeft: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)