package dev.mrjafari.weatherapp.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dev.mrjafari.weatherapp.model.CountryModel
import dev.mrjafari.weatherapp.ui.theme.shadow
import dev.mrjafari.weatherapp.ui.theme.white
import kotlinx.coroutines.launch

@Composable
fun Navigation(countries: MutableList<CountryModel>) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.MainScreen.rout) {
        composable(Screens.MainScreen.rout) {
            MainScreen(navController = navController,countries)
        }
        composable(
            route = Screens.DetailScreen.rout,
        ) {
            DetailScreen()
        }
    }
}




