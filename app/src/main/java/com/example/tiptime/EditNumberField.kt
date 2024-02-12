package com.example.tiptime

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType


//var amountInput : MutableState<String> = mutableStateOf("0")

@Composable

fun EditNumberField(
    @StringRes label : Int,
    @DrawableRes leadingIcon : Int,
    keyboardOptions: KeyboardOptions,
    value : String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {

    TextField(
        value = value,
        leadingIcon ={Icon(painter = painterResource(id = leadingIcon), null)},
        onValueChange = onValueChange,
        label = { Text(stringResource(label))},
        singleLine = true,
        modifier = modifier,
        keyboardOptions = keyboardOptions

        )
}