                package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

                import java.util.Locale;
                import java.util.Scanner;

                public class while_resolvidos_2 {

                    public static void main(String[] args) {

                        // capitulo 6 - item 43


                        // topico abordado: Estrutura repetitiva - While

                        // Estrutura de controle que repete um bloco de comandos enquanto
                        // uma condico for verdadeira

                        // Usar quando: nao se sabe previamente a quantidade de repeticoes
                        // que sera realizado

                        // A diferenca entre o while e o if é que o while volta a excutar
                        // enquanto a condicao for verdadeira e o if so executa

                        // Problema exemplo:
                        // Faca um programa para ler um numero indeterminado de dados,
                        // contendo cada um, a idade de uma pessoa. O ultimo dado, que nao
                        // entrara nos calculos, contem uum valor de idade negativa.
                        // calcular e imprimir a idade media deste grupo.
                        // se for entrado um valor negativo na primeira vez, mostrar o
                        // valor impossivel calcular

                        // Entrada: 31 27 46 -5
                        // Saida: 34.67

                        // Entrada: -10
                        // Saida: Impossivel calcular


                        // Correção: https://www.youtube.com/watch?v=vT0QEDHK2yU

                        // estrutura base
                        Locale.setDefault(Locale.US);
                        Scanner sc = new Scanner(System.in);

                        System.out.println("Digite os valores: ");

                       // declarar a idade e fazer a leitura
                        int idade = sc.nextInt();
                        // para cada idade que nao for negativa, deve ser acumulada
                        int soma = 0;
                        // criar uma variavel para contar a idade comecando do 0
                        int cont = 0;

                      // enquanto a idade nao for negativa vou processar
                        // e repetir a idade , pra testar se nao é negativa,
                        // fazer:

                       while (idade >= 0) {      // determinar o que deve ser feito se nao
                           // for negativa fazer a soma das idades,
                           soma = soma + idade;
                           cont = cont + 1;     // contar o numero de entradas conforme
                                                // elas forem sendo feitas
                           idade = sc.nextInt();
                       }

                       if (cont > 0) {
                           double media = (double) soma / cont; // inserir o casting
                                        // antes da soma para obter valor com digitos
                           System.out.printf("%.2f", media);
                       }
                       else {
                           System.out.println("impossivel calcular");

                           // no final colocar pra ler de novo a idade

                      }


                                     sc.close();
                }

    }