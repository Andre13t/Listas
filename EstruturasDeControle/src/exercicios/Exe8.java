package exercicios;

import java.util.Scanner;

public class Exe8 {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		float nota1,nota2,media = 0f;
		
		System.out.println("Informe as duas notas: ");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		media = (nota1 + nota2)/2;
		
		if (media>= 7){
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}
