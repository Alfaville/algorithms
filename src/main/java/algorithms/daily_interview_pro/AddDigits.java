package algorithms.daily_interview_pro;

/**
 * Hi, here's your problem today. This problem was recently asked by Amazon:
 * <p>
 * Given a number like 159, add the digits repeatedly until you get a single number.
 * <p>
 * For instance, 1 + 5 + 9 = 15.
 * 1 + 5 = 6.
 * <p>
 * So the answer is 6.
 * <p>
 * class Solution(object):
 * # Fill this in.
 * <p>
 * print(Solution().addDigits(159))
 * # 1 + 5 + 9 = 15
 * # 1 + 5 = 6
 * # 6
 */
public class AddDigits {

    public static int solution(int number) {
        int digitSum = 0, beforeStateNumber = number;
        while (number > 0) {
            digitSum += number % 10;
            if(digitSum > 9) {
                digitSum = 0;
                number = beforeStateNumber / 10;
                beforeStateNumber = number;
                continue;
            }
            number /= 10;
        }
        return digitSum;
    }

}
