package algorithms.hackerrank.implementation.medium;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/magic-square-forming/problem
 */
public class FormingMagicSquareSolution {

    // Complete the formingMagicSquare function below.
    public static int formingMagicSquare(int[][] s) {
        int numeroPar = 0;
        for (int i = 0; i < s.length; i += 2) {
            for (int j = 0; j < s.length; j += 2) {
                if (numeroPar == s[i][j]) {

                }
                if (s[i][j] % 2 != 0) {
                    numeroPar = s[i][j];
                }
            }
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        //DIAGONAL
        final int magicValue = 15;
        final int magicCenterValue = 5;
        int totalOperationCount = 0;

        int diagonalSum = 0;
        for (int i = 0; i <= s.length - 1; i++) { //Diagonal
            if (i == 1 && s[i][i] != magicCenterValue) {
                s[i][i] = magicCenterValue;
                totalOperationCount += Math.abs(s[i][i] - magicCenterValue);
            } else if (s[i][i] % 2 != 0 && i != 1) {
                if(s[i][i] == 9) {
                    --s[i][i];
                }  else {
                    ++s[i][i];
                }
                ++totalOperationCount;
            }
            diagonalSum += s[i][i];
        }
        int diferenca = diagonalSum - magicValue;
        totalOperationCount += Math.abs(diferenca);
        if (diferenca < 0) {
            s[2][2] += Math.abs(diferenca);
        } else if (diferenca > 0) {
            s[2][2] -= diferenca;
        }

        //LADO X
        int xSum = 0;
        for (int i = 0; i <= s.length - 1; i++) {
            if (s[0][i] % 2 != 0 && i != 1) {
                ++s[0][i];
                ++totalOperationCount;
            } else if (s[0][i] % 2 == 0 && i == 1) {
                ++s[0][i];
                ++totalOperationCount;
            }
            xSum += s[0][i];
        }


        diferenca = xSum - magicValue;
        totalOperationCount += Math.abs(diferenca);
        if (diferenca < 0) {
            s[0][1] += Math.abs(diferenca);
        } else if (diferenca > 0) {
            s[0][1] -= diferenca;
        }

        //LADO Y
        int ySum = 0;
        for (int i = 0; i <= s.length - 1; i++) {
            if (s[i][0] % 2 != 0 && i != 1) {
                ++s[i][0];
                ++totalOperationCount;
            } else if (s[i][0] % 2 == 0 && i == 1) {
                ++s[i][0];
                ++totalOperationCount;
            }
            ySum += s[i][0];
        }
        diferenca = ySum - magicValue;
        totalOperationCount += Math.abs(diferenca);
        if (diferenca < 0) {
            s[1][0] += Math.abs(diferenca);
        } else if (diferenca > 0) {
            s[1][0] -= diferenca;
        }

        //LADO X INVERTIDO
        int xInvetidoSum = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i][2] % 2 != 0 && i != 1) {
                ++s[i][2];
                ++totalOperationCount;
            } else if (s[i][2] % 2 == 0 && i == 1) {
                ++s[i][2];
                ++totalOperationCount;
            }
            xInvetidoSum += s[i][2];
        }
        diferenca = xInvetidoSum - magicValue;
        totalOperationCount += Math.abs(diferenca);
        if (diferenca < 0) {
            s[1][2] += Math.abs(diferenca);
        } else if (diferenca > 0) {
            s[1][2] -= diferenca;
        }

        //LADO y INVERTIDO
        int yInvetidoSum = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[2][i] % 2 != 0 && i != 1) {
                ++s[2][i];
                ++totalOperationCount;
            } else if (s[2][i] % 2 == 0 && i == 1) {
                ++s[2][i];
                ++totalOperationCount;
            }
            yInvetidoSum += s[2][i];
        }
        diferenca = yInvetidoSum - magicValue;
        totalOperationCount += Math.abs(diferenca);
        if (diferenca < 0) {
            s[2][1] += Math.abs(diferenca);
        } else if (diferenca > 0) {
            s[2][1] -= diferenca;
        }

        int result = totalOperationCount; //formingMagicSquare(s);

        System.out.println("OPERACOES: "+result);
        System.out.println(s);
        scanner.close();
    }

}

/*
Case 1
4 1 5
7 6 4
7 2 2

- Se as extremidades que deveriam ser pares forem igual a 9, decrementa 1
4* 1  5
7  5* 4
7  2  2*

------------
pontas do quadrado impares são convertidos para pares
SUM(4 5 2) = 11 - 15 = -4
arr[2,2] = 2 + |-4| = 6

4* 1  5
7  5* 4
7  2  6*

COAT DIAGONAL: |6 - 5| + |2 - 6| = 5
------------

SUM(4 1 6) = 11 - 15 = -4
arr[0,1] = 1 + |-4| = 5

4* 5* 6*
7  5  4
7  2  6

COAT LADO X: |5 - 6| + |1 - 5| = 5
------------

SUM(4 7 8) = 19 - 15 = 4
arr[1,0] = 7 - 4 = 3

4* 5  6
3* 5  4
8* 2  6

COAT LADO Y: |7 - 8| + | 7 - 4| = 4
------------
Inversao
------------

SUM(8 3 6) = 17 - 15 = 2
arr[1,0] = 3 - 2 = 1

4  5  6
3  5  4
8* 1* 6*

COAT LADO X INVERTIDO: |2 - 3| + |3 - 1| = 3
------------

SUM(6 5 6) = 17 - 15 = 2
arr[1,2] = 5 - 2 = 3

4  7  4*
7  5  3*
4  3  8*

COAT LADO Y INVERTIDO: |6 - 5| + |5 - 3| = 3

COST TOTAL: 20
 */
