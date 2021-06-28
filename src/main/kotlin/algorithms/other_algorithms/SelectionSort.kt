package algorithms.other_algorithms

fun main(vararg: Array<String>) {
    val arr = intArrayOf(8765, 99, 1, 2, 6, 19, 20, 999, 0, -8, 78, 10, -3)
    selectionSort(arr)
    for(i in arr) {
        println(arr)
    }
}

fun selectionSort(arr: IntArray) {
    for (i in arr.indices) {
        var minIdx = 0
        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[i]) {
                minIdx = j
            }
        }
        val temp = arr[minIdx]
        arr[minIdx] = arr[i]
        arr[i] = temp
    }
}
