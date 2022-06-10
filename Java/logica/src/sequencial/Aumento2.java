package sequencial;

import java.util.Scanner;

public class Aumento2 {

	public static void main(String[] args) {

		double salarioBruto,percentual,novoSalario;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o salario bruto:");
		salarioBruto=sc.nextDouble();
		
		System.out.println("Informe o percentual de aumento:");
		percentual=sc.nextDouble();
		
		novoSalario=salarioBruto*(1+ percentual/100);
		
		System.out.printf("O salario bruto atual de %.2f, foi aumentado para %.2f", salarioBruto,novoSalario);
	
		sc.close();
	}

}
