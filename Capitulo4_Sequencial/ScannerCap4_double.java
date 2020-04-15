package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;

import java.util.Locale;
//este import serve pra permitir utilizar a funcao scanner usada para digitar via teclado
import java.util.Scanner;

public class ScannerCap4_double {

	public static void main(String[] args) {
		
System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 24 ########");
		
		System.out.println("**********ENTRADA DE DADOS - PARTE 1 **********");
		
		System.out.println("**********Exemplo com obtencao de entrada para double - "
				+ "tipo numerico com ponto flutuante **********");
		
		// Declaracao de variavel
		
		
		// inserido a funcao do tipo Scanner 
		// sc o nome da variavel para chamar o scanner - pode ser qualquer nome
		// pra iniciar uma variavel usar o = new Scanner
		// para o java reconhecer que a entrada sera via teclado usar o argumento
		// (System.in)
		
		// dizemos que estamos associando a funcao Scanner ao teclado no modo console.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		// declaracao + atribuicao de variavel
		
		double x23_d;
		// o comando abaixo vai permitir que eu digite um  numero e o mesmo seja
		// armazenada dentro da variavel x23.
		// lembrando que precisamos incluir neste caso a funcao locale + import dela
		Locale.setDefault(Locale.US);
		x23_d = sc.nextDouble(); // nota se deixar nextInt funciona se inserir numero inteiro
		
		// gerar um comando de impressao na tela
		// teste com e sem o locale definido acima.
		System.out.println("Voce digitou o valor: " + x23_d);
		System.out.printf("Voce digitou o valor: %.2f\n", x23_d);
		
		
		
		// a funcao sc.close() serve para desalocar o recurso que criamos no java para 
		// digitacao via teclado no modo console.
		sc.close();

	}

}
