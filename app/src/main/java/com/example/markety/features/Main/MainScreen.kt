package com.example.markety.features.Main
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.markety.R
import com.example.markety.ui.theme.Black
import com.example.markety.ui.theme.Pink10
import com.example.markety.ui.theme.Pink100
import com.example.markety.ui.theme.Pink5
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
            NavigationBar(containerColor = White) {

                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItem == index,
                        colors =  NavigationBarItemDefaults.colors(

                            selectedIconColor = Pink100,

                            unselectedIconColor = Pink10,

                            selectedTextColor = Black,

                            indicatorColor = Pink5
                        ),
                        alwaysShowLabel = false,
                        onClick = {
                            selectedItem = index
                        },
                        icon = {
                            when (index) {
                                0 -> Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.home),
                                        contentDescription = "Home"
                                    )

                                    if(selectedItem==index){
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(text =  "Home",style = MaterialTheme.typography.titleSmall.copy(color = Black))
                                    }
                                }

                                1 -> Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.profile),
                                        contentDescription = "Profile"
                                    )
                                    if(selectedItem==index){
                                        Text(text =  "Profile")
                                    }


                                }

                                2 -> Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.cart),
                                        contentDescription = "Cart"
                                    )
                                    if(selectedItem == index){
                                        Text("Cart")
                                    }

                                }
                            }
                        },
                        label = {

                        }

                    )
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

                0 -> Text("Home Screen")

                1 -> Text("Search Screen")

                2 -> Text("Profile Screen")
            }
        }
    }
}