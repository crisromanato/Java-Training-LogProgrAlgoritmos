		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class If_else_proposto4 {

            public static void main(String[] args) {

                // exercicio PROPOSTO 4 - capitulo 5 - item 35


                // com if


                // Leia Leia a hora inicial e a hora final de um jogo.
                // A seguir calcule a duração do jogo, sabendo que o mesmo
                // pode começar em um dia e terminar em outro,
                // tendo uma duração mínima de 1 hora e máxima de 24 horas.

                 // Entrada: 16 20
                // Saída: O JOGO DUROU 4 HORA(S)
                // Entrada: 0 0
                // Saída: O JOGO DUROU 24 HORA(S)
                // Entrada: 2 16
                // Saída: O JOGO DUROU 14 HORA(S)


                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite inicio e fim do jogo: " );

                // variaveis
                int horaInicial = sc.nextInt();
                int horaFinal = sc.nextInt();

                int duracao;
                if (horaInicial < horaFinal) {
                    duracao = horaFinal - horaInicial;
                }
                else {
                    duracao = 24 - horaInicial + horaFinal;
                }

                System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

                sc.close();
                }
        }




