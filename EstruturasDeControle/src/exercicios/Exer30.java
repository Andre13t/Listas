package exercicios;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float l = entrada.nextFloat();
		float preco = 0f;
		String comb = " ";

		System.out.println("Qual combustivel deseja comprar ?" + "\n" + "Insira A(para Alcool) ou G(para Gasolina): ");
		comb = entrada.nextLine();
		System.out.println("Quantos  litros? ");

		switch (comb) {
		case "a":
			if (l <= 20) {
				preco = (float) (1.90 * l * 0.03f);
			} else {
				if (l > 20) {
					preco = (float) 1.90 * l * 0.05f;
				}
			}
			break;
		case "g":
			if (l < 20) {
				preco = (float) 2.5 * l * 0.04f;
			} else {
				preco = (float) 2.5 * l * 0.06f;
			}
			break;
		}
		System.out.println(" R$" + preco);

		entrada.close();
	}
}
