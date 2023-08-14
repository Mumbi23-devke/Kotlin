fun main(args: Array<String>) {

   sayhello()
    printnums(400, 6758)
}
fun sayhello(){
    println("Hellow!!")

 }

fun printnums(num1: Int, num2: Int){
    val sum = addnums(num1, num2)
    println(sum)
}
fun addnums(num1:Int, num2:Int):Int {
    return num1 + num2
}








