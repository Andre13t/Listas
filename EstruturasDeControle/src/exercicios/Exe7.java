package exercicios;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float N1, N2, N3, aux;
		System.out.println("informe tres numeros: ");

		N1 = entrada.nextFloat();
		N2 = entrada.nextFloat();
		N3 = entrada.nextFloat();

		if (N1 < N2) {
			aux = N2;
			N2 = N1;
			N1 = aux;
		}

		if (N2 < N3) {
			aux = N3;
			N3 = N2;
			N2 = aux;
		}

		if (N1 < N2) {
			aux = N2;
			N2 = N1;
			N1 = aux;
		}
		System.out.println("Ordem decrescente " + N1 + ", " + N2 + ", " + N3);

		entrada.close();
	}
}
