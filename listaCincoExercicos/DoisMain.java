package listaCincoExercicos;

import java.util.Scanner;

/*
 * Fa�a um programa que mostre os n�meros que constam no intervalo entre dois n�meros que ser�o informados, 
 * se o usu�rio entrar com os valores em ordem inversa o programa deve fazer dar um aviso ao usu�rio que ir� fazer a invers�o.
 */

public class DoisMain {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Dois dois = new Dois();

		System.out.print("informe o primeiro numero para ver a o intervalo: ");
		dois.setNumeroUm(entrada.nextInt());
		System.out.print("informe o segundo numero : ");
		dois.setNumeroDois(entrada.nextInt());

		if (dois.invertido()) {
			System.out.println("numero estao invertidos e seram invertidos!");
		}
		System.out.println(dois.getNumeroUm());
		System.out.println(dois.getNumeroDois());
		System.out.println("Intervalo: ");
		for (int i = dois.getNumeroUm(); i <= dois.getNumeroDois(); i++) {
			System.out.println("- " + i);
		}
		System.out.println("Fim.");
		entrada.close();

	}

}
