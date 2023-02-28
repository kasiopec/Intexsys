package com.example.intexsys.ui

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.intexsys.model.SimplifiedProduct
import com.example.intexsys.navigation.Screen
import com.example.intexsys.ui.components.Headline6
import com.example.intexsys.ui.components.TextMediumRegular
import com.example.intexsys.ui.components.VerticalSpacer
import timber.log.Timber


const val PRODUCT_BASE_URL = "http://images1.opticsplanet.com/365-240-ffffff/"

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailsScreen(
    navController: NavController,
    product: SimplifiedProduct
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CenterAlignedTopAppBar(
            title = {
                Text(text = Screen.ProductDetails.title)
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colors.background,
                titleContentColor = MaterialTheme.colors.onBackground
            ),
            navigationIcon = {
                Row(
                    modifier = Modifier.wrapContentWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Navigation icon"
                        )
                    }
                    IconButton(
                        modifier = Modifier.padding(start = 4.dp, end = 16.dp),
                        onClick = {
                            navController.popBackStack(route = Screen.Home.route, false)
                        }) {
                        Icon(
                            imageVector = Icons.Filled.Home,
                            contentDescription = "Navigation icon"
                        )
                    }
                }

            }
        )
        VerticalSpacer(height = 10.dp)

        Headline6(
            modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 16.dp),
            text = product.name,
            color = MaterialTheme.colors.onBackground
        )
        AsyncImage(
            modifier = Modifier
                .wrapContentSize()
                .padding(start = 8.dp, end = 8.dp, bottom = 16.dp, top = 8.dp),
            model = ImageRequest.Builder(LocalContext.current)
                .data(product.imageUrl)
                .crossfade(true)
                .build(),
            contentScale = ContentScale.FillBounds,
            placeholder = painterResource(R.drawable.ic_menu_report_image),
            error = painterResource(R.drawable.stat_notify_error),
            onError = {
                Timber.d("errored: ${it.result.throwable.localizedMessage}")
            },
            contentDescription = null
        )
        TextMediumRegular(
            modifier = Modifier.padding(start = 24.dp, end = 24.dp, bottom = 16.dp),
            text = "Price: ${product.price}$",
            color = MaterialTheme.colors.onBackground
        )
        TextMediumRegular(
            modifier = Modifier.padding(start = 24.dp, end = 24.dp),
            text = product.description,
            color = MaterialTheme.colors.onBackground
        )
    }
}