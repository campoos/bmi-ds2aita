package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.senai.sp.jandira.bmi.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun UserDataScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Green)
        ){
            Text(
                text = stringResource(
                    R.string.Hi
                ),
                fontSize = 48.sp
            )
            Column (){

            }
        }
    }
}

@Preview
@Composable
private fun UserDataScreenPreview() {
    UserDataScreen()
}