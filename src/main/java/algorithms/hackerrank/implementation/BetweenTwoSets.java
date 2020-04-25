package algorithms.hackerrank.implementation;


import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
    https://www.hackerrank.com/challenges/between-two-sets/proble

    Lcm And Gcd (Mmc e Mdc)

    LCM = Máximo Divisor comum entre dois ou mais números naturais é o maior entre seus divisores;
    Quando a divisão for exata, ou seja, resto igual a 0, então tal número é divisor do número dado;
    Ex.:


    LCM(a,b) = (a x b) / GDC(a,b);

    LCM(12,18,48) = 144
    2 - 6, 9, 24
    3 - 2, 3, 8
    2 - 1, 3, 4
    3 - 1, 1, 4
    2 - 1, 1, 2
    2 - 1, 1, 1
    2 x 3 x 2 x 3 x 2 x 2 x 2 = 144

    GCD(12,18,48) = 6
    2 - 6, 9, 24
    3 - 2, 3, 8
    2 - 1, 3, 4
    3 - 1, 1, 4
    2 - 1, 1, 2
    2 - 1, 1, 1
    2 x 3 = 6

 */
public class BetweenTwoSets {

    static int getTotalX(int[] fatores, int[] elementos) {
        List<Integer> elementosLista = Arrays.stream(elementos).boxed().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        Integer menorNumeroElementos = elementosLista.stream().findFirst().get();

        List<Integer> fatoresLista = Arrays.stream(fatores).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Integer maiorNumeroFatores = fatoresLista.stream().findFirst().get();

        List<Integer> guardaNumerosRepetidosA = new ArrayList<>();
        for (int numeroAtual = maiorNumeroFatores; numeroAtual <= menorNumeroElementos; numeroAtual++) {
            int num = 0;
            for (int numeroAtualArrayA = 0; numeroAtualArrayA < fatoresLista.size(); numeroAtualArrayA++) {
                Integer n = fatoresLista.get(numeroAtualArrayA);
                if(numeroAtual % n == 0) {
                    num++;
                    if(fatoresLista.size() == num)
                        guardaNumerosRepetidosA.add(numeroAtual);
                }
            }
        }

        Set<Integer> guardaNumerosRepetidosB = new HashSet<>();
        List<Integer> totalNumerosDivisiveisDistintos = guardaNumerosRepetidosA.stream().distinct().collect(Collectors.toList());
        for (int numeroAtual = 0; numeroAtual < totalNumerosDivisiveisDistintos.size(); numeroAtual++) {
            int num = 0;
            for (int i = 0; i < elementosLista.size(); i++) {
                Integer numero = totalNumerosDivisiveisDistintos.get(numeroAtual);
                if(elementosLista.get(i) % numero == 0) {
                    num++;
                    if(elementosLista.size() == num)
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
