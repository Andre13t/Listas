package exercicios;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float Salario, SalarioComReajuste, PercentualAumentado;
		int PercentualAplicado;

		System.out.print("Qual e seu salario? ");
		Salario = entrada.nextFloat();

		if (Salario <= 280) {
			PercentualAumentado = ((Salario * 20) / 100);
			SalarioComReajuste = PercentualAumentado + Salario;
			PercentualAplicado = 20;
		} else if ((Salario >= 280) && (Salario <= 700)) {
			PercentualAumentado = ((Salario * 15) / 100);
			SalarioComReajuste = PercentualAumentado + Salario;
			PercentualAplicado = 15;
		} else if ((Salario >= 700) && (Salario <= 1500)) {
			PercentualAumentado = ((Salario * 10) / 100);
			SalarioComReajuste = PercentualAumentado + Salario;
			PercentualAplicado = 10;
		} else {
			PercentualAumentado = ((Salario * 5) / 100);
			SalarioComReajuste = PercentualAumentado + Salario;
			PercentualAplicado = 5;
		}
		
		System.out.println("Salrio antes: " + Salario + "R$, Percentual de aumento: " + PercentualAplicado + "%, "
				+ "Valor aumentado: "+ PercentualAumentado + "R$, Salario novo: "+ SalarioComReajuste+"R$");

		entrada.close();
	}

}
