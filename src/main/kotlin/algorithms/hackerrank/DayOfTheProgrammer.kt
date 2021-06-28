package algorithms.hackerrank

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
private const val DAY_OF_PROGRAMMER = 256

fun main(args: Array<String>) {
    println(dayOfProgrammer(1800))
    println(dayOfProgrammer(1918))
    println(dayOfProgrammer(2020))
    println(dayOfProgrammer(2017))
}

fun dayOfProgrammer(year: Int): String {
    val constraint = (year < 1700 || year > 2700)
    if(constraint) {
        throw IllegalArgumentException("Wrong year!")
    }

    var totalDaysYear = if (year % 4 == 0) 244 else 243
    val isGregorianCalendar = (year > 1918)
    if(isGregorianCalendar) {
        totalDaysYear = if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 244 else 243
    }
    return if (year == 1918) {
        "26.09.$year"
    } else {
        "${DAY_OF_PROGRAMMER - totalDaysYear}.09.$year"
    }
}