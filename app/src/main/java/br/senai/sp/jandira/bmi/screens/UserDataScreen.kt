package br.senai.sp.jandira.bmi.screens

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Accessibility
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.senai.sp.jandira.bmi.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun UserDataScreen(navegacao: NavHostController?) {

    val context = LocalContext.current
    val userFile = context
        .getSharedPreferences("user_file", Context.MODE_PRIVATE)

    val editor = userFile.edit()

    val userName = userFile.getString("user_name", "")

    var nameAge = remember {
        mutableStateOf("")
    }
    var nameWeight = remember {
        mutableStateOf("")
    }
    var nameHeight = remember {
        mutableStateOf("")
    }


    Box(
        modifier = Modifier
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
                    R.string.Hi
                ) + ", $userName!",
                fontSize = 24.sp,
                fontWeight = FontWeight(500),
                modifier = Modifier
                    .padding(vertical = 32.dp, horizontal = 20.dp)
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(4f),
                shape = RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row (
                        modifier = Modifier
                            .background(Color.Transparent),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(32.dp)
                    ) {
                        Column (
                            verticalArrangement = Arrangement.spacedBy(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(top = 76.dp)
                        ){
                            Card (
                                shape = CircleShape,
                                border = BorderStroke(2.dp, Color.Magenta)
                            ){
                                Image(
                                    painter = painterResource(
                                        R.drawable.man
                                    ),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(120.dp)
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .size(130.dp, 40.dp)
                            ) {
                                Text(
                                    text = stringResource(id = R.string.MaleButton),
                                    fontSize = 18.sp
                                )
                            }
                        }
                        Column (
                            verticalArrangement = Arrangement.spacedBy(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(top = 76.dp)
                        ){
                            Card (
                                shape = CircleShape,
                                border = BorderStroke(2.dp, Color.Blue)
                            ){
                                Image(
                                    painter = painterResource(
                                        R.drawable.woman
                                    ),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(120.dp)
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .size(130.dp, 40.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFF55B698)
                                )
                            ) {
                                Text(
                                    text = stringResource(id = R.string.FemaleButton),
                                    fontSize = 18.sp
                                )
                            }
                        }
                    }
                   OutlinedTextField(
                       modifier = Modifier
                           .padding(top = 40.dp)
                           .width(320.dp),
                       shape = RoundedCornerShape(12.dp),
                         value = nameAge.value,
                        onValueChange = {
                            nameAge.value = it
                        },
                       label = {
                           Text(
                               stringResource(
                                   R.string.Age
                               ),
                               fontSize = 18.sp
                           )
                       },
                       leadingIcon = {
                           Icon(
                               imageVector = Icons.Default.CalendarToday,
                               contentDescription = "",
                               tint = Color(0xFF55B698)
                           )
                       }

                   )
                    OutlinedTextField(
                        modifier = Modifier
                            .padding(top = 40.dp)
                            .width(320.dp),
                        shape = RoundedCornerShape(12.dp),
                        value = nameWeight.value,
                        onValueChange = {
                            nameWeight.value = it
                        },
                        label = {
                            Text(
                                stringResource(
                                    R.string.Weight
                                ),
                                fontSize = 18.sp
                            )
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Accessibility,
                                contentDescription = "",
                                tint = Color(0xFF55B698)
                            )
                        }
                    )
                    OutlinedTextField(
                        modifier = Modifier
                            .padding(top = 40.dp)
                            .width(320.dp),
                        shape = RoundedCornerShape(12.dp),
                        value = nameHeight.value,
                        onValueChange = {
                            nameHeight.value = it
                        },
                        label = {
                            Text(
                                stringResource(
                                    R.string.Height
                                ),
                                fontSize = 18.sp
                            )
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Height,
                                contentDescription = "",
                                tint = Color(0xFF55B698)
                            )
                        }
                    )
                    Button(
                        onClick = {
                            val weight = nameWeight.value.toFloat()
                            val height = nameHeight.value.toFloat()
                            val age = nameAge.value

                            editor.putString("user_age", age)
                            editor.putFloat("user_weight", weight)
                            editor.putFloat("user_height", height)

                            editor.apply()
                            navegacao?.navigate("bmi_result")
                        },
                        modifier = Modifier
                            .padding(top = 80.dp)
                            .size(320.dp, 60.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF55B698)
                        )
                    ) {
                        Text(
                            text = stringResource(id = R.string.Calculate),
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
private fun UserDataScreenPreview() {
    UserDataScreen(null)
}