package algorithms.other_algorithms

fun main(vararg: Array<String>) {
    var result: Boolean = isPalindromeRecursion("racecar")
    println(result)

    result = isPalindromeIteration("racecar")
    println(result)
}

fun isPalindromeIteration(word: String): Boolean {
    var w = word
    for (i in 0..(w.length / 2)) {
        if (w.length <= 1) {
            return true
        }
        if (w.first() != w.last()) {
            return false
        }

        w = w.removeFirstAndLastChar()
    }
    return true
}

fun isPalindromeRecursion(word: String): Boolean {
    if (word.length <= 1) {
        return true
    }
    if (word.first() != word.last()) {
        return false
    }
    val w = word.removeFirstAndLastChar()
    return isPalindromeRecursion(w)
}

fun String.removeFirstAndLastChar(): String = this.removeSurrounding(this.first().toString(), this.last().toString())
