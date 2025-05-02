package com.demo.foregroundservices.screens.Home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {

    val TAG = "HomeScreen"

    Column(
        modifier = Modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(16.dp))

        // Botones
        Button(onClick = { /* Acción botón 1 */ }) {
            Text("Botón 1")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { /* Acción botón 2 */ }) {
            Text("Botón 2")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { /* Acción botón 3 */ }) {
            Text("Botón 3")
        }
    }


}
