            package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

            import java.util.Locale;
            import java.util.Scanner;

            public class while_resolvidos_1 {

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
                    // Leia uma qt indeterminada de duplas de valores inteiros x e y.
                    // escreva para cada x e y uma msg q indique se estam digitados
                    // em forma crescente ou decrescente

                    // Entrada : a entrada contem varios casos de teste. cada caso contem
                    // dois valores inteiros x e y.
                    // a leitura deve ser encerrada ao ser fornecido valores iguais
                    // para x e y.

                    // Saida: Para cada caso de teste imprima "crescente", caso os valores
                    // tenham sido dig na ordem crescente e descrente se for o contrario

                    // Entrada: 5 4, 7 2, 3 8, 2 2
                    // Saida: Decrescente, Drecrescente Crescente - em branco


                    // Correção: https://www.youtube.com/watch?v=r3qCFqaNHds

                    // estrutura base
                    Locale.setDefault(Locale.US);
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Digite os valores: ");

                    // declaracao da variavel
                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    // enquanto x for diferente de y faça o procedimento abaixo
                    while (x != y) {
                        if (x < y) {
                            System.out.println("Crescente");
                        }
                        else {
                            System.out.println("Decrescente");
                        }
                        // após concluir a leitura dos dois itens para fazer novamente a
                        // leitura novamente colocar a variavel novamente
                        // nota a declaracao é feita uma vez so
                        // se precisar usar novamente colocar a variavel sem o tipo na frente
                        x = sc.nextInt();
                        y = sc.nextInt();

                    }
                                 sc.close();
                    }
            }



