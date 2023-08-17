package OOP.Abstraction

abstract class Seacreatures(val name:String) {

    //abstract method
    abstract fun makesound()

    //general method

    fun describe(){
        println("$name is a sea creature. ")
    }
}

//subclass of a sea creature

class Fish(name: String): Seacreatures(name){
    override fun makesound() {
        println("$name makes a blup blup sound. ")
    }
}

//another subclass

class Whale(name: String): Seacreatures(name) {
    override fun makesound() {
        println("$name makes a deep underwater noise. ")
    }
}

class Turtle(name:String):Seacreatures(name){
    override fun makesound() {
        println("$name makes a croaking sound. ")
    }
}

fun main(args: Array<String>) {

    val creature1:Seacreatures = Fish(name = "Nemo")
    val creature2:Seacreatures = Whale(name = "Bruce")
    val creature3:Seacreatures = Turtle("Crush")

    creature1.describe()
    creature1.makesound()

    creature2.describe()
    creature2.makesound()

    creature3.describe()
    creature3.makesound()
}