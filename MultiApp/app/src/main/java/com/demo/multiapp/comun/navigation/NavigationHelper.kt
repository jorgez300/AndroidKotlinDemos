package com.demo.multiapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.demo.multiapp.MainActivity
import com.demo.multiapp.app1.screen.app1Main.App1MainScreen
import com.demo.multiapp.app2.screen.app2main.App2MainScreen
import com.demo.multiapp.comun.ComunGraph
import com.demo.multiapp.comun.screen.login.LoginScreen


@Composable
fun NavigationHelper(
    mainActivity: MainActivity,
    paddingValues: androidx.compose.foundation.layout.PaddingValues
) {
    ComunGraph.navController = rememberNavController()

    NavHost(navController = ComunGraph.navController, startDestination = Login) {

        composable<App1Main> {
            App1MainScreen()
        }

        composable<App2Main> {
            App2MainScreen()
        }

        // Ruta para la pantalla inicial que luego derivara segun corresponda
        composable<Login> {
            LoginScreen()
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