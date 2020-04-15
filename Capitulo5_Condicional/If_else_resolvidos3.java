		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class If_else_resolvidos3 {

            public static void main(String[] args) {

                // exercicio resolvido 3 - capitulo 5 - item 35


                // com if composto


                // Criar classe
                // Leia 3 numeros inteiros
                // Mostre qul o menor dentre elese em caso de empate mostrar apenas uma vez

                 // exemlo de entrada ( 7 3 8 )
                // exemplo saida
                // MENOR = 3

                // exemlo de entrada ( 5 12 5 )
                // exemplo saida
                // MENOR = 5

                // exemlo de entrada ( 9 9 9 )
                // exemplo saida
                // MENOR = 9



                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite os valores de A, B, C em sequencia:");

                // variaveis
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                // como pegar o menor
                // encadeamento de estruturas condicionais para descobrir o menor

                if (a < b && a < c) {
                System.out.println("MENOR = " + a);
                }
                else if (b < c) {
                    System.out.println("MENOR = " + b);

                }
                else {
                    System.out.println("MENOR = " + c);



                }
                sc.close();


            }
        }
