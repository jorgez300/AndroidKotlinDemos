package com.demo.foregroundservices.core.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.demo.foregroundservices.MainActivity
import com.demo.foregroundservices.screens.Detail.DetailScreen
import com.demo.foregroundservices.screens.Detail.DetailViewModel
import com.demo.foregroundservices.screens.Home.HomeScreen
import com.demo.foregroundservices.screens.Login.LoginScreen
import com.demo.foregroundservices.screens.Login.LoginViewModel
import com.demo.foregroundservices.screens.Setting.SettingScreen


@Composable
fun NavigationHelper(mainActivity: MainActivity, paddingValues: PaddingValues) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Login) {
        composable<Home> {
            HomeScreen()// { screen -> navigateTo(screen, navController) }
        }

        composable<Login> {
            LoginScreen()

        }

        composable<Detail> {
            DetailScreen(
                //navigateTo = { screen -> navigateTo(screen, navController) },
                viewModel = DetailViewModel()
            )

        }

        composable<Setting> {
            SettingScreen() //{ screen -> navigateTo(screen, navController) }
        }
    }

}


fun navigateTo(screen: Any, navController: NavHostController) {

    when (screen) {
        is Login -> {
            navController.navigate(screen) {
                popUpTo(Login) {
                    inclusive = true
                }
            }
        }

        is Back -> navController.popBackStack()
        else -> navController.navigate(screen)
    }

}