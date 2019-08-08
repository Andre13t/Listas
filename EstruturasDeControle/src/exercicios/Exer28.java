package exercicios;

import java.util.Scanner;

public class Exer28 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float n = entrada.nextFloat();

		System.out.println("informe um numero: ");

		if (n % 2 == 0) {
			System.out.print("número par, ");
		} else {
			System.out.print("número impar, ");
		}
		if (n < 0) {
			System.out.print("Negativo ");
		} else {
			System.out.print("Positivo ");
		}
		if (n % 1 == 0) {
			System.out.print("e Inteiro");
		} else {
			System.out.print("e Decimal");
		}
		entrada.close();
	}
}
