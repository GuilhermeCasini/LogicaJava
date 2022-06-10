package repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double alt=0,base=0;

		System.out.println("Digite a base do triângulo: ");
		base = sc.nextDouble();
		System.out.println("Digite a altura do triângulo: ");
		alt = sc.nextDouble();

		if (alt > 0 && base > 0) {
			
			System.out.printf("O tringulo possui a area de %.1f.\n", (base * alt) / 2);
			
		} else {
			System.out.println("Valor invalido, digite um valor maior que zero.");
		}

		

		sc.close();

	}

}
