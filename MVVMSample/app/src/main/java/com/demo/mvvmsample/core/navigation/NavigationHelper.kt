package com.demo.mvvmsample.core.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.demo.mvvmsample.MainActivity
import com.demo.mvvmsample.screens.Detail.DetailScreen
import com.demo.mvvmsample.screens.Detail.DetailViewModel
import com.demo.mvvmsample.screens.Home.HomeScreen
import com.demo.mvvmsample.screens.Login.LoginScreen
import com.demo.mvvmsample.screens.Login.LoginViewModel
import com.demo.mvvmsample.screens.Setting.SettingScreen


@Composable
fun NavigationHelper(mainActivity: MainActivity) {
    val navController = rememberNavController()

    //val loginViewModel:LoginViewModel = viewModel()
    NavHost(navController = navController, startDestination = Login) {
        composable<Home> {
            HomeScreen()// { screen -> navigateTo(screen, navController) }
        }

        composable<Login> {
            LoginScreen(
                //navigateTo = { screen -> navigateTo(screen, navController) },
                //viewModel = loginViewModel
            )

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