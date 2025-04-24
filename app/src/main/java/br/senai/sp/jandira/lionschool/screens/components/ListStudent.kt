package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R


@Composable
fun StudentCard(
    imageCourse: Painter = painterResource(R.drawable.foto1),
    nameAluno: String = "Luana Oliveira Dias",
    register: String = "20151001018",
    date: String = "2022",
    isFilled: Boolean = false
) {
    Card(
        modifier = Modifier
            .width(322.dp)
            .height(80.dp),
        shape = RoundedCornerShape(15.dp),

    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFF9FA9E1),
                            Color(0xFF9BA1C9)
                        )
                    )
                )
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = if (isFilled) imageCourse else painterResource(id = R.drawable.imgerror),
                        contentDescription = "",
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                    )
                    Column() {
                        Text(
                            text = nameAluno,
                            fontSize = 16.sp,
                            color = Color(0xFFFFFFFF),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Text(
                            text = register,
                            color = Color.White,
                            fontWeight = FontWeight.Light,
                            fontSize = 9.sp
                        )
                    }
                    Row (
                        modifier = Modifier
                            .padding(start = 60.dp, top = 38.dp)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.calendario),
                            contentDescription = "",
                            modifier = Modifier
                                .width(12.dp)
                                .height(12.dp)
                        )
                        Text(
                            text = date,
                            color = Color(0xffFFC23D),
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            modifier = Modifier
                                .padding(horizontal = 5.dp)
                        )
                    }


                }


            }
        }
    }
}


@Preview(showSystemUi =  true)
@Composable
private fun CoursesComponentsPreview() {
    StudentCard()
}