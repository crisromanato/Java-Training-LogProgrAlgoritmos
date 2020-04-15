package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;

public class CastingCap4 {

	public static void main(String[] args) {

		System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 23 ########");

		System.out.println("********** PROCESSAMENTO DE DADOS  **********");
		System.out.println("**********Exemplo 1 com numeros inteiros **********");
		// declaracao de variavel
		int x, y;

		// atribuicao de variavel
		// neste caso x recebe 5 por exemplo
		x = 5;
		y = 2 * x;

		// o resultado do print sera o que o comando de atribuicao
		// executou e armazenou na variavel.
		System.out.println(x);
		System.out.println(y);

		System.out.println("------------------------------");

		System.out.println("**********Exemplo 2 com double e inteiro**********");
		// declaracao de variavel
		int x1;
		double y1;

		// atribuicao de variavel

		x1 = 5;

		y1 = 2 * x1;

		// comando de escrever a variavel

		System.out.println(x1);
		// o ponto que imprime no item y1 porque uma variavel do tipo double
		System.out.println(y1);

		System.out.println("**********Exemplo 3 - trapezio **********");
		// declaracao de variavel
		double h, b, B, area;

		// atribuicao de variavel
		// boa pratica usar sempre a indicacao do tipo na atribuicao
		// neste exemplo foi add o ".0" para indicar que e double
		// se fosse float colocaraiamos por exemplo b = 6f;

		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2 * h;

		System.out.println(area);

		System.out.println("-----------------------------------");

		System.out.println("**********Exemplo 4  - caso com e sem casting **********");
		// declaracao de variavel
		int a4, b4;
		double resultado;
		double resultado1;

		// atribuicao de variavel
		//

		a4 = 5;
		b4 = 2;

		resultado = a4 / b4;

		System.out.println(resultado);
		// note que o resultado que deveria ser 2.5 deu 2.0 - isto porque as
		// duas variaveis do tipo inteiro e compilador do java considera
		// o formato da variavel recebida para compilacao

		// para avisar ao compilador que se quer o valor considerando as
		// casas decimais deve-se colocar entre parenteses o tipo que se
		// deseja obter no resultado.

		resultado1 = (double) a4 / b4;

		// isso se chama "casting" que a conversao explicita dos valores
		System.out.println(resultado1);
		System.out.println("-----------------------------------");
		
		System.out.println("**********Exemplo 5  - casting ignorando perda de informacao **********");
		// declaracao de variavel
		double a5;
		int b5;
		
			
		// atribuicao de variavel
		
		
		a5 = 5.0;
		//b5 = a5;
		// A atribuicao acima   permitida e o eclipse mostra um erro, pois as 
		// variaveis  mesmo tipo
		// caso voce se importe pela perda de parte da informacao, inserir
		// o casting relacionado ao resultado esperado, no caso b5   tipo int
		// adicione a palavra int entre parenteses conforme segue e os dados serao
		// compilados despresando as casas decimais
		b5 = (int) a5;
		
		
		
		System.out.println(b5);
		
		
		System.out.println("-----------------------------------");
	}

}
