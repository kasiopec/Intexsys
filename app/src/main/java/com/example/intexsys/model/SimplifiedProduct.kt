package com.example.intexsys.model

@kotlinx.serialization.Serializable
data class SimplifiedProduct(
    val name: String,
    val imageUrl: String,
    val price: Double,
    val description: String
)
