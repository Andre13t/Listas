package exercicios;

import java.util.Scanner;

public class Exer27 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("informe um numero");
		float n = entrada.nextFloat();
		
		if (n % 1 == 0) {
			System.out.println("Inteiro");
		} else {
			System.out.println("Decimal");
		}
		entrada.close();
	}
}
