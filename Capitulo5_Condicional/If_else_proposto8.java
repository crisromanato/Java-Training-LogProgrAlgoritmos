		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class If_else_proposto8 {

            public static void main(String[] args) {

                // exercicio PROPOSTO 8 - capitulo 5 - item 35


                // com if


                // Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa.
                // Calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
                // segundo a tabela abaixo.

                //  Renda                   Imposto
                // o a 2000                     isento
                // 2000.01 a 3000               8%
                // 3000.01 a 4500               18%
                // acima                        28%

                // Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8%
                // apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00
                // até R$ 2000.00 é isenta de Imposto de Renda.
                // No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 +
                // 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total.
                // O valor deve ser impresso com duas casas decimais.

                 // Entrada: 3002.00
                // Saída: R$ 80.36
                // Entrada: 1701.12
                // Saída: Isento
                // Entrada: 4520.00
                // Saída: R$ 355.60


                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o salario : " );

                // variaveis

                double salario = sc.nextDouble();
                double imposto;

                if (salario <=2000.0){
                    imposto = 0.0;
                }
                else if (salario <=3000.0){
                   imposto = (salario - 2000.0) * 0.08;

                }
                else if (salario <=4500.0){
                    imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;

                }
                else {
                    imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
                }

                if (imposto == 0.0) {
                    System.out.println("Isento");
                }
                else {
                    System.out.printf("R$ %.2f%n", imposto);
                }

                sc.close();
                }
        }



