/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package algorithms.hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 In a computer security course, you just learned about password decryption. Your fellow student has created their own password encryption method, and they’ve asked you to test how secure it is. Your task is to recover the original password given the encrypted password provided to you by your classmate.

 At first, it seems impossible. But one day after class, you catch a peek of your classmate’s notebook where the encryption process is noted. You snap a quick picture of it to reference later. It says this:

 Given string s, let s[I] represent the character in the string s, using 0-based indexing.

 1. Initially I = 0;
 2. If s[I] is lowercase and the next character s[I+1] is uppercase, swap them add a ‘*’ after them, and move to I+2;
 3. if s[I] is number, replace it with 0, place the original number at the start, and move to I+1;
 4. Else, move to I+1;
 5. Stop if i is more then or equal string to the string length. Otherwise, go to step 2;

 There’s even an example mentioned in the notebook. When encrypted, the string “hAck3rr4nk” becomes “43Ah*ck0rr0nk” (Note: the original string, “hAck3rr4nk” does not contain the character 0);

 Note:
 - The original string always contains digits from 1 to 9 and does not contain 0;
 - The original string always contains only alpha-numeric characters;

 Using this information, your task is to determine the original password (before encryption) when given the encrypted password from you classmate;

 Function Description:
 Complete the function decryptPassword and function must return the original password before it was encrypted by your classmate;

 decryptPassword has the following parameter:
 s: the password string after it was encrypted by your classmate;

 Constaints:
 s can contain Latin alphabet characters (a-zA-Z), numbers (0-9), and the character ‘*’

 Sample 0:
    input:  51Pa*0Lp*0e
    output: aP1pL5e

 Explanation:


 If we apply the sequence of operations on the string aP1pL5e, we get the string 51Pa*0Lp*0e.

 1. We start at the letter a since I=0;
 2. Since a is lowercase and the next character P is uppercase, we swap them, add a ‘*’ after, and move to the next designated character (I+2). So currently it is Pa*1pL5e;
 3. Now we’re on the character 1. This is a number, so we replace it with 0, put the original number 1 ar the start, and continue to the next character (I+1). Now it is 1Pa*0pL5e;
 4. We’re still in the middle of the string (I does not equals the string length), so we repeat the process again;

 After that, 1Pa*0pL5e becomes 1Pa*0Lp*5e, Then, 1Pa*0Lp*5e becomes 51Pa*0Lp*0e. Since e is at the end of the string, it can’t be swapped with the next character. Thus, aP1pL5e becomes 51Pa*0Lp*0e when encrypted

 */
public class DecryptPassword {

    public static String decryptPassword(String s) {
        StringBuilder decryptPassword = new StringBuilder(s);
        char beforeAux = ' ';
        int chaNumericCount = 0;
        Map<Integer, Character> numericMap = new HashMap<>();
        for (int i = 0; i < decryptPassword.length(); i++) {
            char ch = decryptPassword.charAt(i);

            if(Character.isDigit(ch) && Character.getNumericValue(ch) != 0) {
                numericMap.put(chaNumericCount, ch);
                decryptPassword.deleteCharAt(i);
                i = -1;
                chaNumericCount++;
            }

            if(Character.isDigit(ch) && Character.getNumericValue(ch) == 0) {
                decryptPassword.replace(i,i+1, numericMap.get(--chaNumericCount).toString());
            }

            if(Character.isUpperCase(beforeAux) && Character.isLowerCase(ch)) {
                decryptPassword.replace(i - 1, i + 2, ch + "" + beforeAux);
            }
            beforeAux = ch;
        }
        return decryptPassword.toString();
    }

}

