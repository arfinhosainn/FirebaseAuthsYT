package com.example.firebaseauthyt.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauthyt.presentation.login_screen.SignInScreen
import com.example.firebaseauthyt.presentation.signup_screen.SignUpScreen
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun NavigationGraph(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = Screens.SignInScreen.route
    ) {
        composable(route = Screens.SignInScreen.route) {
            SignInScreen()

        }
        composable(route = Screens.SignUpScreen.route) {
            SignUpScreen(navController)

        }
    }

}
