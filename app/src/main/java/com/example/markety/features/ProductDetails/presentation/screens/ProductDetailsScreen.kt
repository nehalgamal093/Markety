package com.example.markety.features.ProductDetails.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.markety.R
import com.example.markety.features.ProductDetails.presentation.components.AddToCart
import com.example.markety.features.ProductDetails.presentation.components.TopBar
import com.example.markety.ui.theme.Grey10
import com.example.markety.ui.theme.Grey5
import com.example.markety.ui.theme.Pink100
import com.example.markety.ui.theme.Pink5


@Composable
fun ProductDetailsScreen(navController: NavController) {


    Column() {
        Box() {
            Image(
                painter = painterResource(R.drawable.productdetails),
                contentDescription = "Product Details",
            )
            Column(verticalArrangement = Arrangement.Center, modifier = Modifier.padding(16.dp)) {
                Spacer(modifier = Modifier.height(40.dp))
                TopBar()
            }

        }
        Box(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Column() {
                ToolsBar()
                Text(
                    text = "Chicken Burger\n" +
                            "Promo Pack", style = MaterialTheme.typography.labelLarge
                )
                Spacer(modifier = Modifier.height(30.dp))
                Row() {
                    Rating()
                    Spacer(modifier = Modifier.width(30.dp))
                    ShoppingBag()

                }
                Spacer(modifier = Modifier.height(30.dp))
                Text(text = "In a medium bowl, add ground chicken, breadcrumbs, mayonnaise, onions, parsley, garlic, paprika, salt and pepper. Use your hands to combine all the ingredients together until blended, but don't over mix.", style = MaterialTheme.typography.labelMedium)
                Spacer(modifier = Modifier.height(30.dp))
                AddToCart {  }
            }
        }
    }
}

@Composable
fun ToolsBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp)).background(color = Pink5)
                .padding(horizontal = 16.dp, vertical = 10.dp)
        ) {
            Text(text = "Popular",style = MaterialTheme.typography.labelMedium.copy(color = Pink100))
        }
        Spacer(modifier = Modifier.width(200.dp))
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .clip(CircleShape)
                .background(Pink5),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(R.drawable.location2), contentDescription = "Location")
        }
        Spacer(modifier = Modifier.width(10.dp))
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .clip(CircleShape)
                .background(Grey5),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(R.drawable.heart), contentDescription = "Location")
        }
    }
}

@Composable
fun Rating() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = R.drawable.star2), contentDescription = "star")
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "4.8", style = MaterialTheme.typography.bodyMedium.copy(color = Grey10))
    }
}

@Composable
fun ShoppingBag() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = R.drawable.shoppingbag), contentDescription = "shopping-bag")
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "7000+ Order", style = MaterialTheme.typography.bodyMedium.copy(color = Grey10))
    }
}
