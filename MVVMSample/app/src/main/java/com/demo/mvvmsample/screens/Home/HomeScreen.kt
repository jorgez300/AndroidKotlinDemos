package com.demo.mvvmsample.screens.Home

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
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,

        ) {
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { Log.d(TAG, "HomeScreen: ") }) {
            Text("Hola")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { Log.d(TAG, "HomeScreen: ") }) {
            Text("Hola")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { Log.d(TAG, "HomeScreen: ") }) {
            Text("Hola")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { Log.d(TAG, "HomeScreen: ") }) {
            Text("Hola")
        }
        Spacer(modifier = Modifier.height(16.dp))
    }


}