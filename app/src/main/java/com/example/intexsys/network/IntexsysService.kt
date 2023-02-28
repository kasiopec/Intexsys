package com.example.intexsys.network

import com.example.intexsys.network.model.Category
import com.example.intexsys.network.model.Product
import com.example.intexsys.network.model.Subcategory
import retrofit2.http.GET
import retrofit2.http.Path

interface IntexsysService {
    @GET("api/0.2/categories")
    suspend fun categories(): List<Category>


    @GET("iv-api/0.3/catalog/{identifier}/products?_iv_include=gridProducts")
    suspend fun getSubcategory(
        @Path("identifier") identifierUrl: String,
    ): Subcategory

    @GET("api/0.3/products/{identifier}")
    suspend fun productInfo(
        @Path("identifier") identifierUrl: String,
    ): Product
}
