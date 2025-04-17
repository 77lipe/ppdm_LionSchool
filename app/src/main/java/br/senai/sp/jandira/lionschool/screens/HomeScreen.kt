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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen(modifier: Modifier){

    val context = LocalContext.current
    val userfile = context
        .getSharedPreferences("userFile", Context.MODE_PRIVATE)

    

    Box(
        modifier = modifier
            .fillMaxSize()

    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            // inicio -  logo lion school - parte superior
            Row (
                modifier = Modifier
                    .width(310.dp)
                    .height(280.dp)
                    .padding(top = 55.dp)
//                    .background(color = Color.Red)
            ) {
                Column(
                    modifier = modifier
                        .width(150.dp)
                        .fillMaxHeight()
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
                            .fillMaxHeight()
                            .fillMaxWidth()

                    )
                }
                Column(
                    modifier = modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .fillMaxHeight(),
//                        .background(color = Color.Green),

                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = stringResource(
                            R.string.lionschool
                        ),
                        modifier = Modifier
                            .padding(top = 25.dp),
                        color = Color(0xFF3347B0),
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }// fim -  logo lion school - parte superior


            // inicio - parte do meio
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(top = 50.dp),
//                    .background(color = Color.Red),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = stringResource(
                        R.string.findHome
                    ),
                    modifier = Modifier
                        .padding(top = 15.dp),
                    color = Color(0xFF3347B0),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.3.sp
                )
                Card (
                    shape = CircleShape,
                    modifier = Modifier
                        .padding(top = 9.dp)
                        .width(60.dp)  // Largura do divisor
                        .height(5.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFFFC23D)
                        )
                ){}
                Text(
                    text = stringResource(
                        R.string.textDescriptionHome
                    ),
                    modifier = Modifier
                        .padding(end = 20.dp, start = 20.dp, top = 30.dp),
                    color = Color(0xFF9E9FA4),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
            }// fim - parte do meio

            // inicio - button - parte do meio
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding( top = 100.dp),
//                    .background(color = Color.Red),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Button(
                    onClick = {
                    },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        Color(0xFFFFC23D)
                    ),
                    modifier = Modifier
                        .width(300.dp)
                        .height(45.dp)
                        .border(
                            width = 2.dp, // espessura da borda
                            color = Color(0xFF3347B0), // cor da borda
                            shape = RoundedCornerShape(8.dp) // formato da borda (pode ser quadrado, arredondado etc)
                        )

                ) {
                    Text(
                        text = stringResource(
                            R.string.buttonHome
                        ),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0)
                    )
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
//                    .background(color = Color.Cyan),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Center
            ){
                Image(
                    painter = painterResource(
                        R.drawable.yt
                    ),
                    contentDescription = stringResource(
                        R.string.logo
                    ),
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .padding(19.dp)

                )
                Image(
                    painter = painterResource(
                        R.drawable.twitter
                    ),
                    contentDescription = stringResource(
                        R.string.logo
                    ),
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .padding(19.dp)

                )
                Image(
                    painter = painterResource(
                        R.drawable.insta
                    ),
                    contentDescription = stringResource(
                        R.string.logo
                    ),
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .padding(19.dp)

                )
                Image(
                    painter = painterResource(
                        R.drawable.face
                    ),
                    contentDescription = stringResource(
                        R.string.logo
                    ),
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .padding(19.dp)

                )

            }






//            Card(
//                modifier = Modifier
//                    .width(310.dp)
//                    .height(280.dp)
//                    .padding(top = 55.dp)
//                    .background(color = Color.White)
//            ) { }
        }
    }





}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(modifier = Modifier)
}