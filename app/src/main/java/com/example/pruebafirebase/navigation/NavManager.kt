package com.example.pruebafirebase.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pruebafirebase.view.login.BlankView
import com.example.pruebafirebase.view.login.TabsView
import com.example.pruebafirebase.view.notas.HomeView
import com.example.pruebafirebase.viewmodel.LoginViewModel
import com.example.pruebafirebase.viewmodel.NotesViewModel

@Composable
fun NavManager(loginViewModel: LoginViewModel,
               notesViewModel: NotesViewModel){
    val navController = rememberNavController()
    NavHost(navController=navController, startDestination= "blank"){
        composable("blank"){
            BlankView(navController = navController)
        }
        composable("login"){
            TabsView(navController = navController, loginViewModel = LoginViewModel())
        }
        composable ("home"){
            HomeView(navController = navController, viewModel=notesViewModel)
        }

    }
}