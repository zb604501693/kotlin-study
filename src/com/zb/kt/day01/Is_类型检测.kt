package com.zb.kt.day01

/**
 * Created by BG317957 on 2017/11/16.
 */


/**
 * is运算符检测一个表达式是否为某类型的一个实例
 */

fun getLength(obj:Any):Int?{
   var result = 0
    if(obj is String){
      result = obj.length;
    }
    //在离开类型检测分之后，obj仍然是any类型
    println(obj.javaClass)
    return result
}


fun main(args: Array<String>) {
    println(getLength(1))
    println(getLength("kotlin"))
}