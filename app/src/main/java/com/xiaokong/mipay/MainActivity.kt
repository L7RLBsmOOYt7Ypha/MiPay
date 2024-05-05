package com.xiaokong.mipay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.xiaokong.mipay.ui.theme.Greeting
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextAlign
import com.example.compose.MipayTheme
import com.xiaokong.mipay.ui.theme.MainScaffold

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MipayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    //modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    val greetingsList = listOf(
                        GreetingData(image = R.drawable.bang, title = "Title 1"),
                        GreetingData(image = R.drawable.a23, title = "Title 2"),
                        // 更多 GreetingData...
                    )
                    var presses by remember { mutableIntStateOf(0) }
                    Greeting(greetingsList)
                }
            }
        }
    }
}

@Composable
fun MyApp(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("World", "Compose")
) {
    Column(modifier = modifier.padding(vertical = 4.dp)) {
        for (name in names) {
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES,
    name = "GreetingPreviewDark"
)

@Preview(showBackground = true,widthDp = 320)
@Composable
fun GreetingPreview() {
    val greetingsList = listOf(
        GreetingData(image = R.drawable.bang, title = "Title 1"),
        GreetingData(image = R.drawable.a23, title = "Title 2"),
        // 更多 GreetingData...
    )
    MipayTheme {
        Greeting(greetingsList)
    }
}