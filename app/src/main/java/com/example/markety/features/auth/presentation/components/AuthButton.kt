package com.example.markety.features.auth.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp



@Composable
fun AuthButton(){
    Box(
        Modifier
            .width(300.dp)
            .height(65.dp)
            .clip(RoundedCornerShape(16.dp))

            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFFD61355),
                        Color(0xFFFF0000)
                    )
                )
            ),

        contentAlignment = Alignment.Center,

    ){
        Button(
            modifier = Modifier.fillMaxSize(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.White
            ),
            onClick={

            }
        ){
            Text(
                text = "Login"
            )


}
    }
}