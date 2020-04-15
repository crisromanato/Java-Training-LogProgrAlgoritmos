package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class FixacaoCap4_5 {

	public static void main(String[] args) {


		// Fazer um programa que:
		// 1. Leia o codigo de uma peca 1
		// 2. Leia o numero e o valor unitario de cada peca 1
		// 3. Leia o codigo da peca 2
		// 4. Leia o numero e o valor unitario de cada peca 2
		// 5. Calcule e mostre o valor a ser pago
		
		// exemplos e valores de entrada (12 1 5.30) e (16 2 5.10)
		// exemplo valor de saida (VALOR A PAGAR: R$ 15.50)
		
		// exemplos e valores de entrada (13 2 15.30) e (161 4 5.20)
		// exemplo valor de saida (VALOR A PAGAR: R$ 51.40)
		
		// exemplos e valores de entrada (1 1 15.10) e (2 1 15.10)
		// exemplo valor de saida (VALOR A PAGAR: R$ 30.20)
		
		// Locale para conversao de valores para US
		Locale.setDefault(Locale.US);
		
		// entrada de dados (tipo Scanner + nome = new Scanner(System.in)
		
		Scanner sc = new Scanner(System.in);
		
		// Declarar e Atribuir variaveis
		// tipo + nome e se for atribuir usar = mais o valor de atribuicao
		
		int cod1, cod2, qte1, qte2;
		double preco1, preco2, total;
		
		// processamento de dados dos valores entrados (armazenar na memoria RAM)
		// variavel  = nome do scanner + next... e o tipo d variavel
		
		cod1 = sc.nextInt();
		qte1 = sc.nextInt();
		preco1 = sc.nextDouble();
			
		cod2 = sc.nextInt();
		qte2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		// processamento de dados
		// calculo de valor a pagar por codigo de peca
		
		total = preco1 * qte1 + preco2 * qte2;
		
		
		// saida de dados
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		// encerrar a funcao scanner.
		sc.close();
	}

}
