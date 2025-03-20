package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun BMIResultScreen(modifier: Modifier = Modifier) {
    Box(
        modifier =  Modifier
            .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF9AD36C)),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = stringResource(
                    R.string.resultTitle
                ),
                fontSize = 32.sp,
                fontWeight = FontWeight(600),
                modifier = Modifier
                    .padding(vertical = 36.dp, horizontal = 20.dp)
            )
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(800.dp),
                shape = RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ){
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Card (
                        modifier = Modifier
                            .height(125.dp)
                            .width(125.dp),
                        shape = CircleShape,
                        border = BorderStroke(7.dp, Color(0xFFFAAA03)),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        )

                    ){
                        Row (
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Text(
                                text = "30,6",
                                fontSize = 42.sp,
                                fontWeight = FontWeight(700)
                            )
                        }
                    }
                    Text(
                        modifier = Modifier
                            .padding(bottom = 20.dp, top = 15.dp)
                        ,
                        text = stringResource(

                            R.string.classificacaoDescription

                        ),
                        fontSize = 24.sp,
                        fontWeight = FontWeight(500)
                    )
                    Card (
                        modifier = Modifier
                            .width(350.dp)
                            .height(80.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFEDDCF1)
                        )
                    ) {
                        Row (
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Column (
                                modifier = Modifier
                                    .weight(3f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = stringResource(
                                        R.string.Age
                                    ),
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight(300)
                                )
                                Text(
                                    text = "50",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight(600),
                                    modifier = Modifier
                                        .padding(top = 4.dp)
                                )
                            }
                            VerticalDivider(
                                modifier = Modifier
                                    .height(60.dp)
                            )
                            Column (
                                modifier = Modifier
                                    .weight(3f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = stringResource(
                                        R.string.Weight
                                    ),
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight(300)
                                )
                                Text(
                                    text = "97 Kg",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight(600),
                                    modifier = Modifier
                                        .padding(top = 4.dp)
                                )
                            }
                            VerticalDivider(
                                modifier = Modifier
                                    .height(60.dp)
                            )
                            Column (
                                modifier = Modifier
                                    .weight(3f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = stringResource(
                                        R.string.High
                                    ),
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight(300)
                                )
                                Text(
                                    text = "178 cm",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight(600),
                                    modifier = Modifier
                                        .padding(top = 4.dp)
                                )
                            }
                        }
                    }
                    Column (
                        modifier = Modifier
                            .height(240.dp)
                            .fillMaxWidth()
                            .background(Color.Transparent)
                    ){}
                    HorizontalDivider(
                        modifier = Modifier
                            .height(60.dp)
                            .padding(vertical = 30.dp)
                    )
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .size(400.dp, 60.dp),
                        shape = RoundedCornerShape(15.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF009685)
                        )
                    ) {
                        Text(
                            text = stringResource(id = R.string.newCalc),
                            fontSize = 26.sp
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun BMIResultScreenPreview() {
    BMIResultScreen ()
}