fun main(args: Array<String>) {
    for (x in 1..100){
        if(x % 5 == 0 && x % 3 ==0 ){
            println("$x is FizzBuzz")
            continue
        }
        else if (x % 3 == 0){
            println("$x is Fizz")
            continue
        }
        else if (x % 5 == 0){
            println("$x is Buzz")
            continue
        }
        else{
            println(x)
        }

    }
}