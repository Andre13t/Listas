package exercicios;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		char Turno;
		System.out.println("Qual turno voce estuda?(M - Matutino, V - Vesperino, N - Noturno)");
		Turno = entrada.next().toUpperCase().charAt(0);

		if (Turno == 'M') {
			System.out.println("Bom Dia!");
			
		} else if (Turno == 'V') {
			System.out.println("Boa Tarde!");
			
		} else {
			System.out.println("Boa Noite!");
			
		}

		entrada.close();
	}

}
