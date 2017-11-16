package com.zb.kt.day01

/**
 * Created by BG317957 on 2017/11/16.
 */


/**
 *
 * 在kotlin中，任何表达式都可以用标签来标记，标签的格式为标识符后面跟@符号，例如 isLove@
 *
 * 可以用标签控制return、break或者continue的跳转（jump）行为
 *
 */

fun returnDemo(){
    println(" start " + :: returnDemo.name)
    val intArray = intArrayOf(1,2,3,4,5)
    intArray.forEach here@ {
        if(it == 3) return@here
        println(it)
    }
    println(" start " + :: returnDemo.name)
}


fun returnDemo2(){
    println(" start " + :: returnDemo.name)
    val intArray = intArrayOf(1,2,3,4,5)
    intArray.forEach {
        if(it == 3) return@forEach
        println(it)
    }
    println(" start " + :: returnDemo.name)
}


fun main(args: Array<String>) {
    returnDemo2()
}