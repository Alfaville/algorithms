package algorithms.hackerrank.stack

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

/**
 * https://www.hackerrank.com/challenges/simple-text-editor/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 *      operation
 *      index   S       ops[index]  explanation
 *      -----   ------  ----------  -----------
 *      0       abcde   1 fg        append fg
 *      1       abcdefg 3 6         print the 6th letter - f
 *      2       abcdefg 2 5         delete the last 5 letters
 *      3       ab      4           undo the last operation, index 2
 *      4       abcdefg 3 7         print the 7th characgter - g
 *      5       abcdefg 4           undo the last operation, index 0
 *      6       abcde   3 4         print the 4th character - d
 *
 *
 *      STDIN   Function
 *      -----   --------
 *      8       Q = 8
 *      1 abc   ops[0] = '1 abc'
 *      3 3     ops[1] = '3 3'
 *      2 3     ...
 *      1 xy
 *      3 2
 *      4
 *      4
 *      3 1
 *
 *      Output:
 *      c
 *      y
 *      a
 */
fun main(args: Array<String>) {

    val br = BufferedReader(InputStreamReader(System.`in`))
    br.use {
        var totalOperation: Int = br.readLine().toInt()
        val text = StringBuilder()
        val stack = ArrayDeque<String>()
        stack.addFirst(text.toString())
        while (totalOperation-- > 0) {
            val line = br.readLine().split(" ")
            val operationType: Int = line[0].toInt()
            val operationValue: String = line[1]
            when(operationType) {
                1 -> {
                    text.append(operationValue)
                    stack.addFirst(text.toString())
                }
                2 -> {
                    text.setLength(text.substring(0, text.length - operationValue.toInt()).length)
                    stack.addFirst(text.toString())
                }
                3 -> println(text[operationValue.toInt() - 1])
                else -> {
                    stack.removeFirst()
                    text.setLength(0)
                    text.append(stack.first())
                }
            }
        }
    }

}
