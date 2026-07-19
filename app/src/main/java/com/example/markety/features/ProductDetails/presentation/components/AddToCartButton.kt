package com.example.markety.features.ProductDetails.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.markety.ui.theme.Pink100

@Composable
fun AddToCart(onClick: () -> Unit) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(65.dp)
            .clip(RoundedCornerShape(16.dp))

            .background(
                Pink100
            ),

        contentAlignment = Alignment.Center,

        ) {
        Button(
            modifier = Modifier.fillMaxSize(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.White
            ),
            onClick = onClick
        ) {
            Text(
                text = "Add to Cart",
                style = MaterialTheme.typography.titleLarge
            )


        }
    }
}