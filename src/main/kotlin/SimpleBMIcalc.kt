fun main(args: Array<String>) {
    println("Enter your weight in kilograms. ")

    var num1:Float = readLine()!!.toFloat()
    println("Enter your height in metres. ")

    var num2:Float = readLine()!!.toFloat()

    var square = num2 * num2

    var BMI = num1 / square

    println(BMI)

}