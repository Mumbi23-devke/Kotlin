package Kotlinchallenge

fun main(args: Array<String>) {

    println("Enter a number")
    var number: Int = readln().toInt()

    if (number == null) {
        println("Please enter a valid number")
    } else {
        var result = if (number % 2 == 0) {
            println("$number is an even number")
        } else {
            println("$number is an odd number")
        }
    }
}
