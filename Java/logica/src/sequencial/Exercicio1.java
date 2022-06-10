package sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		double n1,n2,n3,n4, mediaPonderada;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o valor n1:");
		n1=sc.nextDouble();
		System.out.println("Digite o valor n2:");
		n2=sc.nextDouble();
		System.out.println("Digite o valor n3:");
		n3=sc.nextDouble();
		System.out.println("Digite o valor n4:");
		n4=sc.nextDouble();
		mediaPonderada= (n1*2 + n2*2 +n3*3+ n4*3)/10;
		
		System.out.printf("A Media Ponderada dos 4 valores é:%.2f",mediaPonderada);
		
		sc.close();
	}

}
