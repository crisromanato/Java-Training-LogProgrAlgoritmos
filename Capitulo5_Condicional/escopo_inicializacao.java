		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        public class escopo_inicializacao {

            public static void main(String[] args) {

                //  capitulo 5 - item 39 - Escopo e Inicializacao
                //_________________________________________//
                //escopo de uma variavel = regiao do programa onde a variavel e valida
                // ou seja onde ela pode ser referenciada

                // em java uma variavel nao pode ser usada se nao for iniciada

                // nota escopo de metodos sera tratado em outro capitulo

                //_________________________________________//

                // ********** explicacao sobre inicializacao de variavel *********
                // iniciando uma variavel
                double preco = 400.00;
                // ao imprimir aparece o valor na tela
                System.out.println("preco  : " + preco);

                // se eu criar uma nova variavel e nao iniciar aparece um erro de compilacao
                double preco1;
                // System.out.println(preco1);

                // a variavel pode ser iniciada recebendo o valor de outra, via scanner, etc

                //_________________________________________//

                // ********** explicacao sobre escopo *********

                //_________________________________________//
                // ********* Caso um erro de "Cannot resolve symbol - variavel discount"
                // o exemplo abaixo se ativado gera um erro na linha do println
                // , pq a variavel discount foi declarada e utilizada somente dentro da
                // estrutura condicional if e so pode ser usada dentro dela.
                // signfica que as estruturas tem seu proprio escopo
                // isso ocorre para qualquer estrutura de controle, repetitiva, condicional
                // switch-case, etc.
                //
                // todas variaveis declaradas dentro da estrutura so existem dentro dela
                // quando a execucao termina as variaveis somem / sao desalocadas da memoria

                //double price3 = 450.00;
                //if (price3 < 200.00){
                //double discount = price3 * 0.1;
                //}
                //System.out.println(discount);
                //}

                // Para usar a variavel, tem que se declarar fora da estrutura
                // exemplo abaixo de como fazer.

            //_________________________________________//

            // ********* Caso um erro de "Variavel discount1 - might not have been initialized"

                //double price4 = 450.00;
                // declaracao da variavel discount1 fora da condicional if
                //double discount1;
                //if (price4 < 200.00){
                    // inicializacao da variavel
                    //discount1 = price4 * 0.1;
               // }
               // System.out.println(discount1);
                // esse erro ocorre pq se a condicao der falso o comando de inicializacao
                // na linha discount dentro do if seja pulado.
                // exemplo abaixo de como fazer para corrigir a situacao tem que se iniciar a
                // variavel discount 1 fora do if, por exemplo com 0.
                // exemplo abaixo

                //_________________________________________//

                // ********* Caso com variavel iniciada como 0"
                // note que ela foi inicializada e pertence ao esopo do public static void main
                // e pode ser usada
                double price5 = 450.00;
                // declaracao da variavel discount1 fora da condicional if
                double discount2 = 0;
                if (price5 < 200.00){
                    // inicializacao da variavel
                    discount2 = price5 * 0.1;
                }
                System.out.println(discount2);


                //_________________________________________//

                // ********* Caso alternativo com variavel iniciada como 0 dentro do else"
                // note que ela foi inicializada e pertence ao escopo do public static void main
                // e pode ser usada
                double price6 = 450.00;
                // declaracao da variavel discount1 fora da condicional if
                double discount3;
                if (price6 < 200.00){
                    // inicializacao da variavel
                    discount3 = price6 * 0.1;
                } else {
                    discount3 = 0;
                }
                System.out.println(discount3);

            }


        }



