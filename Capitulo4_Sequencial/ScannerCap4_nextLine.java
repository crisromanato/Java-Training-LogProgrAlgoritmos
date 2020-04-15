package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;

//este import serve pra permitir utilizar a funcao scanner usada para digitar via teclado
import java.util.Scanner;

public class ScannerCap4_nextLine {

	public static void main(String[] args) {
		
		System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 25 ########");
		
		System.out.println("**********ENTRADA DE DADOS - PARTE 2 **********");
		
		System.out.println("**********Exemplo para ler um texto ate proxima quebra"
				+ " de linha**********");
		
		// Declaracao de variavel
		
		
		// inserido a funcao do tipo Scanner 
		// sc  o nome da variavel para chamar o scanner - pode ser qualquer nome
		// pra iniciar uma variavel usar o = new Scanner
		// para o java reconhecer que a entrada sera via teclado usar o argumento
		// (System.in)
		
		// dizemos que estamos associando a funcao Scanner ao teclado no modo console.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		// declaracao + atribuicao de variavel
		
		String s1, s2, s3;
		
		// o comando abaixo vai permitir que eu digite variavel diferentes e o mesmo seja
		// armazenado dentro de cada variavel.
				
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		
		// gerar um comando de impressao na tela
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// para testar - digitar cada nome e pressionar enter no console apos a descricao
		// do tipo do exercicio.
		// note que a cada enter o programa considera como concluido o next line, seja com 
		// uma palavra ou varias na mesma linha
		// ressaltando que para ele ler somente uma palavra usamos somente o sc.next(), 
		// sendo o sc o nome da variavel usada na inicializacao do scanner.
		
		// a funcao sc.close() serve para desalocar o recurso que criamos no java para 
		// digitacao via teclado no modo console.
		sc.close();

	}

}
