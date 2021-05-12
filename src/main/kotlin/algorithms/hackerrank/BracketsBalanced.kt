package algorithms.hackerrank

import java.util.Stack

/**
 * Given a list of strings of bracket characters: {}(), the string of brackets is balanced under the following conditions:
 * 1. It is the empty string
 * 2. If string A and B are balanced, then AB is balanced
 * 3. If string A is balanced, then (A) and {A} are balanced
 * <p>
 * Write a class that determines whether the brackets in each string are balanced and returns true if the string is balanced, or false if it'' not.
 * <p>
 * Example 0
 * <p>
 * s = ["{}()", "{()}", "({()})"]
 * <p>
 * s[0] exhibits contition 2 above. {} and () are balanced, so "{}()" is balanced.
 * s[1] exhibits condition 2 above. () is balanced, so {()} is balanced. Return true.
 * s[2] exhibits condition 3 above. () is balanced, so {()} is balanced and ({()}) is balanced. Return true;
 * <p>
 * Example 1
 * <p>
 * s = ["{}(", "({)}", "((", "}{"]
 * s[0] rarr 2. {}( is an unbalanced string due to the open (. Return false.
 * s[1] rarr 2. ({)} is an unbalanced string due to ) before { has been closed. Return false.
 * s[2] rarr 2. (( is an unbalanced string because neither ( is cloed. Return false
 * s[3] rarr 2. }{ is an unbalanced string because } comes before { and because the final { is not closed. Return false.
 * <p>
 * Constraints
 * - Each string consists only of the characters {, }, ( and )
 * - Each string has fewer then 50 characters
 */
fun main(args: Array<String>) {
    reduceBracket(listOf("{}()", "{()}", "({()})"))
    println("-".repeat(10))

    reduceBracket(listOf("({)}", "((", "}{", "({()})", "{}}{", "{}}}"))
    println("-".repeat(10))

    reduceBracket(listOf("{}(", "({)}", "((", "}{"))
    println("-".repeat(10))

    listOf("{}()", "{()}", "({()})").forEach { isBalanced(it) }
    println("-".repeat(10))

    listOf("({)}", "((", "}{", "({()})", "{}}{", "{}}}").forEach { isBalanced(it) }
    println("-".repeat(10))

    listOf("{}(", "({)}", "((", "}{").forEach { isBalanced(it) }
}

fun reduceBracket(bracket: List<String>) {
    bracket.forEach {
        var isBalanced = reduceBracket(it)
        println("$it - $isBalanced")
    }
}

fun reduceBracket(bracket: String): Boolean {
    val replaceBracket = bracket.replace("()", "").replace("{}", "")
    if(replaceBracket != bracket)
        return reduceBracket(replaceBracket)
    else
       return replaceBracket.isEmpty()
}

fun isBalanced(expression: String): Boolean {
    return if (expression.length % 2 == 1) false
    else {
        val s = Stack<Char>()
        for (bracket in expression.toCharArray()) when (bracket) {
            '{' -> s.push('}')
            '(' -> s.push(')')
            '[' -> s.push(']')
            else -> {
                if (s.isEmpty() || bracket != s.peek()) {
                    return false
                }
                s.pop()
            }
        }
        s.isEmpty()
    }
}