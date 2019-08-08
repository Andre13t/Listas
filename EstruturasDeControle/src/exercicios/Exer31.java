package exercicios;

import java.util.Scanner;

public class Exer31 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float preco, pMor, pMa;
		float morango;
		float ma;
		
		System.out.println("Informe a quantidade de kl para morangos: ");
		morango = entrada.nextFloat();
		System.out.println("Informe a quantidade de Kl de maçãs: ");
		ma = entrada.nextFloat();

		if (morango <= 5) {
			pMor = morango * 2.5f;
		} else {
			pMor = morango * 2.2f;
		}
		if (ma < 5) {
			pMa = ma * 1.8f;
		} else {
			pMa = ma * 1.5f;
		}
		if (ma + morango > 8) {
			preco = (pMor + pMa) * 0.9f;
		} else {
			preco = pMor + pMa;
		}
		System.out.println("Preço = R$" + preco);
		
		entrada.close();
	}
}
