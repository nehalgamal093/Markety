package com.example.markety.features.Home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.markety.R
import com.example.markety.features.Home.data.models.Product
import com.example.markety.ui.theme.Grey
import com.example.markety.ui.theme.Grey10
import com.example.markety.ui.theme.Pink100
import com.example.markety.ui.theme.White


@Composable
fun ProductCard(product: Product) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
            ),
        colors = CardDefaults.cardColors(
            containerColor = White
        ),

        ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Rating()
            Spacer(modifier = Modifier.height(10.dp))
            ProductImage(image = product.image)
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                product.title,
                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.W700)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                product.description,
                style = MaterialTheme.typography.labelSmall.copy(color = Grey10),
                softWrap = true,
                maxLines = 2
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Text(
                    "\$ ${product.price}",
                    style = MaterialTheme.typography.labelMedium.copy(color = Pink100)
                )
                Box(
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)
                        .clip(CircleShape)
                        .background(Pink100),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.add),
                        contentDescription = "add",
                        alignment = Alignment.Center
                    )
                }
            }
        }
    }
}

@Composable
fun ProductImage(image: Int) {
    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.product1),
            contentDescription = "product1",
            alignment = Alignment.Center

        )
    }
}

@Composable
fun Rating() {
    Row() {
        Image(painter = painterResource(id = R.drawable.star), contentDescription = "star")
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "3.8", style = MaterialTheme.typography.bodySmall)
    }
}