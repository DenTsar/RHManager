package com.example.rhmanager

import android.os.Bundle
import android.util.Log
import android.view.Gravity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.End
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.End
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.rhmanager.responses.CurrencyPair
import com.example.rhmanager.ui.theme.RHManagerTheme
import com.example.rhmanager.util.Navigation
import com.example.rhmanager.BuildConfig
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private val viewModel : TestViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("qwer",BuildConfig.API_KEY)

        lifecycleScope.launchWhenStarted {
            viewModel.testState.collect{
                when(it){
                    is TestViewModel.UIState.Loading -> {

                    }
                }
            }
        }


        viewModel.getStuff()

        setContent {
            RHManagerTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.fillMaxSize(),
                ){
                    Navigation()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RHManagerTheme {
        LazyColumn{
            itemsIndexed(
                listOf("a","b","c","d")
            ){ index, string ->
                ListItem()
                Text(index.toString() + string)
            }
        }
    }
}

@Composable
fun ListItem() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clip(RoundedCornerShape(25))
            .background(Color(Random.nextInt(),Random.nextInt(),Random.nextInt()))
    ){
        Row{
            Text("hi", textAlign = TextAlign.End)
            Spacer(Modifier.width(20.dp))
            Text(
                text = "hi",
            )
            Spacer(Modifier.width(20.dp))
        }
    }
}