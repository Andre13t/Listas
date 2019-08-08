package exercicios;

import java.util.Scanner;

public class Exe5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		char letra = ' ';

		System.out.println("Digite uma letra: ");
		letra = entrada.next().toUpperCase().charAt(0);

		if ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U')) {
			System.out.println("E uma vogal ");
		} else {
			System.out.println("Nao e uma vogal");
		}
		entrada.close();
	}

}
