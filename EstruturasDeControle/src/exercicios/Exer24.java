package exercicios;

import java.util.Scanner;

public class Exer24 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float n1, n2, n3, media;

		System.out.println("informe as tres notas: ");
		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		n3 = entrada.nextFloat();
		media = (n1 + n2 + n3) / 3;

		if (media == 10) {
			System.out.println("aprovado com distinção");
		} else if (media >= 7) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}
		entrada.close();
	}

}
