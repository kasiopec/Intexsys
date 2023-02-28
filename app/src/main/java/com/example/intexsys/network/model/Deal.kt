package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class Deal(
    @SerializedName("badgeColor")
    val badgeColor: BadgeColor,
    @SerializedName("badgeName")
    val badgeName: String,
    @SerializedName("badgePopupText")
    val badgePopupText: String,
    @SerializedName("canAddQna")
    val canAddQna: Boolean,
    @SerializedName("canAddReview")
    val canAddReview: Boolean,
    @SerializedName("canCompare")
    val canCompare: Boolean,
    @SerializedName("description")
    val description: String,
    @SerializedName("header")
    val header: String,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("promoType")
    val promoType: String,
    @SerializedName("showBadge")
    val showBadge: Boolean,
    @SerializedName("tabName")
    val tabName: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("typeSlug")
    val typeSlug: String
)