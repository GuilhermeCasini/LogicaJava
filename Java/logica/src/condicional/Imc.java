package condicional;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		double peso, altura;
		String classificacao;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe o peso: ");
		peso=sc.nextDouble();
		System.out.println("Informe a altura: ");
		altura=sc.nextDouble();
		
		
		double imc = peso/Math.pow(altura, 2);
		
		if(imc < 18.5) {
			classificacao="abaixo do peso";
		}else if(imc <25) {
			classificacao="peso normal";
		}else if (imc<30) {
			classificacao="sobre-peso";
		}else if(imc <35) {
			classificacao="obsidade nivel 1";
		}else if(imc<40) {
			classificacao="obsidade nivel 2";
		}else {
			classificacao="obsidade morbida";
		}
		
		System.out.printf("\nO seu IMC é %.2f"+" "
				+"e esta classificado como %s.",imc,classificacao);
		sc.close();

	}

}
