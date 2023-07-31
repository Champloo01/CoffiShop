package com.example.coffishop

sealed class Screen(val route: String) {
    object CoffiShop : Screen("CoffiShop")
    object LidaCoffiShop : Screen("LidaCoffiShop")
    object MinskCoffiShop : Screen("MinskCoofiShop")
}
