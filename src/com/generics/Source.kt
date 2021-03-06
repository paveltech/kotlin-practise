package com.generics

interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>){
    val objects: Source<Any> = strs
}