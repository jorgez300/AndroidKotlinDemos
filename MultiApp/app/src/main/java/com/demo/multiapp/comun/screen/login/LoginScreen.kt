package com.demo.multiapp.comun.screen.login

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.demo.multiapp.navigation.*

@Composable
fun LoginScreen(navController: NavController,) {

    val TAG = "LoginScreen"

    Column(){

        Spacer(modifier = Modifier.height(20.dp))

        Text("Login Screen")

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            {
                Log.d(TAG, "App1MainScreen button clicked")
                navController.navigate("App1MainScreen/123456")
            }
        ){
            Text("App1MainScreen")
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            {
                Log.d(TAG, "App2MainScreen button clicked")
                navController.navigate(App2Main)
            }
        ){
            Text("App2MainScreen")
        }
    }

}