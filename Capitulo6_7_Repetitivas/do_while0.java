		package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

        import java.util.Locale;
        import java.util.Scanner;

        public class do_while0 {

            public static void main(String[] args) {

                // capitulo 6 - item 53


                // topico abordado: Estrutura repetitiva - Do While

                // \o bloco de comandos executa pelo menos uma vez, pois a condicao
                // e verificada no final.

                // Usar quando: menos utilizada, mas em alguns casos se encaixa melhor
                // ao problema.

                // Estrutura
                // do {
                // comando 1 e 2
                // } While (condicao);
                // Regra: se verdadeiro - volta pro comeco no 'do' do contrario pula fora.

                // diferenca principal do while and for
                // no "do While" o comando e executado pelo menos uma vez, ja no while e for
                // se der falso ele pula a condicao direto.


                // Problema exemplo:
                // Ler a temperatura em Celsius e mostrar o equivalente em Fahrenheit
                // Perguntar se o usuario deseja repetir (s/n)
                // Se sim repetir o programa

                // Formula: F = 9c/ 5 + 32


                // Digite a temperatura em Celsius: 30.0
                // Equivalente em Fahrenheit: 86.0
                // Deseja repetir (s/n)? s
                // Digite a temperatura em Celsius: 21.0
                // Equivalente em Fahrenheit: 69.8
                // Deseja repetir (s/n)? s
                // Digite a temperatura em Celsius: -10.5
                // Equivalente em Fahrenheit: 13.1
                // Deseja repetir (s/n)? n


                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                System.out.print("Digite a temperatura em Celsius: ");
                double C = sc.nextDouble();
                // calcular o valor em Fahrenheit
                // Formula: F = 9c/ 5 + 32
                double F = (9.0 * C / 5.0 ) + 32.0;

                System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
                // como facao para repetir
                System.out.print("Deseja repetir (s/n)? ");
                // criar variavel para receber a resposta
                char resp = sc.next().charAt(0);

                // para repetir enquanto a resposta for sim tem tres formas.

                // forma 1 - nao elegante para esse caso

                while (resp != 'n') {
                    System.out.print("Digite a temperatura em Celsius: ");
                    C = sc.nextDouble();
                    F = (9.0 * C / 5.0 ) + 32.0;
                    System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
                   System.out.print("Deseja repetir (s/n)? ");
                    resp = sc.next().charAt(0);

                }

                sc.close();
                }
        }



