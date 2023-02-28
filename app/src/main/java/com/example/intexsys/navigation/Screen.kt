package com.example.intexsys.navigation

sealed class Screen(var route: String, var title: String) {
    object Home : Screen("home_screen", "Home")
    object Products : Screen("products_screen", "Products")
    object ProductDetails : Screen("produtct_details_screen", "Product Details")
}