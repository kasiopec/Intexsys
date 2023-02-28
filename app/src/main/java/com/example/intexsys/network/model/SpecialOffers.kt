package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class SpecialOffers(
    @SerializedName("anchor_text")
    val anchorText: String?,
    @SerializedName("bundles")
    val bundles: List<Any>?,
    @SerializedName("category")
    val category: CategoryX,
    @SerializedName("description")
    val description: String?,
    @SerializedName("end")
    val end: Int?,
    @SerializedName("free_gift_ids")
    val freeGiftIds: List<Any>?,
    @SerializedName("h1_name")
    val h1Name: String?,
    @SerializedName("is_best_rated")
    val isBestRated: Int,
    @SerializedName("is_clearance")
    val isClearance: Int,
    @SerializedName("is_coupon")
    val isCoupon: Int,
    @SerializedName("is_extra_cashback")
    val isExtraCashback: Int,
    @SerializedName("is_featured")
    val isFeatured: String?,
    @SerializedName("is_free_gift")
    val isFreeGift: Int,
    @SerializedName("is_hidden")
    val isHidden: String?,
    @SerializedName("is_instant_rebate")
    val isInstantRebate: Int,
    @SerializedName("is_killer_deal")
    val isKillerDeal: Int,
    @SerializedName("is_mail_in_rebate")
    val isMailInRebate: Int,
    @SerializedName("is_members_only")
    val isMembersOnly: Int,
    @SerializedName("is_new")
    val isNew: Int,
    @SerializedName("is_outlet")
    val isOutlet: Int,
    @SerializedName("is_sale")
    val isSale: Int,
    @SerializedName("is_seasonal")
    val isSeasonal: Int,
    @SerializedName("is_second_day_air")
    val isSecondDayAir: Int,
    @SerializedName("is_shed")
    val isShed: Int,
    @SerializedName("on_product_page")
    val onProductPage: Boolean?,
    @SerializedName("primary")
    val primary: String,
    @SerializedName("promotion_id")
    val promotionId: String?,
    @SerializedName("promotions")
    val promotions: Promotions,
    @SerializedName("removal")
    val removal: Int?,
    @SerializedName("special_offer_to_type")
    val specialOfferToType: SpecialOfferToType,
    @SerializedName("start")
    val start: Int?,
    @SerializedName("time_left")
    val timeLeft: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("url")
    val url: String?
)