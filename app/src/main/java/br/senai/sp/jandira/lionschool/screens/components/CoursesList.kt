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
fun CoursesCard(
    imageCourse: Painter ,
    textCourse: String = "",
    Title: String = "",
    Description: String = "",
    Semestre: String = "",
    isFilled: Boolean = false
) {
    Card(
        modifier = Modifier
            .width(322.dp)
            .height(190.dp),
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(
            1.dp,
            Color(0xFFFFC23D)
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFF3347B0),
                            Color(0xFF9BA1C9)
                        )
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp),
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
                            .height(90.dp)
                            .width(90.dp)
                    )
                    Text(
                        text = textCourse,
                        fontSize = 60.sp,
                        color = Color(0xFFFFC23D),
                        fontWeight = FontWeight.ExtraBold
                    )
                }
                Column() {
                    Text(
                        text = Title,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = Description,
                        color = Color.White,
                        fontWeight = FontWeight.Thin
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.relogio),
                        contentDescription = "",
                        modifier = Modifier
                            .width(15.dp)
                            .height(15.dp)
                    )
                    Text(
                        text = Semestre,
                        color = Color.White,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                    )
                }
            }
        }
    }
}


@Preview(showSystemUi =  true)
@Composable
private fun CoursesComponentsPreview() {
//    CoursesCard()
}