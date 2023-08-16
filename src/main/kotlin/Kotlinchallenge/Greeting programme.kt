fun main(args: Array<String>) {
    println("What is your name? ")

    val name:String = readln().toString()
    if(name.isBlank()){
        println("Please enter a valid name")
    }
    else{
        println("How you doing $name :-)")
    }

}