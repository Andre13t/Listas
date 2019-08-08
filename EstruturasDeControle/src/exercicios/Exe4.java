package exercicios;

import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int ano = 0;
		
		System.out.println("Informe um ano para ver se ele e bissexto: ");
		ano = entrada.nextInt();

		if (ano % 400 == 0) {
			System.out.println("O ano e bissexto");
		} else if ((ano % 100 != 0) && (ano % 4 == 0)) {
			System.out.println("O ano e bissexto");
		} else {
			System.out.println("Nao e bissexto");
		}
		entrada.close();
	}

}
