package com.example.markety.core.navigation
import androidx.navigation.compose.NavHost
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.markety.core.constants.Routes
import com.example.markety.features.Home.presentation.HomeScreen
import com.example.markety.features.Main.MainScreen
import com.example.markety.features.ProductDetails.presentation.screens.ProductDetailsScreen
import com.example.markety.features.auth.presentation.AuthScreen
import com.example.markety.features.onboarding.presentation.OnBoardingScreen
import com.example.markety.features.ordersuccess.presentation.screens.OrderSuccessScreen
import com.example.markety.features.profile.presentation.screens.ProfileScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController();

    NavHost(navController=navController,startDestination = Routes.Profile){
    composable(Routes.OnBoarding) {
        OnBoardingScreen(navController = navController)
    }
        composable(Routes.Main) {
            MainScreen(navController = navController)
        }

        composable (Routes.Auth){
            AuthScreen(navController = navController)
        }
        composable (Routes.ProductDetails){
            ProductDetailsScreen(navController = navController)
        }
        composable (Routes.OrderSuccess){
            OrderSuccessScreen(navController = navController)
        }
        composable (Routes.Profile){
            ProfileScreen(navController = navController)
        }
    }

}