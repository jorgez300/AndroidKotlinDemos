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
import com.demo.multiapp.comun.screen.login.LoginScreen


@Composable
fun NavigationHelper(
    mainActivity: MainActivity,
    paddingValues: androidx.compose.foundation.layout.PaddingValues
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Login) {

        // Ruta para App1 con argumento patente
        composable(
            route = "App1MainScreen/{patente}",
            arguments = listOf(navArgument("patente") {
                type = androidx.navigation.NavType.StringType
            })
        ) { backStackEntry ->
            App1MainScreen(
                navController = navController,
                patente = backStackEntry.arguments?.getString("patente")
            )
        }

        // Ruta para App2 con argumento patente
        /*composable(
            route = "${App2Main}/{patente}",
            arguments = listOf(navArgument("patente") {
                type = androidx.navigation.NavType.StringType
            })
        ) { backStackEntry ->
            App2MainScreen(
                navController = navController,
                patente = backStackEntry.arguments?.getString("patente")
            )
        }*/


        /*composable<App1Main> {
            App1MainScreen(navController = navController)
        }*/

        composable<App2Main> {
            App2MainScreen(navController = navController)
        }

        // Ruta para la pantalla inicial que luego derivara segun corresponda
        composable<Login> {
            LoginScreen(navController = navController)
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