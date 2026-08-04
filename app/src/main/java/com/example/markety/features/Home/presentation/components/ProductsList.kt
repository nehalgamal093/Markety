package com.example.markety.features.Home.presentation.components

import com.example.markety.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.wear.compose.material.CircularProgressIndicator

import com.example.markety.features.Home.data.models.Product
import com.example.markety.features.Home.presentation.ViewModel.ProductViewModel

@Composable
fun ProductsList(viewModel: ProductViewModel = ProductViewModel()) {
val state = viewModel.uiState

  if(!state.isLoading)  {
      LazyVerticalGrid(
          horizontalArrangement = Arrangement.spacedBy(8.dp),
          contentPadding = PaddingValues(horizontal = 8.dp),
          columns = GridCells.Fixed(2),
          verticalArrangement = Arrangement.spacedBy(12.dp)

      ) {
          items(state.products) { item ->
              ProductCard(product = item)
          }
      }
  }
    else {
      CircularProgressIndicator()
  }
}