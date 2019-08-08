package exercicios;

import java.util.Scanner;

public class Exe9 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String MasOuFemi = "";
		char Sexo = ' ';
		float Peso = 0f;
		float PesoIdeal = 0f;
		float Altura = 0f;

		System.out.println("Informe o seu peso: ");
		Peso = entrada.nextFloat();
		System.out.println("Informe a sua altura: ");
		Altura = entrada.nextFloat();
		System.out.println("F - Femino, M - Masculino");
		Sexo = entrada.next().toUpperCase().charAt(0);

		if (Sexo == 'F') {

			PesoIdeal = (float) ((62.1 * Altura) - 44.7);
			MasOuFemi = "feminino";
		} else {

			PesoIdeal = (float) ((72.7 * Altura) - 58);
			MasOuFemi = "masculino";
		}

		System.out.println("ALTURA: " + Altura + "M, " + "SEXO: " + MasOuFemi + "Peso: " + Peso + "Kg, " + "Peso ideal: " + PesoIdeal + "Kg");

		if (Peso < PesoIdeal) {
			System.out.println("Você está abaixo do peso ideal");

		} else if (Peso > PesoIdeal) {
			System.out.println("Você está acima do peso ideal");

		} else {
			System.out.println("Você está no peso ideal");

		}

		entrada.close();
	}
}
