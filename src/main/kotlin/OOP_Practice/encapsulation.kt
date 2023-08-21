package OOP_Practice

open class encapsulation(private val number: String, private val balance: Double){
    fun getinfo():String{
        return "Number: $number, Account Balance: $balance"
    }
}

fun main(args: Array<String>) {
    val number1 = encapsulation("+44 57693-0294", 687058.00)

    println(number1.getinfo())
}