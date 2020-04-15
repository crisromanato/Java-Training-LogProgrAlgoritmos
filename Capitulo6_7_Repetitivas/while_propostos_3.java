		package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

        import java.util.Locale;
        import java.util.Scanner;

        public class while_propostos_3 {

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
                // Um Posto de combustíveis deseja determinar qual de seus produtos
                // tem a preferência de seus clientes.
                // Escreva um algoritmo para ler o tipo de combustível abastecido
                // (codificado da seguinte forma:
                // 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
                // Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
                // deve ser solicitado um novo código (até que seja válido).
                // O programa será encerrado quando o código informado for o número 4.
                // Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de
                // clientes que abasteceram cada tipo de combustível, conforme exemplo.

                // Entrada: 8 1 7 2 2 4
                // Saida: MUITO OBRIGADO - Alcool: 1 - Gasolina: 2 - Diesel: 0


                // Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java

                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite o codigo do combustivel: 1.Álcool 2.Gasolina " +
                        "3.Diesel 4.Fim ");


                int alcool = 0;
                int gasolina = 0;
                int diesel = 0;

                int tipo = sc.nextInt();


               while (tipo != 4) {
                   if (tipo == 1) {
                       alcool = alcool + 1;
                   } else if (tipo == 2) {
                       gasolina = gasolina + 1 ;
                   } else if (tipo == 3){
                       diesel = diesel + 1 ;
                   }
                   tipo = sc.nextInt();
               }

                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);

                sc.close();
                }
        }



