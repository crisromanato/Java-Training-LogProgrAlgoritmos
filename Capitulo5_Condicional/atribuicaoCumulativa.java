		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class atribuicaoCumulativa {

            public static void main(String[] args) {

                // capitulo 5 - item 36


                // com if


                // Uma operadora cobra 50 reais o plano basico com 100 minutos
                // Cada minuto excedente da franquia basica custa 2 reais.
                //Fazer um programa para ler a qt de minutos q a pessoa consumiu e
                // mostrar o valor a ser pago


                // Entrada: 22
                // Saída: Valor a pagar : R$ 50.00
                // Entrada: 103
                // Saída: Valor a pagar : R$ 56.00


                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Minutos consumidos de telefone : ");

                // variaveis

                //ler a qt de minutos q a pessoa consumiu
                int minutos = sc.nextInt();

                // calcular o valor da conta
                // comecar mostrando o valor basico da conta
                double conta = 50;

                if (minutos > 100) {
                    conta = conta + (minutos - 100) * 2.0;
                    System.out.printf("Valor a pagar : R$ %.2f%n", conta);

                    sc.close();
                }
            }
        }



