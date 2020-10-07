package algorithms.other_algorithms;

import java.util.Scanner;

public class SumPrimosNumber {

	public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
	        String l = in.nextLine();
	        System.out.println(calcularSomaNumerosPrimos(l.split(" ")));
        }
	}	
	
	private static final long calcularSomaNumerosPrimos(final String[] numeros) {
		long totalSoma = 0;		
		for (int i = 0; i < numeros.length; i++) {
			int divisores = 0;
			int numero = Integer.parseInt(numeros[i]);
			for (int j = 1; j <= numero; j++) {
				if(numero % j == 0)
					divisores++;	
				if(divisores > 2)
					break;
			}
			if(divisores == 2) {
				totalSoma += numero;
			}
		}
		return totalSoma;
	}
	
}
