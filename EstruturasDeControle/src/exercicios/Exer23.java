package exercicios;

import java.util.Scanner;

public class Exer23 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int i1, i2, i3;
		float media = 0f;
		System.out.println("informe a idade dos tres alunos: ");
		i1 = entrada.nextInt();
		i2 = entrada.nextInt();
		i3 = entrada.nextInt();
		media = (i1 + i2 + i3) / 3;

		if (media > 40) {
			System.out.println("Turma idosa");
		} else if (media > 25) {
			System.out.println("Turma adulta");
		} else {
			System.out.println("Turma jovem");
		}
		entrada.close();
	}

}
