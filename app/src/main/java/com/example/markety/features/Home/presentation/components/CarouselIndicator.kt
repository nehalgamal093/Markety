package com.example.markety.features.Home.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.markety.ui.theme.Grey
import com.example.markety.ui.theme.Orange

@Composable
fun CarouselIndicator(count: Int, currentIndex: Int) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        repeat(count) { index ->
            Box(
                modifier = Modifier
                    .padding(4.dp)
                    .size(8.dp)
                    .background(
                        color = if (currentIndex == index) Orange else Grey,
                        shape = CircleShape
                    )
            )
        }

    }
}