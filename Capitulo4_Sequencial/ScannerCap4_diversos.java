package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;

//este import serve pra permitir utilizar a funcao scanner usada para digitar via teclado
import java.util.Scanner;

public class ScannerCap4_diversos {

	public static void main(String[] args) {
		
		System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 24 ########");
		
		System.out.println("**********ENTRADA DE DADOS - PARTE 1 **********");
		
		System.out.println("**********Exemplo com obtecao de entrada para diversos"
				+ " formatos **********");
		
		// Declaracao de variavel
		
		
		// inserido a funcao do tipo Scanner 
		// sc   o nome da variavel para chamar o scanner - pode ser qualquer nome
		// pra iniciar uma variavel usar o = new Scanner
		// para o java reconhecer que a entrada sera via teclado usar o argumento
		// (System.in)
		
		// dizemos que estamos associando a funcao Scanner ao teclado no modo console.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		// declaracao + atribuicao de variavel
		
		String x23_str1;
		int y23;
		double z23;
		
		// o comando abaixo vai permitir que eu digite variavel diferentes e o mesmo seja
		// armazenado dentro de cada variavel x23_str1 , y23 e z23.
				
		x23_str1 = sc.next();
		y23 = sc.nextInt();
		z23 = sc.nextDouble();
		
		
		// gerar um comando de impressao na tela
		System.out.println("Voce digitou o valor: " + x23_str1 + " depois: " + y23 + 
				" e depois: " + z23);
		
		
		
		// a funcao sc.close() serve para desalocar o recurso que criamos no java para 
		// digitacao via teclado no modo console.
		sc.close();

	}

}
