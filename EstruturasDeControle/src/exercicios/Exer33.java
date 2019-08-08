package exercicios;

import java.util.Scanner;

public class Exer33 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int NumeroAcertos = 0;
		char[] Gabarito = { 'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'E', 'E', };
		char[] GabaritoAluno = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', };
		char RespostaAluno = ' ';

		for (int i = 0; i < 10; i++) {
			System.out.println("Escreva a reposta da prova questao numero: " + (i+1));
			RespostaAluno = entrada.nextLine().toUpperCase().charAt(0);
			if (RespostaAluno == Gabarito[i]) {
				GabaritoAluno[i] = RespostaAluno;
				NumeroAcertos++;
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Q" + i + " : " + Gabarito[i] + " : " + GabaritoAluno[i]);
		}
		System.out.println("Puntucao final: " + NumeroAcertos);
		
		entrada.close();
	}
}
