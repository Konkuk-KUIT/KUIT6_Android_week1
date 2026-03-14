package com.example.kuit6_week1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ModifierOrderExample() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.Red)
            .padding(16.dp)
    )
}

@Composable
fun ModifierOrderExample2() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
            .background(Color.Red)
    )
}

@Preview
@Composable
private fun PracticePreview() {
    Column {
        ModifierOrderExample()
        ModifierOrderExample2()
    }
}