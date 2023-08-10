import java.util.Calendar

fun main(args: Array<String>) {
    println("Enter your birth year ")
    var birth_year:Int = readln().toInt()
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var result = year - birth_year

    println("You are $result years old")

}