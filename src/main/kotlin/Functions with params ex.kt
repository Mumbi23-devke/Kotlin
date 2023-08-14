fun main(args: Array<String>) {

    println("Enter the first number")
    var num_1 = readln().toInt()

    println("Enter the second number")
    var num_2 = readln().toInt()

   printnumbers(num_1, num_2 )
}


fun printnumbers(number1: Int, number2: Int){

    val answer = addnumbers(number1, number2)
    println(answer)
}


fun addnumbers(number1:Int, number2:Int):Int{
    return number1 + number2
}