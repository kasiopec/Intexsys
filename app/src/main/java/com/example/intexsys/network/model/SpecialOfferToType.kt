package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class SpecialOfferToType(
    @SerializedName("is_best_rated")
    val isBestRated: String,
    @SerializedName("is_buy_direct")
    val isBuyDirect: String,
    @SerializedName("is_clearance")
    val isClearance: String,
    @SerializedName("is_coupon")
    val isCoupon: String,
    @SerializedName("is_extra_cashback")
    val isExtraCashback: String,
    @SerializedName("is_final_sale")
    val isFinalSale: String,
    @SerializedName("is_free_gift")
    val isFreeGift: String,
    @SerializedName("is_instant_rebate")
    val isInstantRebate: String,
    @SerializedName("is_killer_deal")
    val isKillerDeal: String,
    @SerializedName("is_mail_in_rebate")
    val isMailInRebate: String,
    @SerializedName("is_members_only")
    val isMembersOnly: String,
    @SerializedName("is_new")
    val isNew: String,
    @SerializedName("is_sale")
    val isSale: String,
    @SerializedName("is_seasonal")
    val isSeasonal: String,
    @SerializedName("is_second_day_air")
    val isSecondDayAir: String
)