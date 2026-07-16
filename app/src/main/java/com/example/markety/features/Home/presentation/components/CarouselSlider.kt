package com.example.markety.features.Home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.pager.HorizontalPager
import androidx.wear.compose.foundation.pager.rememberPagerState
import com.example.markety.R

@Composable
fun CarouselSlider() {
    val images = listOf(
        R.drawable.banner,
        R.drawable.banner,
        R.drawable.banner
    )
    val pagerState = rememberPagerState(
        pageCount = { images.size }
    )

    Column() {
        HorizontalPager(state = pagerState, modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)) { page ->
            Image(
                painter = painterResource(id = images[page]), contentDescription = "banner",
                modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Fit
            )


        }
        CarouselIndicator(images.size,pagerState.currentPage)
    }
}