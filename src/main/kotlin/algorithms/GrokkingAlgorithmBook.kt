package algorithms

/**
 * https://github.com/egonSchiele/grokking_algorithms
 * https://github.com/cjbt/Free-Algorithm-Books/blob/master/book/Grokking%20Algorithms%20-%20An%20illustrated%20guide%20for%20programmers%20and%20other%20curious%20people.pdf
 */
fun main(args: Array<String>) {
    println(recursiveSum(listOf(5,5,5,5,6,7,10)))
    println(count(listOf(5,5,5,5,6,7,10)))
    println(maxElement(listOf(5,569,999,-8,5,5, 98,5,6,7,10)))

//    println(quicksort(listOf(59,569,999,-8,76,-9,98,5,6,7,10)))
    println(quicksort(listOf(10,5,6,7,1)))

    println(listOf(10,5,6,7,1).binarySearch(7))
}

tailrec fun recursiveSum(list: List<Int>): Int = when {
    list.isEmpty() -> 0
    else -> list[0] + recursiveSum(list.slice(1 until list.size))
}

tailrec fun count(list: List<Any>): Int = when {
    list.isEmpty() -> 0
    else -> 1 + count(list.subList(1, list.size))
}

tailrec fun maxElement(list: List<Int>): Int = when {
    list.isEmpty() -> 0
    else -> {
        val max = maxElement(list.slice(1 until list.size))
        if (list[0] > max) list[0] else max
    }
}

tailrec fun quicksort(list: List<Int>): List<Int> = when {
    list.size < 2 -> list
    else -> {
        val pivo = list[0]
        val smaller = list.slice(1 until list.size).filter { it <= pivo }
        val larger = list.slice(1 until list.size).filter { it > pivo }
        quicksort(smaller) + pivo + quicksort(larger)
    }
}