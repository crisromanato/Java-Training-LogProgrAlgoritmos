package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

import java.util.Scanner;

public class If_else2 {

	public static void main(String[] args) {

		// estrutura condicional composta com mais de duas possibilidades

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			// condicao do if
			System.out.println("Bom dia");

		} else if (hora < 18) {
			// condicao do if
			System.out.println("Boa tarde");

		} else {

			System.out.println("Boa noite");
			sc.close();
		}
	}
}
