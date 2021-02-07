package algorithms.daily_interview_pro;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Nov 25, 2020
 * Hi, here's your problem today. This problem was recently asked by Amazon:
 *
 * You are given a 2D array of characters, and a target string. Return whether or not the word target word exists in the matrix.
 * Unlike a standard word search, the word must be either going left-to-right, or top-to-bottom in the matrix.
 *
 * Example:
 *
 * [['F', 'A', 'C', 'I'],
 *  ['O', 'B', 'Q', 'P'],
 *  ['A', 'N', 'O', 'B'],
 *  ['M', 'A', 'S', 'S']]
 *
 * Given this matrix, and the target word FOAM, you should return true, as it can be found going up-to-down in the first column.
 *
 * Here's the function signature:
 *
 * def word_search(matrix, word):
 *   # Fill this in.
 *
 * matrix = [
 *   ['F', 'A', 'C', 'I'],
 *   ['O', 'B', 'Q', 'P'],
 *   ['A', 'N', 'O', 'B'],
 *   ['M', 'A', 'S', 'S']]
 * print word_search(matrix, 'FOAM')
 * # True
 *
 */
public class WordSearch {

    //https://bk2coady.medium.com/daily-coding-problem-63-ce34bdb3fd7c
    public static boolean execute(Character[][] matrix, String targetWord) {
        Map<Character, Integer> target = new HashMap<>();
        for (int i = 0; i < targetWord.length(); i++) {
            target.put(targetWord.charAt(i), i);
        }

        StringBuilder encontradoLinha = new StringBuilder();
        StringBuilder encontradoColuna = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            encontradoLinha.setLength(0);
            encontradoColuna.setLength(0);
            for (int j = 0; j < matrix.length; j++) {

                char letraLinha = matrix[i][j];
                if(target.containsKey(letraLinha)) {
                    encontradoLinha.append(letraLinha);
                } else {
                    encontradoLinha.setLength(0);
                }

                char letraColuna = matrix[j][i];
                if(target.containsKey(letraColuna)) {
                    encontradoColuna.append(letraColuna);
                } else {
                    encontradoColuna.setLength(0);
                }

                if (encontradoLinha.toString().equals(targetWord) || encontradoColuna.toString().equals(targetWord)) {
                    return true;
                }
            }
        }
        return false;
    }

}
