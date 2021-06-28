package algorithms

fun main(args: Array<String>) {
    println(recursiveSum(listOf(5,5,5,5,6,7,10)))
}

fun sum(a: Long, b: Long) = a + b

tailrec fun recursiveSum(list: List<Int>): Int {
    return if(list.isEmpty())
        0
    else {
        val positionZero = list[0]
        val recursionReturn = recursiveSum(list.slice(1 until list.size))
        positionZero + recursionReturn
    }
}