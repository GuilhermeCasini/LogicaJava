package repeticao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double nota = 0,total=0;
		int contador=0,aprov=0,repro=0;
		
		
		while(contador <= 4) {
			System.out.printf("\nDigite a nota do %dª aluno :\n ",contador+1);
			nota=sc.nextDouble();
			total+= nota;
			contador++;
			
			if (nota>=6.0) {
				System.out.printf("\nO aluno esta aprovado\n",aprov);
			aprov++;
			}else {
				System.out.printf("\nO aluno esta reprovado\n",repro);
			repro++;
			}
			
			}
		
		double media= total/contador;
		System.out.printf("\nMedia da Turma:%.1f",media);
		System.out.printf("\nA quantidade de alunos aprovados é: %d.",aprov);
		System.out.printf("\nA quantidade de alunos reprovados é: %d.",repro);
		
		sc.close();
		
	
		
	}

}
