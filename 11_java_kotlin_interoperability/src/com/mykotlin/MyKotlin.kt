@file:JvmName("MyCustomKotlinFile")

package com.mykotlin

import com.myjava.MyJava

fun main(args: Array<String>) {
    val value = MyJava()
    print("From Kotlin file ${value.provideSum()}")
}

fun getSum():Int{
    return  10+10;
}