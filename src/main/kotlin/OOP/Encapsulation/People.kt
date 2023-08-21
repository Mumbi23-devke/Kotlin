package OOP.Encapsulation

//Offering data protection to an outside world

open class People(private val name:String, private val age:Int) {
    fun getpersoninfo():String{
        return "Name: $name, Age: $age"
    }

}
// Call getpersoninfo instead of name so that it becomes visible

fun main(args: Array<String>) {
    val person1 = People("Jamie", 6)

    println(person1.getpersoninfo())

}