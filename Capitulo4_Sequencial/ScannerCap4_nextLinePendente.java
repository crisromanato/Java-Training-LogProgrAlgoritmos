package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;

//este import serve pra permitir utilizar a funcao scanner usada para digitar via teclado
import java.util.Scanner;

public class ScannerCap4_nextLinePendente {

	public static void main(String[] args) {
		
		System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 25 ########");
		
		System.out.println("**********ENTRADA DE DADOS - PARTE 2 **********");
		
		System.out.println("**********Exemplo para ler um texto ate a proxima quebra"
				+ " de linha combinado com outros tipos**********");
		
		// Declaracao de variavel
		
		
		// inserido a funcao  do tipo Scanner 
		// sc  o nome da variavel para chamar o scanner - pode ser qualquer nome
		// pra iniciar uma variavel usar o = new Scanner
		// para o java reconhecer que a entrada sera via teclado usar o argumento
		// (System.in)
		
		// dizemos que estamos associando a funcao o Scanner ao teclado no modo console.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		// declaracao  + atribuicao  de variavel
		
		int x1p;
		String s1p, s2p, s3p;
		
		// o comando abaixo vai permitir que eu digite variavel diferentes e o mesmo seja
		// armazenado dentro de cada variavel.
				
		x1p = sc.nextInt();
		// usar um nextline sozinho para que o programa considere o enter do tipo inicial
		// e nao consuma a entrada do proximo tipo
		sc.nextLine();
		s1p = sc.nextLine();
		s2p = sc.nextLine();
		s3p= sc.nextLine();
		
		
		// gerar um comando de impressao na tela
		System.out.println("Dados digitados: ");
		System.out.println(x1p);
		System.out.println(s1p);
		System.out.println(s2p);
		System.out.println(s3p);
		
		// para testar - digitar cada nome e pressionar enter no console apos a descricao 
		// do tipo do exercicio.
		// note que a cada enter o programa considera como concluido o next line, seja com 
		// uma palabra ou varias na mesma linha
		// ressaltando que para ele ler somente uma palavra usamos somente o sc.next(), 
		// sendo o sc o nome da variavel usada na inicializacao  do scanner.
		
		// a funcao  sc.close() serve para desalocar o recurso que criamos no java para 
		// digitacao  via teclado no modo console.
		sc.close();

	}

}
