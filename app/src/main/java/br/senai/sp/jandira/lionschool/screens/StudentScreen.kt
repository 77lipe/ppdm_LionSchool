package br.senai.sp.jandira.lionschool.screens

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
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
import br.senai.sp.jandira.lionschool.screens.components.StudentCard

@Composable
fun StudentScreen(modifier: Modifier) {

    val context = LocalContext.current
    val userFile = context
        .getSharedPreferences("userFile", Context.MODE_PRIVATE)



    Box(
        modifier = modifier
            .fillMaxSize()
//            .background(Color.Red)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
//                .background(Color.Black)
        ) {

            Row(
                modifier = Modifier
//                    .background(Color.Cyan)
                    .fillMaxWidth()
                    .height(90.dp),
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                //logo - inicio
                Column(
                    modifier = Modifier
//                        .background(Color.Yellow)
                        .height(90.dp)
                        .width(110.dp)
                ) {
                    Row(
                        modifier = Modifier
//                            .background(color = Color.Red)
                            .fillMaxWidth()
                            .height(90.dp)
                            .padding(16.dp),
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


                        Column(
                            modifier = modifier
                                .padding(1.dp)
                                .fillMaxHeight()
                                .fillMaxWidth(),
//                        .background(color = Color.Green),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
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
                    //logo - fim


                }//ICON CURSO - Inicio
                Column(
                    modifier = Modifier
//                        .background(Color.Yellow)
                        .fillMaxHeight()
                        .width(70.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        shape = CircleShape, // Define a forma do Card como um círculo
                        modifier = Modifier
                            .size(50.dp) // Define o tamanho do Card
                        , colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xFFFFC23D)
                            )

                    ) {
                        Text(
                            modifier = Modifier
                                .padding(top = 14.dp)
                                .padding(horizontal = 12.dp),
                            text = stringResource(R.string.SiglaDS),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF3347B0)
                        )
                    }
                }
                //ICON CURSO - fim

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
                    .padding(top = 9.dp, start = 16.dp, end = 16.dp),
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
            //input - fim

            //cards status - inicio
            Row(
                modifier = Modifier
//                    .background(color = Color.Red)
                    .padding(top = 16.dp)
                    .fillMaxWidth()
                    .height(30.dp),
                horizontalArrangement = Arrangement.Start
//                    .padding(16.dp),

            ) {
                Card(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .width(80.dp)
                        .height(30.dp),
                    shape = RoundedCornerShape(
                        topStart = 40.dp,
                        topEnd = 40.dp,
                        bottomStart = 40.dp,
                        bottomEnd = 40.dp
                    ),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFFFC23D)
                        )
                ) {
                    Text(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(horizontal = 21.dp),
                        text = stringResource(R.string.todos),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF3347B0)
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .width(100.dp)
                        .height(30.dp),
                    shape = RoundedCornerShape(
                        topStart = 40.dp,
                        topEnd = 40.dp,
                        bottomStart = 40.dp,
                        bottomEnd = 40.dp
                    ),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFFFC23D)
                        )
                ) {
                    Text(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(horizontal = 22.dp),
                        text = stringResource(R.string.cursando),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF3347B0)
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .width(105.dp)
                        .height(30.dp),
                    shape = RoundedCornerShape(
                        topStart = 40.dp,
                        topEnd = 40.dp,
                        bottomStart = 40.dp,
                        bottomEnd = 40.dp
                    ),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFFFC23D)
                        )
                ) {
                    Text(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(horizontal = 23.dp),
                        text = stringResource(R.string.finalizado),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF3347B0)
                    )
                }

            }


            //Courses -inicio
            Row(
                modifier = Modifier
                    .width(200.dp)
                    .height(60.dp)
                    .padding(top = 16.dp, start = 16.dp),
//                    .background(color = Color.Red),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.iconstudent
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
                        R.string.listStudent
                    ),
                    modifier = Modifier
                        .padding(start = 2.dp),
                    color = Color(0xFF3347B0),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                modifier = Modifier
//                    .background(Color.Blue)
                    .padding(start = 12.dp, end = 12.dp, top = 10.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally



            ) {
                StudentCard(
                    imageCourse = painterResource(R.drawable.foto1),
                nameAluno = stringResource(R.string.aluno1),
                register = stringResource(R.string.register1),
                date = stringResource(R.string.data1),
                isFilled = true
                )
                StudentCard(
                    imageCourse = painterResource(R.drawable.aluno2),
                    nameAluno = stringResource(R.string.aluno2),
                    register = stringResource(R.string.register1),
                    date = stringResource(R.string.data2),
                    isFilled = true
                )
                StudentCard(
                    imageCourse = painterResource(R.drawable.foto1),
                    nameAluno = stringResource(R.string.aluno1),
                    register = stringResource(R.string.register1),
                    date = stringResource(R.string.data1),
                    isFilled = true
                )
                StudentCard(
                    imageCourse = painterResource(R.drawable.aluno2),
                    nameAluno = stringResource(R.string.aluno2),
                    register = stringResource(R.string.register1),
                    date = stringResource(R.string.data2),
                    isFilled = true
                )
                StudentCard(
                    imageCourse = painterResource(R.drawable.foto1),
                    nameAluno = stringResource(R.string.aluno1),
                    register = stringResource(R.string.register1),
                    date = stringResource(R.string.data1),
                    isFilled = true
                )
                StudentCard(
                    imageCourse = painterResource(R.drawable.aluno2),
                    nameAluno = stringResource(R.string.aluno2),
                    register = stringResource(R.string.register1),
                    date = stringResource(R.string.data2),
                    isFilled = true
                )

            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    StudentScreen(modifier = Modifier)
}