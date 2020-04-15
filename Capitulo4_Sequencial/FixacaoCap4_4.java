package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;


import java.util.Locale;
import java.util.Scanner;

public class FixacaoCap4_4 {

	public static void main(String[] args) {
	
		// Faca um programa que:
		// 1. Leia o numero de um funcionario
		// 2. Leia seu numero de horas trabalhadas
		// 3. Leia o valor que recebe por hora e calcula o salario deste funcionario
		// 4. Mostre o numero e o salario do funcionario com duas casas decimais
		
		Locale.setDefault(Locale.US);
		// funcao Scanner para digitacao no teclado
		
		Scanner sc = new Scanner(System.in);
		
		// Dados de entrada
		
		// Declaracao de variavel 
		
		int numero, horas;
		double valorHora, salario; 
		
		
		
		// comando para entrada de dados ( variavel + nome do scanner (sc) + .nextInt )

		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		// Atribuicao de variavel para calculo - processamento de dados
		
		salario = valorHora*horas ;
		
		// comando para saida de dados
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
