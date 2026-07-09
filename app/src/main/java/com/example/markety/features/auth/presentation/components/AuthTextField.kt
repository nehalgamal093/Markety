package com.example.markety.features.auth.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AuthTextField(){
    var text by remember {
        mutableStateOf("")
    }
    var passwordVisible by remember{
        mutableStateOf(false)
    }
    OutlinedTextField(
        value = text,
        onValueChange = {text = it},
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        label = {
            Text(text = "Email")
        },
        placeholder = {
            Text(text = "Enter your email")
        },
        singleLine = true,
        maxLines = 1,
        shape = RoundedCornerShape(16.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color(0xFFF6F6F6),
            unfocusedBorderColor = Color(0xFFF6F6F6),

        )

    )
}