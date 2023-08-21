package Kotlinchallenge

fun main(args: Array<String>) {
    println("Enter a year to determine if it is leap or not. ")
    val year = readln().toInt()

        if (year % 4 == 0){
            println("$year is a leap year.")
        }
        else{
            println("$year is not a leap year.")
        }
    }
