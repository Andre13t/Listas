package exercicios;

import java.util.Scanner;

public class Exer21 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String data, val;
		System.out.println("informe uma data no formato dd/mm/aaaa ");
		data = entrada.nextLine();
		
		if (Integer.parseInt(data.substring(0, 2)) > 31) {
			val = "dia do mes inválido";
		}
		if (Integer.parseInt(data.substring(3, 5)) > 12) {
			val = "mes inválido";
		}
		val = "Data válida";
		System.out.println(val);
		
		entrada.close();
	}

}
