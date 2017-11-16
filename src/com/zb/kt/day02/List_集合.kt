package com.zb.kt.day02

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


    //遍历1
    for(item in list_){
        print("$item ")
    }
    println()

    //遍历2
    for(i in list_.indices){
        print("${list_[i]} ")

    }
    println()

    //遍历3
    for((key,value) in list_.withIndex()){
        print("$key -- $value  ")
    }
    println()

    //遍历
    list_.forEach(::print)
    println()

    //在list中出现的索引
    println(list_.indexOf("java"))

    //list长度
    println(list_.size)


    //获取第0个元素
    println(list_.get(0))

    //是否包含
    println(list_.contains("java"))

    //元素最后一次出现的索引，如果没有该元素，返回-1
    println(list_.lastIndexOf("c++"))
    println(list_.lastIndexOf("java"))

    //如果列表存在。返回size-1，如果为空，返回-1
    println(list_.lastIndex)
    println(list.lastIndex)

    //判断是否是空数组
    println(list.isEmpty())

    println(list.elementAtOrElse(1,{"kotlin"}))

}