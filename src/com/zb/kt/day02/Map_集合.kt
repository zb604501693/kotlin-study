package com.zb.kt.day02

/**
 * Created by BG317957 on 2017/11/14.
 */


//不可变map
val linkedmap: Map<String,Int> = mapOf<String,Int>("java" to 1,"kotlin" to 2,"scala" to 3)
val hashmap: Map<String,Int> = hashMapOf<String,Int>("java" to 1,"kotlin" to 2,"scala" to 3)

//可变map
var map_param:Map<String,Int> = mutableMapOf<String,Int>("java" to 1,"kotlin" to 2,"scala" to 3)


fun main(args: Array<String>) {
    //class java.util.LinkedHashMap
    println(linkedmap.javaClass)
    //class java.util.HashMap
    println(hashmap.javaClass)

    map_param.plus("c#" to 1)
    hashmap.plus("c#" to 1)
}
