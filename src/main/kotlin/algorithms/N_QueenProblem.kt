package algorithms.book.computer_science_distilled

/**
 * Backtracking can be defined as a general algorithmic technique that considers searching every possible combination in order to solve a computational problem.
 *
 * Ex.: Consider a situation that you have three boxes in front of you and only one of them has a gold coin in it, but you don’t know which one.
 * So, in order to get the coin, you’ll have to open all of the boxes one by one. You’ll first check the first box, if it doesn’t contain the coin,
 * you’ll have to close it and check the second box and so on until you find the coin. This is what backtracking is,
 * that is solving all sub-problems one by one in order to reach the best possible solution.
 */

fun main(args: Array<String>) {
    val matrixN = arrayOf(
        intArrayOf(0, 1, 0, 0),
        intArrayOf(0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0),
        intArrayOf(0, 0, 1, 0),
    )
    nQueen(matrixN)
}

fun nQueen(matrixN: Array<IntArray>) {

}