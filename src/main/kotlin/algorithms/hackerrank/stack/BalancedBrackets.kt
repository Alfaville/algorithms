package algorithms.hackerrank

/**
 * https://www.hackerrank.com/challenges/balanced-brackets/problem
 */
fun isBalanced(s: String): String {
    if(s.length % 2 == 1) {
        return "NO"
    } else {
        val stack = ArrayDeque<Char>()
        for (word in s) when (word) {
            '(' -> stack.addFirst(')')
            '[' -> stack.addFirst(']')
            '{' -> stack.addFirst('}')
            else -> {
                if(stack.isEmpty() || stack.removeFirst() != word) {
                    return "NO"
                }
            }
        }
        return if (stack.isEmpty())  "YES" else "NO"
    }
}

fun isBalancedWithoutStack(s: String): String {
    var n = -1
    var brackets = s
    while(brackets.length != n) {
        n = brackets.length
        brackets = brackets.replace("()", "")
        brackets = brackets.replace("[]", "")
        brackets = brackets.replace("{}", "")
    }
    return if(brackets.isEmpty()) "YES" else "NO"
}