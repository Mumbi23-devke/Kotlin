package OOP

open class Animal(color:String, legs:String, breed:String, gender:String) {
    init {
        println("It is a $color , $gender , $breed with $legs legs")

    }
}

class Dog(name:String) : Animal(color = "Brown", legs = "four", breed = "Husky", gender = "Female")

fun dogname(){
    println("Rex")
}

fun main(args: Array<String>) {
    var dog1 = Dog("Rex")

}