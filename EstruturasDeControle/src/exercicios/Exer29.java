package exercicios;

import java.util.Scanner;

public class Exer29 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int i = 0;
		System.out.println("responda s ou n");
		System.out.println("Telefonou para a vítima? ");
		char res = entrada.next().charAt(0);
		if (res == 's') {
			i += 1;
		}
		System.out.println("Esteve no local do crime?");
		res = entrada.next().charAt(0);
		if (res == 's') {
			i += 1;
		}
		entrada.nextLine();
		System.out.println("Mora perto da vitima?");
		res = entrada.next().charAt(0);
		if (res == 's') {
			i += 1;
		}
		entrada.nextLine();
		System.out.println("Devia para a vitima?");
		res = entrada.next().charAt(0);
		if (res == 's') {
			i += 1;
		}
		entrada.nextLine();
		System.out.println("Ja trabalhou com a vitima?");
		res = entrada.next().charAt(0);
		if (res == 's') {
			i += 1;
		}
		switch (i) {
		case 1:
		case 2:
			System.out.println("Suspeita");
			break;
		case 3:
		case 4:
			System.out.println("Cumplice");
			break;
		case 5:
			System.out.println("Assassino");
			break;
		default:
			System.out.println("inocente");
			break;
		}
		entrada.close();
	}

}
