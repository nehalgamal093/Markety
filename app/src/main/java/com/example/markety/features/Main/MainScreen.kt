package com.example.markety.features.Main
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.markety.R
import com.example.markety.features.Home.presentation.HomeScreen
import com.example.markety.features.Main.components.ItemNavBar
import com.example.markety.ui.theme.Black
import com.example.markety.ui.theme.Pink10
import com.example.markety.ui.theme.Pink100
import com.example.markety.ui.theme.White

@Composable
fun MainScreen(navController: NavController) {
    var selectedItem by remember {
        mutableIntStateOf(0)
    }
    val items = listOf("Home", "Search", "Profile")

    Scaffold(
        containerColor = White,
        bottomBar = {
            CompositionLocalProvider(LocalRippleConfiguration provides null) {
                NavigationBar(containerColor = White) {

                    items.forEachIndexed { index, item ->
                        NavigationBarItem(

                            selected = selectedItem == index,
                            colors =  NavigationBarItemDefaults.colors(

                                selectedIconColor = Pink100,

                                unselectedIconColor = Pink10,

                                selectedTextColor = Black,

                                indicatorColor = Color.Transparent
                            ),
                            alwaysShowLabel = false,
                            onClick = {
                                selectedItem = index
                            },
                            icon = {
                                when (index) {
                                    0 -> ItemNavBar(selectedItem==index,"Home",R.drawable.home)

                                    1 -> ItemNavBar(selectedItem==index,"Profile",R.drawable.profile)


                                    2 -> ItemNavBar(selectedItem==index,"Cart", R.drawable.cart)

                                }
                            },
                            label = {

                            }

                        )
                    }
                }
            }

        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {

            when (selectedItem) {

                0 -> HomeScreen()

                1 -> Text("Search Screen")

                2 -> Text("Profile Screen")
            }
        }
    }
}