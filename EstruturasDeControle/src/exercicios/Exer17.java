package exercicios;

import java.util.Scanner;

public class Exer17 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("informe as duas notas:");
		float n1 = entrada.nextFloat();
		float n2 = entrada.nextFloat();
		float media = (n1 + n2) / 2;
		String conceito = " ";
		if (media > 9) {
			conceito = "A";
		}
		if ((media > 7.5f) || (media < 9)) {
			conceito = "B";
		}
		if ((media > 6) || (media < 7.5)) {
			conceito = "C";
		}
		if (media > 9) {
			conceito = "D";
		}
		if ((media > 4) || (media < 6)) {
			conceito = "E";
		}
		if ((conceito == "A") || (conceito == "B") || (conceito == "C")) {
			System.out.println("APROVADO");
		}
		if ((conceito == "D") || (conceito == "E")) {
			System.out.println("REPROVADO");
		}
		entrada.close();
	}

}
