		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        import java.util.Locale;
        import java.util.Scanner;

        public class switchCase_1 {

            public static void main(String[] args) {

                // capitulo 5 - item 37

                //############# Estrutura Switch-case #################

                // Usada quando se tem varias opcoes de fluxos a serem tratados com base
                // no valor de uma variavel, evitando o uso de varias estruturas if-else.



                // explicacao com swith case
                // primeiro exemplo com if-else e segundo exemplo com switch-case.

                //Fazer um programa para ler um numero inteiro de 1 a 7 representando
                // um dia da semana comecando no domingo.
                // escrever na tela o dia da semana.


                // Entrada: 1
                // Saída: Dia da semana: domingo
                // Entrada: 4
                // Saída: Dia da semana: quarta
                // Entrada: 9
                // Saída: Dia da semana: valor invalido


                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite um numero de 1 a 7  : ");

                // variaveis

                //ler o numero que a pessoa inseriu
                int x = sc.nextInt();

                // declaracao variavel dia para mostrar o dia da semana
                String dia;


                if (x==1 ) {
                    dia = "domingo";

                } else if (x==2){
                    dia = "segunda";
                } else if (x==3){
                    dia = "terca";
                } else if (x==4){
                    dia = "quarta";
                } else if (x==5){
                    dia = "quinta";
                } else if (x==6){
                    dia = "sexta";
                } else if (x==7){
                    dia = "sabado";
                } else
                    dia = "valor invalido";

                System.out.println("Dia da semana com if-else: " + dia);

                // ********** codigo com swith case *************

                int x1 = sc.nextInt();
                String diaS;

                // vou avaliar a expressao x, que e o valor digitado, caso seja um vai
                // atribuir domingo e assim por diante,
                // o break serve para que seja percorrido cada caso.
                switch (x1) {
                    case 1:
                        diaS = "domingo";
                        break;
                    case 2:
                        diaS = "segunda";
                        break;
                    case 3:
                        diaS = "terca";
                        break;
                    case 4:
                        diaS = "quarta";
                        break;
                    case 5:
                        diaS = "quinta";
                        break;
                    case 6:
                        diaS = "sexta";
                        break;
                    case 7:
                        diaS = "sabado";
                        break;
                        // como no if-else para o else a palavra usada no switch case e
                    // default seguido do valor a ser atribuido.
                    // trata-se do valor padrao caso todas as outras alternativas tenham
                    // falhado.
                    default:
                        diaS = " valor invalido";
                        break;
                }

                System.out.println("Dia da semana com swith case: " + diaS);
                    sc.close();
                }
            }




