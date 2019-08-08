package exercicios;

import java.util.Scanner;

public class Exe6 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int N = 0;

		System.out.println("informe um numero para virar par ou impar: ");
		N = entrada.nextInt();

		if (N % 2 == 0) {
			N += 1;
			System.out.println("Agora e impar: " + N);
		} else {
			N += 1;
			System.out.println("Agora e par: " + N);
		}
		entrada.close();
	}
}
