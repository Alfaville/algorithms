package hackerrank.implementation;


import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */
public class BetweenTwoSets {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] fatores, int[] elementos) {
        List<Integer> listB = Arrays.stream(elementos).boxed().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        Integer menorNumeroB = listB.stream().findFirst().get();

        List<Integer> listA = Arrays.stream(fatores).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Integer maiorNumeroA = listA.stream().findFirst().get();

        List<Integer> guardaNumerosRepetidosA = new ArrayList<>();
        for (int numeroAtual = maiorNumeroA; numeroAtual <= menorNumeroB; numeroAtual++) {
            int num = 0;
            for (int numeroAtualArrayA = 0; numeroAtualArrayA < listA.size(); numeroAtualArrayA++) {
                Integer n = listA.get(numeroAtualArrayA);
                if(numeroAtual % n == 0) {
                    num++;
                    if(listA.size() == num)
                        guardaNumerosRepetidosA.add(numeroAtual);
                }
            }
        }

        Set<Integer> guardaNumerosRepetidosB = new HashSet<>();
        List<Integer> totalNumerosDivisiveisDistintos = guardaNumerosRepetidosA.stream().distinct().collect(Collectors.toList());
        for (int numeroAtual = 0; numeroAtual < totalNumerosDivisiveisDistintos.size(); numeroAtual++) {
            int num = 0;
            for (int i = 0; i < listB.size(); i++) {
                Integer numero = totalNumerosDivisiveisDistintos.get(numeroAtual);
                if(listB.get(i) % numero == 0) {
                    num++;
                    if(listB.size() == num)
                        guardaNumerosRepetidosB.add(numero);
                }
            }
        }
        return guardaNumerosRepetidosB.size();
    }

    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            String[] nm = scan.nextLine().split(" ");

            int n = Integer.parseInt(nm[0].trim());

            int m = Integer.parseInt(nm[1].trim());

            int[] a = new int[n];
            String[] aItems = scan.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];
            String[] bItems = scan.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int total = getTotalX(a, b);
            System.out.println(total);
        }
    }

}
