package com.app.dashboardui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen(modifier: Modifier = Modifier) {
    // Step 2: Create a list of items for the dashboard
    val dashboardItems = listOf(
        DashboardItem(1, Icons.Default.Home, "Home"),
        DashboardItem(2, Icons.Default.Info, "About Us"),
        DashboardItem(3,  Icons.Default.ShoppingCart, "Products"),
        DashboardItem(4, Icons.Default.Notifications, "Notifications"),
        DashboardItem(5, Icons.Default.Call, "Contact"),
        DashboardItem(6, Icons.Default.Lock, "Change Password"),
        DashboardItem(7, Icons.Default.AccountCircle, "Account"),
        DashboardItem(8, Icons.Default.ExitToApp, "Logout")
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Text(
            text = "Dashboard UI",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Step 3: Create a grid layout for the dashboard items
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(dashboardItems) { item ->
                DashboardCard(item)
            }
        }
    }
}
