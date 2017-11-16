package com.zb.kt.day01

/**
 * Created by BG317957 on 2017/11/16.
 */

/**
 *
 * kotlin中所有类都有一个共同的超类Any,所以类声明时没有指定超类，则默认是Any
 *
 */

fun main(args: Array<String>) {

    val obj:Any = Any()
    //class java.lang.Object
    print(obj.javaClass)

    //在kotlin中，操作符==会被编译器翻译成equals（）函数
}