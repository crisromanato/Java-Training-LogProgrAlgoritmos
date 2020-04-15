		package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

        import java.util.Locale;
        import java.util.Scanner;

        public class while_propostos_2 {

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
                // Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
                // indeterminada de pontos no sistema cartesiano. Para cada ponto escrever
                // o quadrante a que ele pertence. O algoritmo será encerrado quando
                // pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever
                // mensagem alguma).

                // Entrada: 2 2 , 3 -2, -8 -1, -7 1, 0 2
                // Saida: primeiro, quarto, terceiro, segundo


                // Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java

                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite x e y: ");

                int x = sc.nextInt();
                int y = sc.nextInt();


                while (x != 0 && y != 0) {

                    if (x > 0 && y > 0) {

                        System.out.println("primeiro");

                    } else if (x < 0 && y > 0) {

                        System.out.println("segundo");

                    } else if (x < 0 && y < 0) {

                        System.out.println("terceiro");

                    } else {

                        System.out.println("quarto");

                    }

                    x = sc.nextInt();

                    y = sc.nextInt();
                }

                sc.close();
                }
        }



