package com.example.intexsys.network.model

import com.google.gson.annotations.SerializedName


data class Category(
    @SerializedName("category_id") var categoryId: String? = null,
    @SerializedName("short_name") var shortName: String? = null,
    @SerializedName("full_name") var fullName: String? = null,
    @SerializedName("orderable_count") var orderableCount: String? = null,
    @SerializedName("url") var url: String? = null,
    @SerializedName("parent_id") var parentId: String? = null,
    @SerializedName("unavailable_count") var unavailableCount: String? = null,
    @SerializedName("featured") var featured: String? = null,
    @SerializedName("popularity") var popularity: String? = null
)