package com.zb.kt.helloWorld

/**
 * Created by BG317957 on 2017/11/13.
 */

fun main(args: Array<String>) {
    println("hello world");
    val a= 1;
    val b= 2;
    println(sum(a,b))

    val flag = if (a>b) a else b
    println(flag)

    printSum(a,b)

}



fun sum(a:Int,b:Int):Int{
  return a+b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a:Int,b:Int){
    println("$a + $b = ${a+b}")
}