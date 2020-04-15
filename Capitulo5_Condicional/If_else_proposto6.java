		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class If_else_proposto6 {

            public static void main(String[] args) {

                // exercicio PROPOSTO 6 - capitulo 5 - item 35


                // com if


                // Você deve fazer um programa que leia um valor
                // qualquer e apresente uma mensagem dizendo em qual
                // dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100])
                // este valor se encontra.
                // Obviamente se o valor não estiver em nenhum destes intervalos,
                // deverá ser impressa a mensagem “Fora de intervalo”.


                 // Entrada: 25.01
                // Saída: Intervalo (25,5]
                // Entrada: 25.00
                // Saída: Intervalo (0,25]
                // Entrada: 100.00
                // Saída: Intervalo (75,100]
                // Entrada: -25.02
                // Saída: Fora de intervalo



                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite um valor com duas casas decimais: " );

                // variaveis

                double numero = sc.nextDouble();

                if (numero < 0.0 || numero > 100.0) {
                    System.out.println("Fora de intervalo");
                }
                else if (numero <= 25.0) {
                    System.out.println("Intervalo [0,25]");
                }
                else if (numero <= 50.0) {
                    System.out.println("Intervalo (25,50]");
                }
                else if (numero <= 75.0) {
                    System.out.println("Intervalo (50,75]");
                }
                else {
                    System.out.println("Intervalo (75,100]");
                }


                sc.close();
                }
        }



