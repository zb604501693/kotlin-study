package com.zb.kt.day01

/**
 * Created by BG317957 on 2017/11/16.
 */

/**
 * 可空类型Any? （解决java中令人头痛的空指针异常，kotlin把可空行当做类型系统的一部分）
 *
 * 由于这个特性，kotlin在编译过程中发现许多可能的错误，并减少在运行时异常的可能性
 *
 * null不是Any类型，null的类型是Nothing.
 *
 * 普通类型是不能指向空的，必须要这样写String?,则可以指向空
 */
var a :String?= "zhangbo"
fun main(args: Array<String>) {

    println(null == null) //true
    println(null != null) //false
    a = null

    print(a?.length) //null
}