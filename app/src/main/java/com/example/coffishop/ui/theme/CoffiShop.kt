package com.example.coffishop.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.coffishop.CSC
import com.example.coffishop.CoffiShopCreator
import com.example.coffishop.R
import com.example.coffishop.Screen

@Composable
fun CoffiShop() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center
    ){
        itemsIndexed(
            listOf(
                CSC(R.drawable.lidacoffi, "LidaCoffiShop",Screen.LidaCoffiShop, "Go to LidaCoffiShop"),
                CSC(R.drawable.minskcoffi, "MinskCoffiShop", Screen.MinskCoffiShop, "Go to MinskCoffiShop")
            )
        ){_,item ->
            CoffiShopCreator(item = item, navController = null)
        }
    }
}