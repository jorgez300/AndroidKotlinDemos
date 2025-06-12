package com.demo.multiapp.comun.screen.login

import android.util.Log
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.demo.multiapp.comun.ComunGraph
import com.demo.multiapp.navigation.*

@Composable
fun LoginScreen() {

    val TAG = "LoginScreen"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {

        Spacer(modifier = Modifier.height(20.dp))

        Text("Login Screen")

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            modifier = Modifier,
            onClick = {
                Log.d(TAG, "App1MainScreen button clicked")
                ComunGraph.navController.navigate(App1Main)
            }
        ) {
            Text("App1MainScreen")
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            {
                Log.d(TAG, "App2MainScreen button clicked")
                ComunGraph.navController.navigate(App2Main)
            }
        ) {
            Text("App2MainScreen")
        }
    }

}

@Preview(showBackground = true, device = "id:pixel_5", showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}