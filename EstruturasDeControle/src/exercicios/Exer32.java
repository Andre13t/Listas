package exercicios;

import java.util.Scanner;

public class Exer32 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println(" 1-File duplo, 2-Alcatra ou 3-Picanha");
		int c;
		float kl;
		float menos, mais;
		c = entrada.nextInt();
		System.out.println("quantidade de kl:");
		kl = entrada.nextFloat();

		switch (c) {
		case 1:
			menos = 4.9f;
			mais = 5.9f;
			break;
		case 2:
			menos = 5.9f;
			mais = 6.8f;
			break;
		case 3:
			menos = 6.9f;
			mais = 7.8f;
			break;
		default:
			menos = 0f;
			mais = 0f;
		}
		if (kl > 5) {
			kl *= menos;
		} else {
			kl *= mais;
		}
		System.out.println("R$" + kl);

		entrada.close();
	}

}
