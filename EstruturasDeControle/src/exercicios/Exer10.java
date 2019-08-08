package exercicios;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int N1, N2, N3, Menor, Maior;

		System.out.print("Escreva 3 numeros: ");
		
		N1 = entrada.nextInt();
		Menor = N1;
		Maior = N1;
		N2 = entrada.nextInt();
		
		if (N2 > Maior) {
			Maior = N2;
		}
		if (N2 < Menor) {
			Menor = N2;
		}
		
		N3 = entrada.nextInt();
		
		if (N3 > Maior) {
			Maior = N3;
		}
		if (N3 < Menor) {
			Menor = N3;
		}
		
		System.out.println("O maior numero e: " + Maior + ", o menor e: " + Menor);
		
		entrada.close();
	}
}
