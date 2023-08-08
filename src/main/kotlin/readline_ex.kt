fun main(args: Array<String>) {
    println("Enter your age")
    var myage:Int = readLine()!!.toInt()

    if (myage >= 18) {
        println("Welcome to the club.")
    }
    else{
        println("Sorry cannot admit an underage.")
    }
}