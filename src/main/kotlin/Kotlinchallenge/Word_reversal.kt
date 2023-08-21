package Kotlinchallenge

fun main(args: Array<String>) {
    println("Create any sentence. ")
    val sentence = readln()?:""

    var wordsplit = sentence.split("")
    var reverse = wordsplit.reversed()
    println(reverse.joinToString (""))

}