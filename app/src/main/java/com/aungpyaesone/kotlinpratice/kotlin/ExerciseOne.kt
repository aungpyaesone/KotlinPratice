package com.aungpyaesone.kotlinpratice.kotlin

import java.util.*


fun main(args: Array<String>){

    val scanner = Scanner(System.`in`)
    print("Enter number =>")
    checkNumber(scanner.next().toInt())


}

private fun checkNumber(input:Int){
    var num = input
    var reversedInteger = 0
    var remainder:Int
    val originalInteger = num

    // reverse integer is stored in variable
    while(num != 0){
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }
    if(originalInteger == reversedInteger ){
        println("$originalInteger is a palindrome ")
    }else{
        println("$originalInteger is not a palindrome")
    }
}