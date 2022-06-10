package condicional;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String disciplina, resultado;
		int qtAulas,falta;
		double n1,n2,n3,n4, media;
		
		System.out.println("Informe o nome da disciplina: ");
		disciplina=sc.next();
		System.out.println("Informe a quantidade de aulas ministradas: ");
		qtAulas=sc.nextInt();
		
		System.out.println("Informe as notas do 1ª Bimestre:");
		n1=sc.nextDouble();
		System.out.println("Informe as notas do 2ª Bimestre:");
		n2=sc.nextDouble();
		System.out.println("Informe as notas do 3ª Bimestre:");
		n3=sc.nextDouble();
		System.out.println("Informe as notas do 4ª Bimestre:");
		n4=sc.nextDouble();
		
		System.out.println("Informe o numero de faltas: ");
		falta=sc.nextInt();
		
		media=(n1+n2+n3+n4)/4;
		
		if((media>=6.0)&& (falta < qtAulas*0.25)) {
			resultado = "aprovado";
	
		}else {
			resultado = "reprovado";
		}
		
		System.out.printf("A disciplina de %s teve %d aulas.\n",disciplina, qtAulas);

		System.out.printf("A media final do Aluno(a)na disciplina de %s é %.1f\n.E o numero de faltas é de %d.\n" , disciplina, media, falta);
		
		System.out.printf("O aluno esta %s",resultado);
		sc.close();

	}

}
