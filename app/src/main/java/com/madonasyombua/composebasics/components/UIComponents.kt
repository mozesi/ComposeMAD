package com.madonasyombua.composebasics.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import java.sql.Ref

@Composable
fun EditTextEx(){
    OutlinedTextField(value = "", onValueChange = {},
    label = { Text(text = "First Name ")},
    modifier = Modifier
        .fillMaxWidth()
        .padding(top = 16.dp),
    colors = TextFieldDefaults.outlinedTextFieldColors(
        focusedBorderColor = Color.Blue,
        unfocusedLabelColor = Color.Black
    ))
}

@Composable

fun NotOutlinedEditTextExample(){
    TextField(value = "", onValueChange ={},
    label = {Text(text = "First Name")},
    modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp, bottom = 16.dp),
    colors = TextFieldDefaults.outlinedTextFieldColors(
        focusedBorderColor = Color.Blue,
        unfocusedBorderColor = Color.Black
    ))
}

@Composable
fun ButtonWithIcon(){
    Button(onClick ={}){
        Icon(painter = painterResource(id = com.madonasyombua.composebasics.R.drawable.ic_baseline_shopping_bag_24),
            contentDescription ="shopping bage",
        modifier = Modifier.size(20.dp))
        Text(text ="Button")
    }
}

@Composable
fun CornerCutShape(){
    Button(onClick = { /*TODO*/ },
    shape= CutCornerShape(10.dp)
    ) {
        Text(text= "cut corner")
    }
}

@Composable
fun RoundCornerButton(){
    Button(onClick ={},
    shape = RoundedCornerShape(10.dp)
    ){
        Text(text = "Rounded button")
    }
}

@Composable
fun ElevatedButtonExample(){
    Button(onClick = {},
    elevation = ButtonDefaults.elevation(
        defaultElevation = 8.dp,
        pressedElevation = 10.dp,
        disabledElevation = 0.dp
    )){
          Text(text = "elevated button")
    }
}

@Composable
fun ImageView(){
    Image(painter = painterResource(id = com.madonasyombua.composebasics.R.drawable.android),
        contentDescription = "image",
    modifier = Modifier.size(200.dp))
}