package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class Element(
    @SerializedName("allVariantsAreOutlet")
    val allVariantsAreOutlet: Boolean,
    @SerializedName("allVariantsAreShed")
    val allVariantsAreShed: Boolean,
    @SerializedName("anchorText")
    val anchorText: String,
    @SerializedName("brand")
    val brand: Brand,
    @SerializedName("brandCategories")
    val brandCategories: List<Any>,
    @SerializedName("brandName")
    val brandName: String,
    @SerializedName("bundleData")
    val bundleData: List<Any>,
    @SerializedName("buyQtyLimit")
    val buyQtyLimit: Int,
    @SerializedName("buyQtyLimitStartAt")
    val buyQtyLimitStartAt: Int,
    @SerializedName("canAddQna")
    val canAddQna: Boolean,
    @SerializedName("canAddReview")
    val canAddReview: Boolean,
    @SerializedName("canCompare")
    val canCompare: Boolean,
    @SerializedName("categories")
    val categories: List<CategoryX>,
    @SerializedName("categoryName")
    val categoryName: String,
    @SerializedName("clearanceVariantCount")
    val clearanceVariantCount: Int,
    @SerializedName("deals")
    val deals: List<Deal>,
    @SerializedName("elementDimensions")
    val elementDimensions: ElementDimensions,
    @SerializedName("fullName")
    val fullName: String,
    @SerializedName("gaEcommerceName")
    val gaEcommerceName: String,
    @SerializedName("gridItemName")
    val gridItemName: String,
    @SerializedName("gridName")
    val gridName: String,
    @SerializedName("hasOptions")
    val hasOptions: Int,
    @SerializedName("hasVideo")
    val hasVideo: Boolean,
    @SerializedName("highlightedDescription")
    val highlightedDescription: List<Any>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("imageHeight")
    val imageHeight: String,
    @SerializedName("imageWidth")
    val imageWidth: String,
    @SerializedName("isBuyDirect")
    val isBuyDirect: Boolean,
    @SerializedName("isCallToOrder")
    val isCallToOrder: Int,
    @SerializedName("isMadeInUsa")
    val isMadeInUsa: Int,
    @SerializedName("isMembersOnly")
    val isMembersOnly: Boolean,
    @SerializedName("isOrderable")
    val isOrderable: Boolean,
    @SerializedName("isOutlet")
    val isOutlet: Boolean,
    @SerializedName("isPriceAfterRebate")
    val isPriceAfterRebate: Boolean,
    @SerializedName("isSaveExact")
    val isSaveExact: Boolean,
    @SerializedName("isSavingExact")
    val isSavingExact: Boolean,
    @SerializedName("isSegmentSalePriceHidden")
    val isSegmentSalePriceHidden: Boolean,
    @SerializedName("isShed")
    val isShed: Boolean,
    @SerializedName("itemFlag")
    val itemFlag: String?,
    @SerializedName("killerDealVariantCount")
    val killerDealVariantCount: Int,
    @SerializedName("listPrice")
    val listPrice: Double,
    @SerializedName("mainCategory")
    val mainCategory: MainCategory,
    @SerializedName("matchedVariantCount")
    val matchedVariantCount: Int,
    @SerializedName("maximumPricePerUom")
    val maximumPricePerUom: Double?,
    @SerializedName("minimumPricePerUom")
    val minimumPricePerUom: Double,
    @SerializedName("minimumPriceUomLabel")
    val minimumPriceUomLabel: String,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("price")
    val price: Double,
    @SerializedName("priceFlag")
    val priceFlag: String?,
    @SerializedName("primaryImage")
    val primaryImage: String,
    @SerializedName("productCode")
    val productCode: String,
    @SerializedName("productId")
    val productId: Int,
    @SerializedName("promotion")
    val promotion: Promotion,
    @SerializedName("reviewCount")
    val reviewCount: Int,
    @SerializedName("reviewRating")
    val reviewRating: String,
    @SerializedName("ribbonPriority")
    val ribbonPriority: String?,
    @SerializedName("saveAmount")
    val saveAmount: Double,
    @SerializedName("savePercent")
    val savePercent: Int,
    @SerializedName("savingsText")
    val savingsText: String,
    @SerializedName("shortName")
    val shortName: String?,
    @SerializedName("showAsLowAs")
    val showAsLowAs: Boolean,
    @SerializedName("specialOffers")
    val specialOffers: SpecialOffers,
    @SerializedName("stores")
    val stores: List<Any>,
    @SerializedName("topSpecifications")
    val topSpecifications: List<TopSpecification>,
    @SerializedName("url")
    val url: String,
    @SerializedName("variantCount")
    val variantCount: Int,
    @SerializedName("variantCountText")
    val variantCountText: Int
)