package com.example.co2tolerance.ui

import android.icu.util.Measure
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.co2tolerance.ui.screens.HomeScreen
import com.example.co2tolerance.ui.screens.MeasureScreen

@Composable
fun Navigation() {
    
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.HomeScreen) {
        composable(
            Routes.HomeScreen
        ) {
            HomeScreen(
                navController = navController
            )
        }

        composable(
            Routes.MeasureScreen
        ) {
            MeasureScreen(
                navController = navController
            )
        }
    }
    
}