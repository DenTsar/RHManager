package com.example.rhmanager

import com.example.rhmanager.data.remote.responses.CryptoOrder

fun calcProfit(buys : List<CryptoOrder>, sells : List<CryptoOrder>) {
    val a = sells[0]
    var left: Int = a.price.toInt()
    var b = buys

    b = buys.drop(buys.indexOfFirst { it.price > a.price })
    //b = b.dropWhile { it.price > a.price }

    b.map {
        if (left > 0) {
            it.copy(price = if (left > it.price.toInt()) left.toString() else "")
        }
    }
    b.map { it.copy(price = if(left>it.price.toInt()) left.toString() else "") }


    return calcProfit(b,sells.drop(1))
}

fun calcProfit2(buys : List<CryptoOrder>, sells : List<CryptoOrder>) {
    val sell = sells[0]

    val buys = buys.map{
    }
}
fun calcProfit3(buys : List<CryptoOrder>, sell : List<CryptoOrder>, remaining : Int): Int {

    return 5
}

data class CustomOrder(
    val price : Int = 5
)

fun calcProfit3(buys : List<CustomOrder>, sells : List<CustomOrder>) {
    val sell = sells[0]

    val a = buys.map{
        it.copy(price=4)
    }
}