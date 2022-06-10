package sequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double salarioBruto,descontoSalario;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe o Salario Bruto:");
		salarioBruto=sc.nextDouble();
		
		descontoSalario=salarioBruto*(1-0.11);
		
		System.out.printf("O salario bruto de %.2f, ficou %.2f com o desconto do INSS",salarioBruto,descontoSalario);
		
		sc.close();
	}

}
