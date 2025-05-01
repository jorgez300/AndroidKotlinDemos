package com.demo.sqliteroom.screens.Home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Inputs de texto
        TextField(value = texto1, onValueChange = { texto1 = it }, label = { Text("Campo 1") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = texto2, onValueChange = { texto2 = it }, label = { Text("Campo 2") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = texto3, onValueChange = { texto3 = it }, label = { Text("Campo 3") })

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

@Composable
fun MiFormulario() {


}