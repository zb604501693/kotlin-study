package com.zb.kt.day01

/**
 * 数据类型
 *
 *
 * kotlin中没有基本类型byte short int long float double ----->继承自Number---->Any
 *
 * Created by BG317957 on 2017/11/13.
 */

var i = 12
var i2 :Int =14


var d = 3.1415926
var d1 :Double = 3.1459267


var flag = true
var flag_ :Boolean = false


var f = 3.14f
var f1:Float = 3.141f

//void也是一种类型，他是一个装箱类，不能被new出来，
// 因为void不能再堆内存分配，而是在栈内存被预先分配出来
// 但是void归结为基本类型
//var void:Void = void(); 编译出错

fun main(args: Array<String>) {
    println(i.javaClass)
    println(d1.javaClass)
    println(flag.javaClass)
    println(f.javaClass)


    //在kotlin中，没有对Int类型进行重载，所以下面的语句会发生错误
    var hello = "hello"
    println(hello+1)
    //编译出错
    //print(1+hello)

    explicitCast()
}

/**
 * 显式转换
 *
 *
 * 值范围较小类型并不是较大类型的子类型，是不能显式转换的
 */
fun  explicitCast(){
    var a:Int? =1
    //编译出错
    //var b:Long?=a
    a = null;
    var b: Long = a!!.toLong()
    println(b)
}
