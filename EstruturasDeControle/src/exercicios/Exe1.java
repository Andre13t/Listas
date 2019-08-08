package exercicios;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float N1 = 0;
		float N2 = 0;

		System.out.println("Insira o primeiro numero: ");
		N1 = entrada.nextFloat();
		System.out.println("Insira o segundo numero: ");
		N2 = entrada.nextFloat();

		if (N1 > N2) {
			System.out.println("O numero maior e: " + N1);
		} else {
			System.out.println("O numero maior e: " + N2);
		}

		entrada.close();
	}
}
