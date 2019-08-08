package exercicios;

import java.util.Scanner;

public class Exer26 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("informe um número: ");
		int n = entrada.nextInt();

		if (n % 2 == 0) {
			System.out.println("o numero é par");
		} else {
			System.out.println("o numero é impar");
		}
		entrada.close();
	}
}
