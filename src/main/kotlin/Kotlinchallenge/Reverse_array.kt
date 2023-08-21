package Kotlinchallenge

fun main(args: Array<String>) {
    println("Enter random numbers. ")

    val nums = readln().toInt()
    val userinputarray = IntArray(nums)

    for (i in 0 until nums){

        userinputarray[i] = readln().toInt()
    }

 val reversal_array = revArray(userinputarray)
 println(reversal_array)
}

fun revArray(intOfArrays: IntArray): IntArray {
    val numsreversed = IntArray(intOfArrays.size)

    for (x in intOfArrays) {

        numsreversed[x] = intOfArrays[intOfArrays.size - x - 1]
    }

    return TODO("Provide the return value")
}
