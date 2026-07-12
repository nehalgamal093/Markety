package com.example.markety.features.auth.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.markety.R
import com.example.markety.ui.theme.Black
import com.example.markety.ui.theme.Grey

@Composable
fun GoogleAuthButton(){
    Box(
        Modifier
            .width(300.dp)
            .height(65.dp)
            .clip(RoundedCornerShape(16.dp))

            .background(
                color = Grey
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
            Row(

            ) {
                Image(
                    painter = painterResource(R.drawable.google),
                    contentDescription = "Google",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(Modifier.width(10.dp))
                Text(
                    text = "Login with Google", style = MaterialTheme.typography.bodyLarge.copy(color = Black)
                )
            }


        }
    }
}