package br.senai.sp.jandira.lionschool.screens

import android.content.Context
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
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

@Composable
fun StudentDetailScreen(modifier: Modifier) {

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
            //logo - inicio
            Row(
                modifier = Modifier
//                    .background(color = Color.Red)
                    .width(150.dp)
                    .height(90.dp)
                    .padding(top = 20.dp, start = 24.dp),
//
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
                            .height(60.dp)
                            .width(60.dp)

                    )
                }
                //logo - fim

                Column(
                    modifier = modifier
                        .padding(1.dp)
                        .fillMaxHeight()
                        .width(52.dp),
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
                        fontSize =12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Divider(
                color = (Color(0xffFFC23D)),
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 10.dp)
                    .fillMaxWidth()  // Largura do divisor
                    .height(1.dp)
            )

            Column (
                modifier = Modifier
//                    .background(Color.Blue)
                    .fillMaxWidth()
                    .height(300.dp),
//                    .padding(top = 24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Card (
                    shape = CircleShape,
                    modifier = Modifier
                        .border(
                            width = 4.dp,
                            color = Color(0xFFFFC23D),
                            shape = RoundedCornerShape(100.dp)
                        )
                        .size(130.dp) // Define o tamanho do Card
                ){
                    Image(
                        painter = painterResource(id = R.drawable.foto1),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(
                    text = stringResource(
                        R.string.aluno1
                    ),
                    modifier = Modifier
                        .padding(top = 6.dp),
                    color = Color(0xFF3347B0),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(
                        R.string.cursoTec
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp, start = 43.dp, end = 10.dp),
                    color = Color(0xFF3347B0),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                )
            }

            Card(
                modifier = Modifier
                    .padding(bottom = 12.dp, start = 24.dp, end = 24.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(),
                shape = RoundedCornerShape(
                    topStart = 40.dp,
                    topEnd = 40.dp,
                    bottomEnd = 40.dp,
                    bottomStart = 40.dp
                ),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xFF9FA9E1)
                    ),


                ){}

        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    StudentDetailScreen(modifier = Modifier)
}