package com.example.kotlinbasics

fun main() {

    val myByte : Byte;
    val myShort : Short;
    val myInt : Int;
    val myLong : Long;
    val myFloat : Float;
    val myDouble : Double;
    val myBoolean : Boolean;
    val myChar : Char;

    var name = "Andersen"
    // show first Character
    println(name[0])
    // show last Character
    println(name[name.length - 1])
    // String interpolation
    println("if name length bigger than 10 is ${name.length > 10}")
    // Increment and decrement operators, prefix and postfix
    var myNum = 5
    myNum += 10
    myNum++
    println("$myNum")



}