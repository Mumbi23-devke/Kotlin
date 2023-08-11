fun main(args: Array<String>) {
    println("Enter the first number")
    var num1:Int = readln().toInt()

    println("Enter the second number")
    var num2:Int = readln().toInt()

    for (x in num1..num2){
        if(x % 5 == 0 && x % 3 ==0 ){
            println("$x is FizzBuzz")
            continue
        }
        else if (x % 3 == 0){
            println("$x is Fizz")
            continue
        }
        else if (x % 5==0){
            println("$x is Buzz")
            continue
        }
        else{
            println(x)
        }

    }
}