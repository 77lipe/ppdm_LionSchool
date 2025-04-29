package br.senai.sp.jandira.lionschool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.lionschool.screens.CourseScreen
import br.senai.sp.jandira.lionschool.screens.HomeScreen
import br.senai.sp.jandira.lionschool.screens.StudentScreen
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme{}
//                var navegacao = rememberNavController()
//                NavHost(
//                    navController = navegacao,
//                    startDestinon = "home"
//                ){
//                    composable(route = "home"){ HomeScreen(navegacao) }
//                    composable(route = "cursos"){ CourseScreen(navegacao) }
//                    composable(route = "estudantes"){ StudentScreen(navegacao) }
//                }




            }
        }
    }

