package com.example.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleTheme() {
                Surface(color = Color.White) {
                    ArticlePage("", "", "")
                }
            }

        }
    }
}

@Composable
fun ArticlePage(title: String, Definition: String, Description: String) {
    val image = painterResource(R.drawable.backgroundimagemain)
    Column() {
        Box {
            Image(painter = image, contentDescription = null)
        }
        Text(stringResource(R.string.title), fontSize = 24.sp, lineHeight = 30.sp, modifier = Modifier.padding(16.dp))
        Text(
            stringResource(R.string.definition),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp), textAlign = TextAlign.Justify
        )
        Text(
            stringResource(R.string.description),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview
@Composable
fun ArticlePreview() {
    ArticlePage(title = "Jetpack compose tutorial", Definition = "ljfjbgkjbgj", Description = "ljfjbgkjbgj");
}
