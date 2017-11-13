package com.zb.kt.day01

/**
 * List 数组变更
 *
 * Created by BG317957 on 2017/11/13.
 */


/*
 *
 * 摘自官网：Unlike many languages, Kotlin distinguishes between mutable and immutable collections (lists, sets, maps, etc)
 *  Precise control over exactly when collections can be edited is useful for eliminating bugs, and for designing good APIs.
 *  不像其他语言，kotlin将集合分成了可变和不可变。精确地控制何时可以编辑集合，一个好的设计对于消除错误是非常有帮助的
 */

//默认是不可变的
var list = emptyList<String>()
var list_ = listOf<String>("java","kotlin")


var languages:MutableList<String> = mutableListOf();

//可变
var  changeList:MutableList<String> = list_.toMutableList()

fun main(args: Array<String>) {
    println(list)
    println(list_)


    languages.add("java")
    languages.add("kotlin")
    languages.add("python")
    println(languages)

    changeList.add("python")
    println(changeList)
}