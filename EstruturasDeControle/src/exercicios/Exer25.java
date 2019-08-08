package exercicios;

import java.util.Scanner;

public class Exer25 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o valor do saque?");
		int saque = entrada.nextInt();
		int c;
		int[] v = { 100, 50, 25, 10, 5, 1 };

		if ((saque < 10) || (saque > 600)) {
			System.out.println("valor de saque invalido");
		} else {
			for (int i = 0; i < 6; i++) {
				c = (int) Math.floor(saque / v[i]);
				if (saque / v[i] >= 1) {
					System.out.printf("quantidade de notas de %d: %d \n", v[i], c);
					saque %= v[i];
				}
			}
		}
		entrada.close();
	}

}
