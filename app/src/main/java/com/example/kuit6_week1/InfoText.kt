package com.example.kuit6_week1

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoText(
    text: String = "기본값"
) {
    Text(
        text = text,
        fontSize = 8.sp,
        lineHeight = 10.sp,
        modifier = Modifier
            .padding(bottom = 5.dp)
            .height(10.dp)
    )
}