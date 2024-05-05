package com.xiaokong.mipay

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButtonDefaults.elevation
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

data class GreetingData(val image: Int, val title: String)

@Composable
fun CardItem(image: Int, title: String) {
    Surface(
        onClick = { /*TODO*/ },
        color = Color.White,
        shape = RoundedCornerShape(6.dp),
        modifier = Modifier
            .padding(top = 10.dp, start = 8.dp, end = 8.dp)
            .shadow(4.dp),
    ) {
        Column(
//          modifier = Modifier.border(2.dp, Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(120.dp)
            )
            Text(text = title)
        }
    }
}