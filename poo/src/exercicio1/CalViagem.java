package exercicio1;

import java.util.Scanner;

import exercicios.Veiculo;


public class CalViagem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int pag;
		double consumo, tanque, km, valor;
		System.out.println("Digite a quantidade de litros do tanque:");
		tanque=sc.nextDouble();
		System.out.println("\nDigite o numero de passageiros: ");
		pag=sc.nextInt();
		System.out.println("Digite consumo por litros: ");
		consumo=sc.nextDouble();
		System.out.println("Digite quantos km serão rodados: ");
		km=sc.nextDouble();
		System.out.println("Digite o valor do combustivel:");
		valor=sc.nextDouble();
		
		Veiculo v1 = new Veiculo(tanque,pag,consumo);
		System.out.println(v1.toString());
		
		double tanques = v1.tanqueViagem(km);
		double divisao= v1.dividirDespesas(km, valor);
		System.out.printf("O veiculo vai precisar de %.1f tanques, e a despesa para cada um ficara de R$%.2f.",tanques,divisao);
		
		sc.close();
	}

}
