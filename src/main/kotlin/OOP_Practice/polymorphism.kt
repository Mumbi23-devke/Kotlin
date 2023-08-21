package OOP_Practice

open class polymorphism(val phone:String) {
    open fun phonepage(){
        println("$phone is ringing")
    }
}

class Samsung(type:String): polymorphism(type){
    override fun phonepage() {
        println("$phone has a lot of RAM. ")
    }
}

class iPhone(type: String):polymorphism(type){
    override fun phonepage() {
        println("$phone has a lot of RAM. ")
    }
}


fun main(args: Array<String>) {

    val phone1:polymorphism = Samsung("Galaxy")
    phone1.phonepage()

    val phone2:polymorphism = iPhone("12 Pro Max")
    phone2.phonepage()
}