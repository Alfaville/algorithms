package algorithms.hackerrank.implementation;

import java.io.IOException;
import java.util.Scanner;

public class GradingStudents {

	private static final Scanner SCAN = new Scanner(System.in);

	private static int[] gradingStudents(int[] grades) {
		final int failGrade = 40;
		int[] roundGrade = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			int currentGrade = grades[i];
			int numberMultipleFive = getNextMultipleFive(currentGrade);
			if ((numberMultipleFive - currentGrade) < 3 && numberMultipleFive >= failGrade) {
				roundGrade[i] = numberMultipleFive;
			} else
				roundGrade[i] = currentGrade;
		}
		return roundGrade;
	}

	private static final int getNextMultipleFive(int currentNumber) {
		int nextNumber = ++currentNumber;
		while (true) {
			if (nextNumber % 5 == 0) {
				break;
			} else
				nextNumber++;
		}
		return nextNumber;
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(SCAN.nextLine().trim());
		if (n < 0 || n > 60)
			return;

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(SCAN.nextLine().trim());
			if (100 < gradesItem || gradesItem < 0)
				return;
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			System.out.println(result[resultItr]);
		}
	}

}
