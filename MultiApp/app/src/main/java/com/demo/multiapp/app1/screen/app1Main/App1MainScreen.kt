package com.demo.multiapp.app1.screen.app1Main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun App1MainScreen(navController: NavController, patente: String? = "") {

    Column(){

        Spacer(modifier = Modifier.height(20.dp))

        Text("App1MainScreen:  $patente")

        Spacer(modifier = Modifier.height(5.dp))

    }

}