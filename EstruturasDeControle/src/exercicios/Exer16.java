package exercicios;

import java.util.Scanner;

public class Exer16 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float nota1, nota2, media = 0f;

		System.out.println("Informe as duas notas: ");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media <= 6.9 && media >= 3) {
			System.out.println("Em Exame");
		} else {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

}
