package com.example.markety.features.Home.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.markety.features.Home.presentation.components.CarouselSlider
import com.example.markety.features.Home.presentation.components.CategoryList
import com.example.markety.features.Home.presentation.components.PopularMealMenu
import com.example.markety.features.Home.presentation.components.ProductsList
import com.example.markety.features.Home.presentation.components.SearchField
import com.example.markety.features.Home.presentation.components.TopBar

@Composable
fun HomeScreen(){
    Box(modifier = Modifier.padding(16.dp)){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            TopBar()
            Spacer(modifier = Modifier.height(5.dp))
            SearchField()
            Spacer(modifier = Modifier.height(2.dp))
            CarouselSlider()
            Spacer(modifier = Modifier.height(3.dp))
            CategoryList()
            Spacer(modifier = Modifier.height(5.dp))
            ProductsList()
            Spacer(modifier = Modifier.height(5.dp))
            PopularMealMenu()

        }
    }
}

