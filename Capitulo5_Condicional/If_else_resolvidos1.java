		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

		import java.util.Locale;
		import java.util.Scanner;

		public class If_else_resolvidos1 {

			public static void main(String[] args) {

				// exercicio resolvido 1 - capitulo 5 - item 35

				// com if simples


				// fazer um programa para:
				//	1. ler duas notas q um aluno obteve - prim e seg semestre de uma discipli
				// na anual
				//	2. Mostra a nota final do aluno no ano com o texto explicativo
				//	3. Caso a nota seja inferior a 60.00 mostrar a mensagem "REPROVADO"
				// Nota: todos os valores devem ter uma casa decimal.

				//Exemplo1
				// entrada de dados (45.5 31.3)
				// saida - NOTA FINAL = 76.8
				// " linha vazia"

				//Exemplo2
				// entrada de dados (34.0 23.5)
				// saida - NOTA FINAL = 57.5
				// REPROVADO

				// inserir a estrutura basica do programa com o locale e o scanner
				// comando para conversão valores
				Locale.setDefault(Locale.US);

				// Comando para iniciar a entrada
				Scanner sc = new Scanner(System.in);

				// ler as notas do aluno
				System.out.println("Digite as duas notas de cada semestre em sequencia: ");

				double n1 = sc.nextDouble();
				double n2 = sc.nextDouble();

				// processamento da nota
				double notaFinal = n1 + n2;

				System.out.printf("NOTA FINAL = %.1f\n",notaFinal);

				// saida de dados
				if (notaFinal < 60.00) {
					System.out.println("REPROVADO");
				}

					sc.close();
				}
			}

