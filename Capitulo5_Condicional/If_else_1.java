package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

import java.util.Scanner;

public class If_else_1 {

	public static void main(String[] args) {
		
		// estrutura condicional composta

Scanner sc = new Scanner(System.in);
int hora;

System.out.println("Quantas horas?");
hora = sc.nextInt();

if (hora < 12) {

System.out.println("Bom dia");
} 
else {
System.out.println("Boa tarde");


sc.close();

	}
	}
}

