package Kotlinchallenge

import java.util.Scanner
@Suppress("IMPLICIT_CAST_TO_ANY")
fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    println("Enter first number")
    val num1 = input.nextInt()

    println("Enter an operator ('+','-', '*' or '/')")
    val operator = input.next()[0]

    println("Enter second number")
    val num2 = input.nextInt()


    val result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2

    else -> {
        println("Invalid operation. Try again")

    }


    }
}
