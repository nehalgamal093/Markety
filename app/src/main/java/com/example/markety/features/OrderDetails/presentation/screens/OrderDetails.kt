package com.example.markety.features.OrderDetails.presentation.screens
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.markety.R
import com.example.markety.features.Home.data.models.Product
import com.example.markety.features.OrderDetails.presentation.components.CartSheet
import com.example.markety.features.OrderDetails.presentation.components.ProductCartItem

@Composable
fun OrderDetails() {
    Box(modifier = Modifier.padding(16.dp)) {
        val products = listOf<Product>(
            Product(
                title = "Chicken burger",
                rating = 3.8,
                description = "100 gr chicken + tomato + cheese  Lettuce",
                image = R.drawable.menu1,
                price = 20.00
            ),
            Product(
                title = "Chicken burger",
                rating = 3.8,
                description = "100 gr chicken + tomato + cheese  Lettuce",
                image = R.drawable.menu1,
                price = 20.00
            )

        )

        Column() {
            Text(text = "Order Details", style = MaterialTheme.typography.labelLarge)
            Spacer(modifier = Modifier.height(40.dp))
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(products) { item ->
                    ProductCartItem()

                }
                item {
                    Spacer(modifier = Modifier.height(10.dp))
                    CartSheet()

                }
            }

        }
    }
}