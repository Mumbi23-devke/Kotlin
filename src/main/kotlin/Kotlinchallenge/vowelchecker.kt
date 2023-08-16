package Kotlinchallenge

fun main(args: Array<String>) {
    println("Enter any letter")
    val letter = readln().toString().trim()

    if ( letter.isBlank())
        println("Empty submission. Try again")
    else {
        val char = letter[0].toLowerCase()

        val result = if (char in "a,e,i,o,u") {
            println("$char is a vowel")
        } else {
            println("$char is a consonant")
        }
    }
}

