package com.example.rhmanager.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rhmanager.BuildConfig
import com.example.rhmanager.data.remote.responses.DataPoint
import com.example.rhmanager.presentation.ui.theme.RHManagerTheme
import com.example.rhmanager.util.Navigation
import java.math.BigDecimal
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private val viewModel : TestViewModel by viewModels()
    //var data : HistoricalData? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("qwer", BuildConfig.API_KEY)

        //However, you need to remember that collecting SharedFlow in the Fragment using lifecycleScope.launch{} is not lifecycle aware — you need to use launchWhenStarted or cancel the job when the app goes to background.
        viewModel.getCryptoData()

        setContent {
            RHManagerTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.fillMaxSize(),
                ){
                    Navigation()
                }
                Graph(viewModel)
            }
        }
    }
}

@Composable
fun Graph(viewModel: TestViewModel) {
    Log.d("qwer","Asdf")
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clip(RoundedCornerShape(25))
            .background(Color(Random.nextInt(), Random.nextInt(), Random.nextInt()))
    ){
        val data = viewModel.data.value.data
        val a = viewModel._testState
        Log.d("asdf",a.toString())
        Log.d("qwer",data?.dataPoints?.size.toString())
        Canvas(
            modifier = Modifier.fillMaxSize()
                .pointerInput(data){
                    detectTapGestures {
                        Log.d("asdf", (it.toString()+(size.width).toString()))
                        if (data != null) {
                            Log.d("asdf",data.dataPoints[(it.x/size.width*data.dataPoints.size).toInt()].toString())
                        }
                    }
                }
        ){
            if (data != null) {
                val width = size.width/data.dataPoints.size
                var prev : BigDecimal = BigDecimal.ZERO
                var count = 0
                val max = data.dataPoints.maxByOrNull { it.closePrice }?.closePrice?.toFloat() ?: 0f
                val min = data.dataPoints.minByOrNull { it.closePrice }?.closePrice?.toFloat() ?: 0f
                data.dataPoints.forEachIndexed { i: Int, dataPoint: DataPoint ->
                    if(i%5==0) {
                        drawLine(
                            color = Color.Green,
                            start = Offset(width * i, size.height*(1-(prev.toFloat()-min)/(max-min))),
                            end = Offset(
                                width * (i + 1),
                                size.height*(1-(dataPoint.closePrice.toFloat()-min)/(max-min))
                            )
                        )
                        prev = dataPoint.closePrice.toBigDecimal()
                    }
                    count++
                }
                Log.d("qwerd",count.toString())
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
            .background(Color(Random.nextInt(), Random.nextInt(), Random.nextInt()))
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

//@Composable
//fun StoreScreen() {
//    val list = viewModel.categoriesList().collectAsState(emptyList())
//    Log.d("appDebug", list.value.toString()) // Showing always emptyList []
//}