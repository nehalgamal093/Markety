package com.example.markety.features.Home.presentation.components

import com.example.markety.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

import com.example.markety.features.Home.data.models.Product

@Composable
fun ProductsList() {
    val products = listOf<Product>(
        Product(
            title = "Chicken burger",
            rating = 3.8,
            description = "100 gr chicken + tomato + cheese  Lettuce",
            image = R.drawable.product1,
            price = 20.00
        ),
        Product(
            title = "Chicken burger",
            rating = 3.8,
            description = "100 gr chicken + tomato + cheese  Lettuce",
            image = R.drawable.product1,
            price = 20.00
        )

    )
    LazyVerticalGrid(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 8.dp),
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(12.dp)

    ) {
        items(items = products) { item ->
            ProductCard(product = item)
        }
    }
}