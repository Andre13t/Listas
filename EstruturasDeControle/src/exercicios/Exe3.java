package exercicios;

import java.util.Scanner;

public class Exe3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		char sexo = ' ';

		System.out.println("Digite " + "F" + " ou " + "M : ");
		sexo = entrada.next().toUpperCase().charAt(0);

		if (sexo == 'F') {
			System.out.println("F - Feminino");
		}
		if (sexo == 'M') {
			System.out.println("M - Masculino");
		}
		entrada.close();
	}
}
