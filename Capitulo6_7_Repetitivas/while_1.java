		package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

        import java.util.Locale;
        import java.util.Scanner;

        public class while_1 {

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
                // Ler numeros inteiros ate q um zero seja lido.
                // No final mostrar a soma dos numeros lidos

                // Entrada: 5 2 4 0
                // Saida: 11


                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                int x = sc.nextInt();

                while (x != 0) {
                    x = sc.nextInt();
                }


                sc.close();
                }
        }



