package Kotlinchallenge


fun charcountoccurrence(input:String, chartag:Char): Int {
    var charcount:Int = 0
    for (x in input){
        if (x == chartag){
            charcount += 1
        }

    }
        return charcount

}
fun main(args: Array<String>) {
    println("Enter a word or phrase. ")
    val datastringinput = readln() ?: ""

    println("Enter any letter to check for occurrences. ")
    val mytargetchar = readln()?.get(0) ?:' '


    val charoccurrence = charcountoccurrence(datastringinput, mytargetchar)

    println("$mytargetchar appears $charoccurrence times")
}