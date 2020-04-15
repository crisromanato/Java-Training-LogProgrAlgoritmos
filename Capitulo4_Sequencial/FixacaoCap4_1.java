package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;

import java.util.Locale;
//este import serve pra permitir utilizar a funcao scanner usada para digitar via teclado
import java.util.Scanner;

public class FixacaoCap4_1 {

	public static void main(String[] args) {

		System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 28 ########");

		System.out.println("**********EXERCICIOS PARA INICIANTE - PARTE 1  - exercicio 1**********");

		// Fazer um programa para:
		// 1. Ler as medidas da largura e comprimento de um terreno retangular com uma
		// casa decimal
		// 2. Ler o metro quadrado do terreno com duas casas decimais
		// 3. O programa deve mostrar o valor da area e o preco do terreno com duas
		// casas decimais

		// dados de entrada (10, 30 e 200)
		// dados de saida: ( area = 300.00 e preco = 60000.00)

		// area = largura x comprimento
		// preco = area x preco  do metro quadrado

		// funcao locale para fazer a conversao dos valores para a moeda US
		Locale.setDefault(Locale.US);

		// inserido a funcao do tipo Scanner
		// sc   o nome da variavel para chamar o scanner - pode ser qualquer nome
		// pra iniciar uma variavel usar o = new Scanner
		// para o java reconhecer que a entrada sera  via teclado usar o argumento
		// (System.in)

		// dizemos que estamos associando a funcao Scanner ao teclado no modo console.

		// comando de entrada de dados via teclado

		Scanner sc = new Scanner(System.in);

		// declaracao e Atribuicao de variavel (juntos)
		// pode ser feito separado tambem (questao de preferencia)
		// da forma abaixo economiza linha de codigo

		// Comando para permitir que o usuario digite o valor da variavel e
		// armazene dentro de cada variavel

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		// calcular a area e preco - usar comando de atribuicao - processamento de dados

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		// saida de dados - comando para mostrar na tela
		System.out.printf("AREA: %.2f%n", area);
		System.out.printf("PRECO: %.2f%n", preco);

		// a funcao sc.close() serve para desalocar o recurso que criamos no java para
		// digitacao via teclado no modo console.
		sc.close();

	}

}
