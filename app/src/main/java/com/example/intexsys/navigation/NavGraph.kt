package com.example.intexsys.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.intexsys.model.SimplifiedProduct
import com.example.intexsys.ui.HomeScreen
import com.example.intexsys.ui.ProductDetailsScreen
import com.example.intexsys.ui.ProductsScreen
import com.example.intexsys.ui.vm.MainViewModel
import com.example.intexsys.util.fromJson

@Composable
fun NavGraph(navController: NavHostController, viewModel: MainViewModel) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
    ) {
        composable(route = Screen.Home.route) { HomeScreen(viewModel = viewModel, navController = navController) }

        composable(
            route = "${Screen.Products.route}?url={url}",
            arguments = listOf(
                navArgument("url") {
                    type = NavType.StringType
                    nullable = false
                }
            )) { backStackEntry ->
            ProductsScreen(
                viewModel = viewModel,
                navController = navController,
                url = backStackEntry.arguments?.getString("url")
            )
        }

        composable(
            route = "${Screen.ProductDetails.route}?product={product}",
            arguments = listOf(navArgument("product") {
                type = NavType.StringType
            })
        ) { backStackEntry ->

            backStackEntry.arguments?.getString("product")?.let { jsonString ->
                val product = jsonString.fromJson(SimplifiedProduct::class.java)
                ProductDetailsScreen(
                    navController = navController,
                    product = product

                )
            }
        }
    }
}