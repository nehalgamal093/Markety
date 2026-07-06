package com.example.markety

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.markety.core.navigation.AppNavigation
import com.example.markety.features.onboarding.presentation.OnBoardingScreen
import com.example.markety.ui.theme.MarketyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MarketyTheme {
                AppNavigation()
                }
            }
        }
    }


