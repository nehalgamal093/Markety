package com.example.markety.features.OnBoardingScreen.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PageIndicator(pageCount:Int,currentPage:Int){
    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
        repeat(pageCount){
            index ->
            Box(
                modifier = Modifier.padding(4.dp).size(width= if(index == currentPage)24.dp else 10.dp, height = 10.dp).clip(
                    CircleShape
                ).background(
                    if(index == currentPage) Color(0xFF4CAF50)
                    else Color.LightGray
                )
            )
        }

    }
}