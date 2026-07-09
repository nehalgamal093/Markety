package com.example.markety.features.auth.presentation.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.markety.features.auth.presentation.components.AuthButton
import com.example.markety.features.auth.presentation.components.AuthTextField

@Composable
fun LoginTab(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        AuthTextField()
        Spacer(Modifier.height(20.dp))
        AuthTextField()
        Spacer(Modifier.height(50.dp))
        AuthButton()

    }
}

