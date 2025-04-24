package br.senai.sp.jandira.lionschool.screens

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.CoursesCard

@Composable
fun CourseScreen(modifier: Modifier) {

    val context = LocalContext.current
    val userFile = context
        .getSharedPreferences("userFile", Context.MODE_PRIVATE)



    Box(
        modifier = modifier
            .fillMaxSize()
//            .background(Color.Red)

    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
//                .background(Color.Black)
        ){
            //logo - inicio
            Row (
                modifier = Modifier
                    .width(100.dp)
                    .height(90.dp)
                    .padding(top = 24.dp, start = 24.dp),
//                    .background(color = Color.Red),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
//                        .background(color = Color.Yellow)
                ) {
                    Image(
                        painter = painterResource(
                            R.drawable.logo
                        ),
                        contentDescription = stringResource(
                            R.string.logo
                        ),
                        modifier = Modifier
                            .height(40.dp)
                            .width(40.dp)

                    )
                }
                //logo - fim

                Column(
                    modifier = modifier
                        .padding(1.dp)
                        .fillMaxHeight()
                        .fillMaxWidth(),
//                        .background(color = Color.Green),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = stringResource(
                            R.string.lionschool
                        ),
                        modifier = Modifier,
//                            .padding(top = 25.dp),
                        color = Color(0xFF3347B0),
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Divider(
                color = (Color(0xffFFC23D)),
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth()  // Largura do divisor
                    .height(1.dp)
            )

            //input
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp,start = 16.dp, end = 16.dp),
                shape = RoundedCornerShape(10.dp),
                label = { Text(text = stringResource(R.string.inputCourse)) },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color(color = 0xFF949494)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(color = 0xFFFFC23D),
                    unfocusedContainerColor = Color(color = 0xFFEFEFEF),
                    unfocusedLabelColor = Color(color = 0xFF949494)

                )
            )
            //input

            //Courses -inicio
            Row (
                modifier = Modifier
                    .width(200.dp)
                    .height(60.dp)
                    .padding(top = 24.dp, start = 16.dp),
//                    .background(color = Color.Red),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(
                        R.drawable.icon
                    ),
                    contentDescription = stringResource(
                        R.string.logo
                    ),
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                )
                Text(
                    text = stringResource(
                        R.string.Course
                    ),
                    modifier = Modifier
                        .padding(start = 2.dp),
                    color = Color(0xFF3347B0),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            //Courses - fim

            //List courses - inicio
            Column (
                modifier = Modifier
//                    .background(Color.Blue)
                    .fillMaxHeight()
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally

            ){

                CoursesCard(
                    imageCourse = painterResource(id = R.drawable.dsimage),
                    textCourse = stringResource(R.string.SiglaDS),
                    Title = stringResource(R.string.tituloDS),
                    Description = stringResource(R.string.descDS),
                    Semestre = stringResource(R.string.semestreCurso),
                    isFilled = true
                )
                CoursesCard(
                    imageCourse = painterResource(id = R.drawable.rds),
                    textCourse = stringResource(R.string.SiglaRDS),
                    Title = stringResource(R.string.tituloRDS),
                    Description = stringResource(R.string.descRDS),
                    Semestre = stringResource(R.string.semestreCurso),
                    isFilled = true
                )
                CoursesCard(
                    imageCourse = painterResource(id = R.drawable.ele),
                    textCourse = stringResource(R.string.SiglaELE),
                    Title = stringResource(R.string.tituloELE),
                    Description = stringResource(R.string.descELE),
                    Semestre = stringResource(R.string.semestreCurso),
                    isFilled = true
                )
            }


        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    CourseScreen(modifier = Modifier)
}