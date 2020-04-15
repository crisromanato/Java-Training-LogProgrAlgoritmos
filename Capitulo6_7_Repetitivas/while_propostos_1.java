		package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

        import java.util.Locale;
        import java.util.Scanner;

        public class while_propostos_1 {

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
                // Escreva um programa que repita a leitura de uma senha até que ela
                // seja válida. Para cada leitura de senha incorreta informada,
                // escrever a mensagem "Senha Invalida". Quando a senha for informada
                // corretamente deve ser impressa a mensagem "Acesso Permitido" e o
                // algoritmo encerrado. Considere que a senha correta é o valor 2002.

                // Entrada: 2200 1020 2022 2002
                // Saida: senha invalida (3) e ultimo Acesso permitido

                // URI 1114
                // Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java

                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                int senha = sc.nextInt();

                while (senha != 2002) {
                      System.out.println("Senha invalida");
                    senha = sc.nextInt();
                }
                System.out.println("Acesso Permitido");

                sc.close();
                }
        }



