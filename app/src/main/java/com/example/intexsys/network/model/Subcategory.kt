package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class Subcategory(
    @SerializedName("directDeals")
    val directDeals: List<Any>,
    @SerializedName("enablePriceRange")
    val enablePriceRange: Boolean,
    @SerializedName("enablePriceRangeSlider")
    val enablePriceRangeSlider: Boolean,
    @SerializedName("enableRatings")
    val enableRatings: Boolean,
    @SerializedName("filtered")
    val filtered: Int,
    @SerializedName("filtered_variants")
    val filteredVariants: Int,
    @SerializedName("grid_config")
    val gridConfig: GridConfig,
    @SerializedName("gridProducts")
    val gridProducts: GridProducts,
    @SerializedName("grid_size")
    val gridSize: Int,
    @SerializedName("gridType")
    val gridType: String,
    @SerializedName("listPageGridType")
    val listPageGridType: String,
    @SerializedName("showPricePerUomRange")
    val showPricePerUomRange: Boolean,
    @SerializedName("showPriceRange")
    val showPriceRange: Boolean,
    @SerializedName("showPriceRangeSlider")
    val showPriceRangeSlider: Boolean,
    @SerializedName("showRatings")
    val showRatings: Boolean,
    @SerializedName("total")
    val total: Int,
    @SerializedName("total_variants")
    val totalVariants: Int
)