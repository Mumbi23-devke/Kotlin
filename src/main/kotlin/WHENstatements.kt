fun main(args: Array<String>) {
    println("Enter number to indicate floor. ")

    var floor = readln().toInt()

    when(floor){

        1-> println("Go to first floor")
        2-> println("Go to second floor")
        3-> println("Go to third floor")
        4-> println("Go to fourth floor")
        else-> println("No floor after fourth")
    }

}