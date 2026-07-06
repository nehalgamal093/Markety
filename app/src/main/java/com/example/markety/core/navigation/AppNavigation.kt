package com.example.markety.core.navigation
import androidx.navigation.compose.NavHost
import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.markety.core.constants.Routes
import com.example.markety.features.Home.presentation.HomeScreen
import com.example.markety.features.onboarding.presentation.OnBoardingScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController();

    NavHost(navController=navController,startDestination = Routes.OnBoarding){
    composable(Routes.OnBoarding) {
        OnBoardingScreen(navController = navController)
    }
        composable(Routes.Home) {
            HomeScreen(navController = navController)
        }
    }

}