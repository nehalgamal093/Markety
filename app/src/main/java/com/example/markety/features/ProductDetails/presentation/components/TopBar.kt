package com.example.markety.features.ProductDetails.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.markety.R
import com.example.markety.ui.theme.Pink5


@Preview(showBackground = true)
@Composable
fun TopBar() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(color = Pink5)
                .padding(horizontal = 16.dp, vertical = 10.dp)
        ) {
            Image(painter = painterResource(R.drawable.arrow_back), contentDescription = "back")

        }
    }
}