package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;


public class Math_Bhaskara {

	public static void main(String[] args) {
		
		System.out.println("\n ###### Capitulo 4 - Estrutura Sequencial - etapa 26 ########");
		
		System.out.println("**********FUNCOES MATEMATICAS EM JAVA **********");
		
		System.out.println("**********Exemplo de funcoes math - equacao segundo grau**********");
		System.out.println("********** Formula de Bhaskara **********");
		
		// x = -b (+-) raiz delta / 2 * a
		// ou  delta = b2 - 4ac
		
		// declaracao
		double x1;
		double x2;
		

		// atribuicoes de variavel
		
		double delta = 2;
		//double x1 = 0;
		//double x2 = 0;
		double a = 1;
		double b = 15;
		double c = 12;
		 
		 
		 delta = java.lang.Math.pow(b, 2.0) - 4*a*c;
		 
		 x1 = (- b + java.lang.Math.sqrt(delta)) / (2.0 * a);
		 x2 = (- b - java.lang.Math.sqrt(delta)) / (2.0 * a);
		 
		 
		System.out.println("delta = " + delta);
		System.out.printf("x1 =  %.8f\n", x1);
		System.out.printf("x2 = " + x2);
		
		

	}


	}




