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
import com.example.markety.features.ProductDetails.presentation.components.TopBar
import com.example.markety.ui.theme.Grey5
import com.example.markety.ui.theme.Pink5


@Composable
fun ProductDetailsScreen(navController: NavController) {


Column(modifier = Modifier.fillMaxSize()) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(.5f)) {
        Image(
            painter = painterResource(R.drawable.productdetails),
            contentDescription = "Product Details",
            modifier = Modifier.fillMaxSize()
        )
        Column(verticalArrangement = Arrangement.Center, modifier = Modifier.padding(16.dp)) {
            Spacer(modifier = Modifier.height(40.dp))
            TopBar()
        }

    }
    Box(modifier = Modifier.padding(16.dp)) {
        Column() {
            ToolsBar()
            Text(text = "Chicken Burger\n" +
                    "Promo Pack", style = MaterialTheme.typography.labelLarge)
        }
    }
}
}

@Composable
fun ToolsBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(color = Pink5)
                .padding(horizontal = 16.dp, vertical = 10.dp)
        ) {
            Text(text = "Popular")
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