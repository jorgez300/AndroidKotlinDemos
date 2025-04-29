package com.demo.mvvmsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.demo.mvvmsample.core.navigation.NavigationHelper
import com.demo.mvvmsample.screens.Login.LoginScreen
import com.demo.mvvmsample.screens.Login.LoginViewModel
import com.demo.mvvmsample.ui.theme.MVVMSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MVVMSampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavigationHelper(this@MainActivity)

                    //LoginScreen(loginViewModel)
                }
            }
        }
    }
}
