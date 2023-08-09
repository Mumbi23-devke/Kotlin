fun main(args: Array<String>) {
    println("Enter your marks ")
    val marks:Int = readln().toInt()
    if (marks in 1..29){
        println("You scored an E. ")
    }
    else if (marks in 30..39){
        println("You scored a D. ")
    }
    else if (marks in 40..55){
        println("You scored a C. ")
    }
    else if (marks in 56..70){
        println("You scored a B. ")
    }
    else if (marks in 71..100){
        println("You scored an A. ")
    }
    else{
        println("You have entered an invalid value")
    }

}