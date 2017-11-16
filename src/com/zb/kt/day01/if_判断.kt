package com.zb.kt.day01

/**
 * Created by BG317957 on 2017/11/16.
 */

/**
 * 在kotlin中，没有三元表达式
 */
fun main(args: Array<String>) {

}


fun max(a:Int,b:Int):Int{
    /*if(a>b){
        return a
    }else{
        return b
    }*/
    return if(a>b) a else b
}