package com.example.intexsys.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.intexsys.navigation.Screen
import com.example.intexsys.network.model.Category
import com.example.intexsys.ui.components.TextMediumRegular
import com.example.intexsys.ui.components.VerticalSpacer
import com.example.intexsys.ui.vm.MainViewModel
import timber.log.Timber

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(
    viewModel: MainViewModel,
    navController: NavController
) {

    var categoryList by remember { mutableStateOf(emptyList<Category>()) }

    LaunchedEffect(key1 = true) {
        viewModel.categoriesFlow.collect {
            categoryList = it
            Timber.d("collected: $it")
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        VerticalSpacer(height = 10.dp)

        TextMediumRegular(
            text = "Choose your category",
            color = MaterialTheme.colors.onBackground
        )
       
        VerticalSpacer(height = 10.dp)

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            content = {
                items(categoryList) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(start = 24.dp, end = 24.dp, top = 16.dp, bottom = 16.dp),
                        onClick = {
                            navController.navigate(route = Screen.Products.route + "?url=${it.url}")
                        }
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            TextMediumRegular(
                                text = it.shortName ?: "",
                                color = MaterialTheme.colors.onBackground
                            )
                        }

                    }
                }
            }
        )
    }


}