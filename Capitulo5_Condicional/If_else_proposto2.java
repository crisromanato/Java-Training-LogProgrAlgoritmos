		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class If_else_proposto2 {

            public static void main(String[] args) {

                // exercicio PROPOSTO 2 - capitulo 5 - item 35


                // com if


                // Fazer um programa para ler um número inteiro e
                // dizer se este número é par ou ímpar.

                 // exemlo de entrada ( 12 )
                // exemplo saida
                // PAR

                // exemlo de entrada ( -27 )
                // IMPAR

                // exemlo de entrada ( 0 )
                // PAR



                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite um numero positivo ou negativo:");

                // variaveis
                int N = sc.nextInt();

                // o simbolo % e um modulo e serve pra coletar o resto de uma divisao
                // verificamos abaixo se o resto de N/2 e igual a 0, ou se e multiplo de 2.

                            if (N % 2 == 0) {
                    System.out.println("PAR"); // se o resto da divisao de um numero
                                //   for igual a 0 ele e n par
                                }
                else {
                    System.out.println("IMPAR");
                }



                sc.close();
                }
        }




