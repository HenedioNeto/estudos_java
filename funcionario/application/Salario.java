package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Qual o nome do funcionario? ");
		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();
		System.out.println("Qual o salario bruto do funcionario? ");
		System.out.print("Salario: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Qual o imposto do funcionario? ");
		System.out.print("Imposto: ");
		funcionario.tax = sc.nextDouble();
		
		funcionario.toString();
		
		System.out.println(funcionario);
		
		System.out.println();
		funcionario.liquidSalary();
		System.out.print("O salario liquido do funcionario é de: " + funcionario.grossSalary);
		
		System.out.println();
		System.out.println("Qual a porcentagem a se aumentar do salario? ");
		double percent = sc.nextDouble();
		funcionario.increaseSalary(percent);
		
		System.out.println();
		System.out.println("Novos dados: " + funcionario);
		
		sc.close();
	}

}
