package com.padcmyanmar.padc9kotlinbasicdemo

fun main() {

    val numbers = listOf(6, -1, 2, 3, 5, 2, 3, 6, 7)

   val negative = numbers.partition { negativieNum -> negativieNum < 0 }

    println(negative)
}


