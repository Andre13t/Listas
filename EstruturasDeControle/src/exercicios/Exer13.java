package exercicios;

import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float RecebePorHora = 0f;
		float HorasTrabalhadas = 0f;
		float TotalSalario = 0f;
		float ImpostoRenda = 0f;
		float TotalDesconto = 0f;
		float Fgts = 0f;
		float Inss = 0f;

		System.out.print("Escreva quanto recebe por hora e depois quantas horas trabalha: ");
		RecebePorHora = entrada.nextFloat();
		HorasTrabalhadas = entrada.nextFloat();
		TotalSalario = RecebePorHora * HorasTrabalhadas;

		if (TotalSalario < 900) {
			Inss = (TotalSalario * 10) / 100;
			TotalDesconto = Inss;

			System.out.println("INSS ( 10%) : R$ " + Inss);
			System.out.println("Total de descontos : " + TotalDesconto);
			System.out.println("Salário Liquido : R$ " + (TotalSalario - TotalDesconto));

		} else if (TotalSalario < 1500) {
			Inss = (TotalSalario * 10) / 100;
			ImpostoRenda = (TotalSalario * 5) / 100;
			Fgts = (TotalSalario * 11) / 100;
			TotalDesconto = Inss + ImpostoRenda;

			System.out.println("Imposto de renda (5%) : R$ " + ImpostoRenda);
			System.out.println("INSS ( 10%) : R$ " + Inss);
			System.out.println("FGTS (11%) : R$ " + Fgts);
			System.out.println("Total de descontos : R$ " + TotalDesconto);
			System.out.println("Salário Liquido : R$ " + (TotalSalario - TotalDesconto));

		} else if (TotalSalario < 2500) {
			Inss = (TotalSalario * 10) / 100;
			ImpostoRenda = (TotalSalario * 10) / 100;
			Fgts = (TotalSalario * 11) / 100;
			TotalDesconto = Inss + ImpostoRenda;

			System.out.println("Imposto de renda (5%) : R$ " + ImpostoRenda);
			System.out.println("INSS ( 10%) : R$ " + Inss);
			System.out.println("FGTS (11%) : R$ " + Fgts);
			System.out.println("Total de descontos : R$ " + TotalDesconto);
			System.out.println("Salário Liquido : R$ " + (TotalSalario - TotalDesconto));

		} else if (TotalSalario > 2500) {
			Inss = (TotalSalario * 10) / 100;
			ImpostoRenda = (TotalSalario * 20) / 100;
			Fgts = (TotalSalario * 11) / 100;
			TotalDesconto = Inss + ImpostoRenda;

			System.out.println("Imposto de renda (5%) : R$ " + ImpostoRenda);
			System.out.println("INSS ( 10%) : R$ " + Inss);
			System.out.println("FGTS (11%) : R$ " + Fgts);
			System.out.println("Total de descontos : R$ " + TotalDesconto);
			System.out.println("Salário Liquido : R$ " + (TotalSalario - TotalDesconto));
		}
		entrada.close();
	}
}
