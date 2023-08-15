package Kotlinchallenge

fun main(args: Array<String>) {
    println("Enter any letter")
    var letter1:Char = 'a'
    var letter2:Char = 'z'

    if ( letter1 in listOf<Char>('a','e','i','o','u'))
        println("$letter1 is a vowel")
    else{
        println("$letter1 is a consonant")
    }

}

