package com.example.intexsys.network.model


import com.google.gson.annotations.SerializedName

data class TopSpecification(
    @SerializedName("count")
    val count: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("specification_id")
    val specificationId: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("values")
    val values: List<Value>
)