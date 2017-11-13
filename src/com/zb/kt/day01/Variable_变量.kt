package com.zb.kt.day01

/**
 * 变量
 *
 * Created by BG317957 on 2017/11/13.
 */

//此处为全局变量
var language_ = "python"

fun main(args: Array<String>) {

    //下面这些都是全局变量
    println(language_)
    language_ = "java"
    println(language_)
    println(language)
}