package algorithms.hackerrank.challenges;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
public class BracketsBalanced {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(isBalanced(in.next())); //Ex: {}( ({)} (( }{ ({()}) {}() {}}{ {}}}
        }
        in.close();
    }

    final static List<String> BRACKET_BALEND_LIST = Arrays.asList("{}", "()");

    public static boolean isBalanced(String bracket) {
        String[] bracketsVector = bracket.split("");

        //check if its odd
        if (bracketsVector.length % 2 != 0) {
            return false;
        }

        int totalElementMatch = checkEndCombinationBrackets(bracketsVector);

        if(totalElementMatch == 0) {
            totalElementMatch = checkCombinationBrackets(bracketsVector);
        }

        return (totalElementMatch != 0 && totalElementMatch % 2 == 0);
    }

    static int checkEndCombinationBrackets(String[] bracketsVector) {
        int totalElementMatch = 0;
        int total = bracketsVector.length;
        for (int i = 0; i < bracketsVector.length / 2; i++) {
            if (BRACKET_BALEND_LIST.contains(bracketsVector[i].concat(bracketsVector[--total]))) { // ({)} (( }{ ({()}) {}}{ {}}}
                totalElementMatch += 2;
            } else {
                totalElementMatch = 0;
            }
        }
        return totalElementMatch;
    }

    static int checkCombinationBrackets(String[] bracketsVector) { //{}()
        String beforeElement = "";
        int totalElementMatch = 0;
        for (int i = 0; i < bracketsVector.length; i++) {
            if (BRACKET_BALEND_LIST.contains(beforeElement.concat(bracketsVector[i]))) {
                totalElementMatch += 2;
            } else {
                totalElementMatch = 0;
            }
            beforeElement = bracketsVector[i];
        }
        return totalElementMatch;
    }

}
//{}({()}) -> false => is it correct?