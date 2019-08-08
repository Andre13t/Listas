package exercicios;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n = 0;

		System.out.println("Informe um numero: ");
		n = entrada.nextInt();

		if (n > 0) {
			System.out.println("O numero e positivo");

		} else if (n == 0) {
			System.out.println("O número e zero");

		} else {
			System.out.println("O número e negativo");

		}

		entrada.close();
	}
}
