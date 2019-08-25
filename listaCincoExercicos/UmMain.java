package listaCincoExercicos;

import java.util.Scanner;

public class UmMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Um um = new Um();

		System.out.print("escreva seu nome: ");
		um.setNome(entrada.nextLine());

		System.out.print("escreva seu sobre nome: ");
		um.setSobreNome(entrada.nextLine());

		System.out.println("Seu nome completo e: " + um.getNome() + " " + um.getSobreNome());

		entrada.close();
	}

}
