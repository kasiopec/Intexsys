package com.example.intexsys.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.intexsys.navigation.Screen
import com.example.intexsys.network.model.Element
import com.example.intexsys.ui.components.TextMediumRegular
import com.example.intexsys.ui.components.VerticalSpacer
import com.example.intexsys.ui.vm.MainViewModel
import com.example.intexsys.util.toJson
import timber.log.Timber

const val BASE_URL = "http://images1.opticsplanet.com/120-90-ffffff/"
const val IMG_EXT = ".jpg"

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ProductsScreen(
    viewModel: MainViewModel,
    navController: NavController,
    url: String?
) {
    var productList by remember { mutableStateOf(emptyList<Element>()) }
    LaunchedEffect(key1 = true) {
        url?.let {
            viewModel.productsFlow(url).collect {
                Timber.d("collected $it")
                productList = it
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CenterAlignedTopAppBar(
            title = {
                Text(text = Screen.Products.title)
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colors.background,
                titleContentColor = MaterialTheme.colors.onBackground
            ),
            navigationIcon = {
                IconButton(onClick = {
                    navController.popBackStack(route = Screen.Home.route, false)
                }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Navigation icon"
                    )
                }
            }
        )
        VerticalSpacer(height = 10.dp)

        TextMediumRegular(
            text = "Choose your product",
            color = MaterialTheme.colors.onBackground
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            content = {
                items(productList) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(start = 24.dp, end = 24.dp, top = 16.dp, bottom = 16.dp),
                        onClick = {
                            val simplifiedProduct = viewModel.getProductInfo(it, it.url)
                            navController.navigate(Screen.ProductDetails.route + "?product=${simplifiedProduct.toJson()}")
                        }
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            val imageUrl = BASE_URL + it.primaryImage + IMG_EXT
                            AsyncImage(
                                modifier = Modifier
                                    .wrapContentSize()
                                    .padding(start = 8.dp, end = 8.dp, bottom = 16.dp, top = 8.dp),
                                model = ImageRequest.Builder(LocalContext.current)
                                    .data(imageUrl)
                                    .crossfade(true)
                                    .build(),
                                contentScale = ContentScale.FillBounds,
                                placeholder = painterResource(android.R.drawable.ic_menu_report_image),
                                error = painterResource(android.R.drawable.stat_notify_error),
                                contentDescription = null
                            )
                            TextMediumRegular(
                                modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 16.dp),
                                text = it.fullName,
                                color = MaterialTheme.colors.onBackground
                            )
                            TextMediumRegular(
                                text = "Price: ${it.price}$",
                                color = MaterialTheme.colors.onBackground
                            )
                        }

                    }
                }
            }
        )
    }
}