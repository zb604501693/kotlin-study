package com.zb.kt.day01

/**
 * 预期范围内恒定不变的量
 *
 * 定义: val 常量名(任意文字 长度不限) 类似于 java final定义
 * 给常量一个值 叫 "赋值" val 常量 = 值
 *
 *
 * 注：常量不允许修改
 *
 * Created by zhangbo
 */
val  POI = 3.14

val  language : String = "kotlin"

val  name = "jenny"


fun main(args: Array<String>) {
    println(POI)
    println(language)
    println(name)

    //val cannot be reassigned 编译出错
    //name = "jetty"
}

