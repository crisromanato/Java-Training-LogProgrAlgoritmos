package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;


public class Math_1 {

	public static void main(String[] args) {
		System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 26 ########");
		
		System.out.println("**********FUNCOES MATEMATICAS EM JAVA **********");
		
		System.out.println("**********Exemplo de funcoes math**********");
		
		// declaracao
		double A, B, C;


		// atribuicoes de variavel
		 double x = 3.0;
		 double y = 4.0;
		 double z = -5.0;
		 

		//  Variavel mA recebe a raiz quadrada de mx1
		A = java.lang.Math.sqrt(x);
		B = java.lang.Math.sqrt(y);
		C = java.lang.Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		// Variavel mA recebe o resultado de mx1 elevado a my1 
		A = java.lang.Math.pow(x, y);
		B = java.lang.Math.pow(x, 2.0);
		C = java.lang.Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		
		// Variavel mA recebe o valor absoluto de mx1
		A = java.lang.Math.abs(y);
		B = java.lang.Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);


	}


	}
