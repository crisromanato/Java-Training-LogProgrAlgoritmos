		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class If_else_proposto3 {

            public static void main(String[] args) {

                // exercicio PROPOSTO 3 - capitulo 5 - item 35


                // com if


                // Leia 2 valores inteiros (A e B).
                // mostrar uma msg "Sao Multiplos"ou "Nao sao Multiplos",
                // indicando se os valores lidos são múltiplos entre si.
                // Atenção: os números devem poder ser digitados em ordem crescente
                // ou decrescente.

                 // exemlo de entrada ( 6 24 )
                // exemplo saida
                // Sao Multiplos

                // exemlo de entrada ( 6 25 )
                // exemplo saida
                // Nao sao Multiplos

                // exemlo de entrada ( 24 6 )
                // exemplo saida
                // Sao Multiplos



                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite dois numeros inteiros e veja se são multiplos " +
                        "ou não: ");

                // variaveis
                int A = sc.nextInt();
                int B = sc.nextInt();

                // Sao multiplos entre si quando a divisao do maior pelo menor e exato.



                if (A%B ==00 || B%A==0){
                    System.out.println("Sao Multiplos");
                } else
                {
                    System.out.println("Nao sao Multiplos");
                }



                sc.close();
                }
        }




