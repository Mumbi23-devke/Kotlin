package OOP.Abstraction

abstract class Plants(val name:String) {
    abstract fun grow()

    fun time(){
        println("$name are plants. ")
    }
}

class Flower(name: String):Plants(name){
    override fun grow() {
        println("$name grow well in the summer. ")
    }
}

class Tree(name: String):Plants(name){
    override fun grow() {
        println("$name has a really thick bark. ")
    }
}

fun main(args: Array<String>) {
    val plant1:Plants = Flower("Tulips")
    val plant2:Plants = Tree("Mahogany")

    plant1.grow()
    plant1.time()

    plant2.grow()
    plant2.time()
}