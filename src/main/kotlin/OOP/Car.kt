package OOP

class Car(make:String, model:String, price:Int) {
    init {
        println(" $make $model and it costs $price")
    }
}

fun main(args: Array<String>) {
    var owner1 = Car("Mazda", "CX-5", 1500000)
    var owner2 = Car("Toyota", "Vellfire", 2500000)

}