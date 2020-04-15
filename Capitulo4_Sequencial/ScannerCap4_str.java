package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;

//este import serve pra permitir utilizar a funcao scanner usada para digitar via teclado
import java.util.Scanner;

public class ScannerCap4_str {

	public static void main(String[] args) {
		
		System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 24 ########");
		
		System.out.println("**********ENTRADA DE DADOS - PARTE 1 **********");
		
		System.out.println("**********Exemplo com obtencao de entrada para STRING -"
				+ " palavras **********");
		
		// Declaracao de variavel
		
		
		// inserido a funcao do tipo Scanner 
		// sc o nome da variavel para chamar o scanner - pode ser qualquer nome
		// pra iniciar uma variavel usar o = new Scanner
		// para o java reconhecer que a entrada sera via teclado usar o argumento
		// (System.in)
		
		// dizemos que estamos associando a funcao Scanner ao teclado no modo console.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		// declaracao + atribuicao de variavel
		
		String x23;
		// o comando abaixo vai permitir que eu digite uma palavra e a mesma seja
		// armazenada dentro da variavel x23_int.
		x23 = sc.next();
		
		// gerar um comando de impressao na tela
		System.out.println("Voce digitou o valor: " + x23);
		
		
		
		// a funcao sc.close() serve para desalocar o recurso que criamos no java para 
		// digitacao via teclado no modo console.
		sc.close();

	}

}
