package com.example.shoppingapp.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CustomButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier // Default Modifier parameter
) {
    Button(onClick = onClick) {
        Text(text = text)
    }
}