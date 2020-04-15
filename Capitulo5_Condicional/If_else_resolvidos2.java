		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class If_else_resolvidos2 {

            public static void main(String[] args) {

                // exercicio resolvido 2 URI-1036 no uri online judge - capitulo 5 - item 35


                // com if composto


                // Criar classe
                // Leia 3 valores de ponto flutuante
                // efetue os calculos das raizes de equacao Bhaskara
                // se nao for possivel calcular mostre a msg - "Impossivel calcular"
                // a msg vira caso haja divisao por 0 ou raiz de numero negativo

                // entrada
                // leia 3 valores fluantes (double) A,B,C

                // saida
                // caso não possa calcular imprima a msg acima
                // caso contrario imprima as raized com 5 digitos após o ponto


                // exemlo de entrada ( 10.0 20.1 5.1 )
                // exemplo saida
                // R1 = -0.29788
                // R2 = -1,71212

                // exemlo de entrada ( 0.0 20.0 5.0 ) - impossivel pois coeficiente A
                // igual a zero nao calcula na equacao de segundo grau.
                // exemplo saida
                // Impossivel calcular

                // exemlo de entrada ( 10.3 203.0 5.0 )
                // exemplo saida
                // R1 = -0.02466
                // R2 = -19,68408

                // exemlo de entrada ( 10.0 3.0 5.0 ) - impossivel pq o valor de delta e
                // menor que zero
                // exemplo saida
                // Impossivel calcular


                // Bhaskara calculo
                // x = -b (+-) raiz delta / 2 * a
                // ou  delta = b2 - 4ac
                // calculo final :
                // R1: -b + (delta = b2 - 4ac) / 2 * a
                // R2: -b - (delta = b2 - 4ac) / 2 * a

                // Regra:
                // o delta não pode ser negativo e A não pode ser zero.

                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite os valores de A, B, C em sequencia:");

                // variaveis
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();

                System.out.println("a = " +  a);
                System.out.println("b = " +  b);
                System.out.println("c = " +  c);

                System.out.println("\nEquacao de Bhaskara calculada com base em: ");

                double delta = b * b - 4.0 * a * c;
                // barra reta usar alt124 e barra invertida alt92

                if  (a == 0 || delta < 0.0) {
                    System.out.println("R1: -b + (delta = b2 - 4ac) / 2 * a\n" +
                            "R2: -b - (delta = b2 - 4ac) / 2 * a");
                    System.out.println("\nFormula de delta: ");
                    System.out.println("delta = " + b + " * "  + b + " - 4.0  * " + a + " * " + c);
                    System.out.println("delta = " + b * b + " - 4.0  * " + a  * c);
                    System.out.println("delta = " + (b * b -4.0 * a  * c));
                    System.out.println("Impossivel calcular para 'a' igual 0 ou delta negativo");
                }
                else {
                    double r1 = (-b+Math.sqrt(delta)) / (2.0 * a);
                    double r2 = (-b-Math.sqrt(delta)) / (2.0 * a);

                    // R1: -b + (delta = b2 - 4ac) / 2 * a
                    // R2: -b - (delta = b2 - 4ac) / 2 * a

                    System.out.println("Formula R1 = -b + (delta = b2 - 4ac) / 2 * a" );
                    System.out.println("R1 = " +(-b)+ " + " + "(delta de : (" + b + " * "  + b + ")" +
                            " - 4.0  *  (" + a + " * " + c + ")"+" ) / (" + 2.0 + " * " + a + ")" );
                    System.out.printf("R1 = %.5f%n%n", r1);

                    System.out.println("Formula R2 = -b + (delta = b2 - 4ac) / 2 * a" );
                    System.out.println("R2 = " +(-b)+ " + " + "(delta de : (" + b + " * "  + b + ")" +
                            " - 4.0  *  (" + a + " * " + c + ")"+" ) / (" + 2.0 + " * " + a + ")" );
                    System.out.printf("R2 = %.5f%n%n", r2);
                }
                sc.close();


            }
        }
