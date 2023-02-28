package com.example.intexsys.repository

import com.example.intexsys.model.SimplifiedProduct
import com.example.intexsys.network.IntexsysService
import com.example.intexsys.network.model.Category
import com.example.intexsys.network.model.Element
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(private val intexsysApi: IntexsysService) : MainRepository {
    override suspend fun getCategories(): List<Category> {
        return intexsysApi.categories()
    }

    override suspend fun getProducts(identifierUrl: String): List<Element> {
        return intexsysApi.getSubcategory(identifierUrl).gridProducts.elements
    }

    override fun getProductInfo(element: Element, identifierUrl: String): SimplifiedProduct {
        return element.toSimplifiedProduct(identifierUrl)
    }

    private fun Element.toSimplifiedProduct(identifierUrl: String): SimplifiedProduct {
        val baseUrl = "http://images1.opticsplanet.com/365-240-ffffff/"
        val imageExtension = ".jpg"
        return SimplifiedProduct(
            name = this.shortName ?: "shortName",
            price = this.price,
            description = "I would show description here, but your data is very not user friendly. " +
                    "You also didn't provide anything like swagger where I can check all the necessary data structure." +
                    "\nI have tried postman and generating data classes from the plugin," +
                    " but it misses a lot of stuff.\nSo here is just url of the product that I would use to get product details: $identifierUrl",
            imageUrl = "$baseUrl${this.primaryImage}$imageExtension"
        )
    }
}