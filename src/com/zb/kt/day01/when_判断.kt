package com.zb.kt.day01

/**
 * Created by BG317957 on 2017/11/16.
 */

/**
 * when 类似于switch-case语句，但是相对于switch-case，when要更灵活，强大
 *
 *
 * when的每一个分支也可以是一个代码块，如果我们有很多分支需要用相同的方式进行处理，则可以把多个分支条件放在一起，用逗号隔开
 *
*/

fun caces(obj:Any){
    when(obj){
         1,0     -> println("输出$obj")
        "hello" -> println("输出$obj")
        is Long -> println("输出${obj.javaClass}")
        else -> println("else类似于java的default")
    }
}

fun main(args: Array<String>) {
    caces(0);
    caces(1);
    caces(1L);
    caces("hello")
    caces("bbb")
}