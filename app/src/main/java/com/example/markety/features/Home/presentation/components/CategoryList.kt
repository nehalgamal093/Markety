package com.example.markety.features.Home.presentation.components
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import com.example.markety.R
import com.example.markety.features.Home.data.models.Category


@Composable
fun CategoryList() {
    val categories = listOf<Category>(
        Category(image = R.drawable.burger, "Burger"),
        Category(image = R.drawable.pizza, "Pizza"),
        Category(image = R.drawable.hot_dog, "Sandwiches"),
    )
    var selectedTab by remember {
        mutableIntStateOf(0)
    }
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        itemsIndexed(categories) { index, tab ->
            CategoryTab(
                image = categories[index].image,
                title = categories[index].title,
                isSelected = index == selectedTab,
                click = {
                    selectedTab = index
                }
            )


        }
    }
}