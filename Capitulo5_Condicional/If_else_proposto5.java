		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class If_else_proposto5 {

            public static void main(String[] args) {

                // exercicio PROPOSTO 5 - capitulo 5 - item 35


                // com if


                // Com base na tabela abaixo, escreva um programa que leia
                // o código de um item e a quantidade deste item.
                // A seguir, calcule e mostre o valor da conta a pagar.

                //  codigo      especificacao       preco
                //  1           cachorro quente       4.00 reais
                //  2           x-salada              4.50 reais
                //  3           x-bacon               5.00 reais
                //  4           torrada simples       2.00 reais
                //  5           refrigerante          1.5 reais
                //

                 // Entrada: 3 2
                // Saída: Total: R$ 10.00
                // Entrada: 2 3
                // Saída: Total: R$ 13.50



                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o item e quantidade: " );

                // variaveis

                int codigo = sc.nextInt();
                int quantidade = sc.nextInt();

                double total;
                if (codigo == 1) {
                    total = quantidade * 4.0;
                }
                else if (codigo == 2) {
                    total = quantidade * 4.5;
                }
                else if (codigo == 3) {
                    total = quantidade * 5.0;
                }
                else if (codigo == 4) {
                    total = quantidade * 2.0;
                }
                else {
                    total = quantidade * 1.5;
                }

                System.out.printf("Total: R$ %.2f%n", total);

                sc.close();
                }
        }




