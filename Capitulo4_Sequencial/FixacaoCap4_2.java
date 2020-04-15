package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;


import java.util.Locale;
// este import serve pra permitir utilizar a funcao scanner usada para digitar via teclado
import java.util.Scanner;

public class FixacaoCap4_2 {

	public static void main(String[] args) {

		System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 28 ########");

		System.out.println("**********EXERCICIOS PARA INICIANTE - PARTE 1 - exercicio 2 **********");

		// Fazer um programa para:
		// 1. Ler o raio de um circulo
		// 2. O programa deve mostrar o valor da area com duas casas decimais

		// dados de entrada raio serao de (2, 100.64 , 150)
		// dados de saida: ( A = 12.5664, A = 31819.3103, A = 70685.7750
		

		// formula da area = pi * raio ao quadrado
		// considere para pi o valor de = 3.14159

		// funcao locale para fazer a conversao dos valores para a moeda US
		Locale.setDefault(Locale.US);

		// inserido a funcao do tipo Scanner
		// sc  o nome da variavel para chamar o scanner - pode ser qualquer nome
		// pra iniciar uma variavel usar o = new Scanner
		// para o java reconhecer que a entrada sera via teclado usar o argumento
		// (System.in)

		// dizemos que estamos associando a funcao Scanner ao teclado no modo console.

		// comando de entrada de dados via teclado

		Scanner sc = new Scanner(System.in);

		// declaracao e Atribuicao de variavel (juntos)
		// pode ser feito direto tambem (questao de preferencia)
		// dver a melhor forma que economize linha de codigo
		
		// declaracao de variavel
		double R, A, pi = 3.14159;

		// Comando para permitir que o usuario digite o valor da variavel e
		// armazene dentro de cada variavel

		R = sc.nextDouble();
		
		
		// calcular a area - usar comando de atribuicao - processamento de dados

		A = pi * R * R;
		
		// saida de dados - comando para mostrar na tela
		System.out.printf("A=%.4f%n", A);
		

		// a funcao sc.close() serve para desalocar o recurso que criamos no java para
		// digitacao via teclado no modo console.
		sc.close();

	}

}
