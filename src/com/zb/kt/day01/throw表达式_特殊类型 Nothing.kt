package com.zb.kt.day01

/**
 * Created by BG317957 on 2017/11/16.
 */


/**
 * 在代码中，我们用nothing来标记无返回的函数
 */

fun void(){
    println(Nothing::class)

    val ex : Nothing = throw Exception();

    //编译出错，因为ex值为nothing,没有任何值，所以无法当做参数传给函数
    //println(ex)
}

fun main(args: Array<String>) {
    //class java.lang.Void
    void()
}