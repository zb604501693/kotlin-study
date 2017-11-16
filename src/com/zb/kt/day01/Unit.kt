package com.zb.kt.day01

/**
 * Created by BG317957 on 2017/11/16.
 */


/**
 * Unit类型实现了与java中的void一样的功能
 *
 * 不同的是，当一个函数没有返回值时，我们用Unit来表示这个特性，而不是null
 *
 * 大多情况下，我们不需要显式的返回Unit
 */
fun main(args: Array<String>) {

}

/**
 * Uint与Noting的区别：Unit类型表达式计算结果的返回类型是Unit,Nothing类型的表达式计算结果是永远不会返回的
 */
fun formatCell(value:Double):String =
        if(value.isNaN()){
            throw IllegalArgumentException("$value is not a number") //Nothing（永远不返回，抛出异常）
        }else{
            value.toString()
        }