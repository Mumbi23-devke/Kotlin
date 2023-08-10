fun main(args: Array<String>) {
    var code:Int = readln().toInt()
    when(code){
        1-> println("Buy airtime")
        2-> println("Redeem bonga points")
        3-> println("Buy tubonge")
        4-> println("Buy data bundles")
        5-> println("Hot minutes")
        6-> println("Lipa na mpesa")
        7-> println("Savings account")
        else-> println("Invalid input. Try again")
    }
}
