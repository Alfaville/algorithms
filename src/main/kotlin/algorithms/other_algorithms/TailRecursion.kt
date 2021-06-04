package algorithms.other_algorithms

fun main(args: Array<String>) {
    println(factorial(5))
    println(optimizedFactorial(5))
}

fun factorial(num: Int): Int {
    return if (num == 0) 1 else num * factorial(num - 1)
}

tailrec fun optimizedFactorial(num: Int, output: Int = 1): Int {
    return if (num == 0) output
    else optimizedFactorial(num - 1, output * num)
}