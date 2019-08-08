package exercicios;

import java.util.Scanner;

public class Exer15 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int Origem = 0;
		float Preco = 0f;
		String OrigemNomes[] = { "zero", "Sul", "Norte", "Leste", "Oeste", "Nordeste", "Nordeste", "Centro-oeste","Centro-oeste", };

		System.out.println("Informe o custo de produçao e depois qual sua oigem(1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste): ");
		Preco = entrada.nextFloat();
		Origem = entrada.nextInt();

		if (Origem > 7) {
			System.out.println("Preço: R$" + Preco + " Importado");
		} else {
			System.out.println("Preço: R$" + Preco + " " + OrigemNomes[Origem]);
		}
		entrada.close();
	}
}
