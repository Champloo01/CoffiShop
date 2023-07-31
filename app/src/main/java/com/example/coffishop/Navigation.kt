package com.example.coffishop

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.coffishop.ui.theme.CoffiShop

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.CoffiShop.route){
        composable(route = Screen.CoffiShop.route){
            CoffiShop()
        }
        composable(route = Screen.LidaCoffiShop.route){
            LidaCoffiShop()
        }
    }
}



