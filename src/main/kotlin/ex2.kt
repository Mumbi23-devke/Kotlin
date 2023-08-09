fun main(args: Array<String>) {
    println("Enter your marks ")
    var marks:Int = readLine()!!.toInt()
    if (marks in 50..100) {
        println("Congratulations! You passed your exams.")
    }
    else if(marks in 1..49){
        println("Sorry you have to resit your exams. ")
    }
    else{
        println("Invalid value. ")
    }


    println("Enter your points. ")

    var points:Int = readLine()!!.toInt()
    if (points <= 29){
        println("You got an E. ")
    }
    else if (points <= 39) {
        println("You got a D. ")
    }
    else if (points <= 59){
        println("You got a C")
    }
    else if (points <= 70){
        println("You got a B. ")
    }
    else if (points <= 100){
        println("You got an A. ")
    }
    else{
        println("Invalid value. ")
    }
}



