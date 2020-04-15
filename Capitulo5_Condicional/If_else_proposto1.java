		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class If_else_proposto1 {

            public static void main(String[] args) {

                // exercicio PROPOSTO 1 - capitulo 5 - item 35


                // com if


                // Criar classe
                // Leia 1 numero inteiro
                // Dizer se negativo ou positivo

                 // exemlo de entrada ( -10 )
                // exemplo saida
                // NEGATIVO

                // exemlo de entrada ( 8 )
                // NAO NEGATIVO

                // exemlo de entrada ( 0 )
                // NAO NEGATIVO



                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite um numero positivo ou negativo:");

                // variaveis
                int N = sc.nextInt();


                // descobrir se negativo ou positivo

                if (N < 0) {
                System.out.println("NEGATIVO");
                }
                else
                    System.out.println("NAO NEGATIVO");

                sc.close();
                }
        }




