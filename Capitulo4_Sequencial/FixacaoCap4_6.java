package LogicaProgramacaoAlgoritmos.Capitulo4_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class FixacaoCap4_6 {

	public static void main(String[] args) {
		
//Fazer um programa que:
		// 1. leia tres valores com ponto flutuante de dupla precisao: A, B e C.
		// 2. calcule e mostre:
		// a) area do triangulo retangulo que tem A por base e C por altura.
		//		formula e : area = b.a/2
		// b) area do calculo de raio C. (pi = 3.14159)
		//		formula da area = pi * raio ao quadrado
		// c) area do trapezio que tem A e B por bases e C por altura.
		//	 	formula e : area = (B + b) * A / 2
		// d) area do quadrado que tem lado B.
		//		formula e : area = (B * 4)
		// e) area do retangulo que tem lados A e B.
		// 		formula e : area = b.a/2
		
		// Exemplos de entrada - 3.0 4.0 5.2
		// Exemplos de saida:
		// 	TRIANGULO: 7.800
		// 	CIRCULO: 84.949
		// 	TRAPEZIO: 18.200
		// 	QUADRADO: 16.000
		// 	RETANGULO: 12.000

		// Exemplos de entrada - 12.7 10.4 15.2
		// Exemplos de saida:
		//	TRIANGULO: 96.520
		//	CIRCULO: 725.833
		//	TRAPEZIO: 175.560
		//	QUADRADO: 108.160
		//	RETANGULO: 132.080 
		
		Locale.setDefault(Locale.US);
		
		// iniciar a funcao scanner para digitar no teclado
		// Scanner + nome = new.Scanner(SYtem.in)
		
		Scanner sc = new Scanner(System.in);
		
		
		//Declarar variaveis de entrada (tipo + nome)
		
		double A,B,C, pi = 3.14159;
		
		// comando de entrada de dados via teclado
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		// comando para calculo - processamento de dados
		
		// a) area do triangulo retangulo que tem A por base e C por altura.
		// formula e : area = b.a/2
		// b) area do circulo de raio C. (pi = 3.14159)
		// formula da area = pi * raio ao quadrado
		// c) area do trapezio que tem A e B por bases e C por altura.
		// formula e : area = (B + b) * A / 2
		// d) area do quadrado que tem lado B.
		// formula e : area = (B * 4)
		// e) area do retangulo que tem lados A e B.
		// formula e : area = b.a
		
		// declaracao das formas + atribuicao
		
		double trianguloRetangulo = A * C / 2;
		double circulo = pi * C * C;
		double trapezio = (A + B) * C / 2;
		double quadrado = B * B;
		double retangulo = A * B ;
		
		
		// comando para mostrar dados
		
		System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
				
		
		
		// fechar a funcao scanner
		sc.close();

	}

}
