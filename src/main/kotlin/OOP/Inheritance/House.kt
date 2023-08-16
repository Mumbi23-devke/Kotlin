package OOP.Inheritance

class House(location:String, type:String, owner:String) {
    init {
        println("$owner owns a $type in $location")
    }
}

fun main(args: Array<String>) {
    var location1 = House("Ontario" , "Beach House", "Mumbi")
    var location2 = House("Missouri" , "Villa", "Njeri")
    var location3 = House("California" , "Mansion", "Davina")
    var location4 = House("New York" , "Penthouse", "Noni")
}