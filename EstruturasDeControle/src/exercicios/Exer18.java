package exercicios;

import java.util.Scanner;

public class Exer18 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe os lados do triangulo: ");
		float l1 = entrada.nextFloat();
		float l2 = entrada.nextFloat();
		float l3 = entrada.nextFloat();
		
		if ((l1 == l2) && (l1 == l3)) {
			System.out.println("E um triangulo equilatero");
		} else {
			if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
				System.out.println("E um triangulo escaleno");
			} else {
				if ((l1 == l2) || (l1 == l3) || (l2 == l3)) {
					System.out.println("E um triangulo isosceles");
				}
			}
		}
		entrada.close();

	}

}
