package com.example.markety.features.onboarding.presentation.components
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PageIndicator(pageCount:Int,currentPage:Int){
    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
        repeat(pageCount){

            index ->
            val width by animateDpAsState(
                targetValue = if (index == currentPage) 24.dp else 10.dp,
                animationSpec = tween(
                    durationMillis = 600,
                    easing = FastOutSlowInEasing
                ),
                label = "IndicatorWidth"
            )
            Box(
                modifier = Modifier.padding(4.dp).size(width= width, height = 10.dp).clip(
                    CircleShape
                ).background(
                    if(index == currentPage) Color(0xFFD61355)
                    else Color.LightGray
                )
            )
        }

    }
}