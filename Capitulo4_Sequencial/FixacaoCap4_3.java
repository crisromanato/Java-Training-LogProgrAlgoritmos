package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;


//este import serve pra permitir utilizar a funcao scanner usada para digitar via teclado
import java.util.Scanner;

public class FixacaoCap4_3 {

	public static void main(String[] args) {

		System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 28 ########");

		System.out.println("**********EXERCICIOS PARA INICIANTE - PARTE 1 - exercicio 3 **********");

		// Fazer um programa para:
		// 1. Ler quatro valores inteiros (A -> D)
		// 2. O programa deve calcular e mostrar a diferenca do produto A e B pelo C e D
		// formula sera a diferenca de (A*B - C*D)

		// dados de entrada serao de (5,6,7,8) e (5,6,-7,8)
		// dados de saida: diferenca de -26 e 86
		

			
		// inserido a funcao do tipo Scanner
		// sc   o nome da variavel para chamar o scanner - pode ser qualquer nome
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
		int A,B,C,D, dif;

		// Comando para permitir que o usuario digite o valor da variavel e
		// armazene dentro de cada variavel

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		// calcular a diferenca - usar comando de atribuicao - processamento de dados

		dif = A*B-C*D;
		
		// saida de dados - comando para mostrar na tela
		System.out.println("DIFERENCA = " + dif);
		

		// a funcao sc.close() serve para desalocar o recurso que criamos no java para
		// digitacao via teclado no modo console.
		sc.close();

	}

}
