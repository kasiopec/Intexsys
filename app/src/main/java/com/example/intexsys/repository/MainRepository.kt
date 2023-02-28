package com.example.intexsys.repository

import com.example.intexsys.model.SimplifiedProduct
import com.example.intexsys.network.model.Category
import com.example.intexsys.network.model.Element

interface MainRepository {
    suspend fun getCategories(): List<Category>
    suspend fun getProducts(identifierUrl: String): List<Element>
    fun getProductInfo(element: Element, identifierUrl: String): SimplifiedProduct
}