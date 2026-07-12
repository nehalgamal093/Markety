package com.example.markety.features.auth.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
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
fun AuthTextField(label:String,hint:String){
    var text by remember {
        mutableStateOf("")
    }
    var passwordVisible by remember{
        mutableStateOf(false)
    }
    Column(modifier = Modifier.fillMaxWidth().padding(end = 16.dp, start = 16.dp, top = 16.dp)) {
        Text(text = label, style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(15.dp))
        OutlinedTextField(
            value = text,
            onValueChange = {text = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = label)
            },
            placeholder = {
                Text(text = hint)
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

}