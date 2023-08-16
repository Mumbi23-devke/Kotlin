package OOP.Polymorphism

//superclass
open class Building(val type:String){
    open fun opendoor(){
        println("$type door is opening")
    }
}

//subclass

class House(type: String): Building(type){
    override fun opendoor(){
        println("$type house door is opening")
    }
}

class Apartment(type: String): Building(type){
    override fun opendoor(){
        println("$type house door is opening")
    }
}

class Beach(type: String): Building(type){
    override fun opendoor() {
        println("$type house door is opening")
    }
}

fun main(args: Array<String>) {
    var building1:Building = House("The villa") // House object is being treated like a building!!
    building1.opendoor() // Calls the overridden method in House

    var building2:Building = Apartment("The beach house")
    building2.opendoor()

    var building3:Building = Beach("The apartment")
    building3.opendoor()
}