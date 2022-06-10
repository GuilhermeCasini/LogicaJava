package desafio;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
			try (Scanner sc = new Scanner(System.in)) {
				double precoUni = 0;
				int quant = 0,produtos=0;
				char catg = 0;
				double lucroc = 0, lucroe=0, lucrov=0,totalv=0,totale=0,totalc=0; 
				
				
				for (produtos=0; produtos<=9; produtos++) {
					
				System.out.println("\nCatalogo de Produtos");
				System.out.println("\nDigite o Preço Unitario: ");
				precoUni=sc.nextDouble();
				System.out.println("\nDigite a Quantidade deste produto: ");
				quant=sc.nextInt();
				System.out.println("\nDigite a Categoria deste produto C(cama,mesa e banho),E(Eletrodomesticos),V(Vestuario): ");
				catg=sc.next().charAt(0);
				catg=Character.toUpperCase(catg);
			
				switch(catg) {
				case 'C':
					double catgc = precoUni*0.3741;
					System.out.printf("A categoria deste produto é Cama,mesa e banho e o imposto é %.2f.\n\n",catgc);
					System.out.printf("Para se ter lucro do produto na categoria Cama,mesa e banho passara a valer %.2f.\n\n",lucroc=(catgc+precoUni)*1.3);
					totalc=lucroc*quant;
					break;
				case 'E':
					double catge=precoUni*0.4314;
					System.out.printf("A categoria deste produto é Eletrodomesticos e o imposto é %.2f.\n\n",catge);
					System.out.printf("Para se ter lucro do produto na categoria Eletrodomesticos passara a valer %.2f.\n\n",lucroe=(catge+precoUni)*1.35);
					totale=lucroe*quant;
					break;
				case 'V':	
					double catgv=precoUni*0.3842; 
					System.out.printf("A categoria deste produto é Vestuario e o imposto é %.2f.\n\n",catgv);
					System.out.printf("Para se ter lucro do produto na categoria Vestuario passara a valer %.2f.\n\n",lucrov=(catgv+precoUni)*1.5);
					totalv=lucrov*quant;
					
					break;
				}
				
				} 
				
				
				
					
						
						System.out.printf("O valor em estoque na categoria Cama,mesa e banho é: %.2f ",totalc);
					
						System.out.printf("\nO valor em estoque na categoria Eletrodomesticos é: %.2f ",totale);
					
						System.out.printf("\nO valor em estoque na categoria Vestuario é: %.2f ",totalv);
					
				sc.close();
			}
	}

}
