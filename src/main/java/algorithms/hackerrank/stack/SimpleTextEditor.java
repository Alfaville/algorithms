package algorithms.hackerrank.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

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
public class SimpleTextEditor {

    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int totalOperation = Integer.parseInt(in.readLine());
            StringBuilder text = new StringBuilder();
            Deque<String> stack = new ArrayDeque<>();
            stack.addFirst(text.toString());
            while (totalOperation-- > 0) {
                final String[] line = in.readLine().split(" ");
                final int operationType = Integer.parseInt(line[0]);
                switch (operationType) {
                    case 1:
                        text.append(line[1]);
                        stack.addFirst(text.toString());
                        break;
                    case 2:
                        text.setLength(text.substring(0, text.length() - Integer.parseInt(line[1])).length());
                        stack.addFirst(text.toString());
                        break;
                    case 3:
                        System.out.println(text.charAt(Integer.parseInt(line[1]) - 1));
                        break;
                    default:
                        stack.removeFirst();
                        text.setLength(0);
                        text.append(stack.peek());
                }
            }
        }
    }

}
