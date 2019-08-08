package exercicios;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int DiaSemana = 0;
		String NomesSemana[] = { "zero", "Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado" };

		System.out.println("Escreva um numero correspondente ao dia de semana(1-Domingo, 2- Segunda, etc.)");
		DiaSemana = entrada.nextInt();
		while (DiaSemana < 1 || DiaSemana > 7) {
			System.out.println("Numero Invalido, escreva um numero correspondente ao dia de semana(1-Domingo, 2- Segunda, etc.)");
			DiaSemana = entrada.nextInt();
		}
		
		System.out.println(NomesSemana[DiaSemana]);

		entrada.close();
	}

}
