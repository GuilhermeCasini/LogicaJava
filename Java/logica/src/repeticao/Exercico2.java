package repeticao;

import java.util.Scanner;

public class Exercico2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int atAno;
		double aumento = 0, salInicio = 1000;

		System.out.println("Digite o ano atual: ");
		atAno = sc.nextInt();
	

		for (int admicao = 2016; admicao <= atAno; admicao++) {
			System.out.printf("\nDigite a porcentagem de aumento de %d: ", admicao);
			aumento = sc.nextDouble();
			salInicio *= (1 + (aumento / 100));
			System.out.printf("O salário atual é de R$%.2f\n.", salInicio);
			
			}
		sc.close();
		}

	}


