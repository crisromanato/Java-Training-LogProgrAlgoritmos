    package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

    import java.util.Scanner;

    public class FuncoesSintaxe1 { // abre chave da classe


       /* Capitulo 6 - item 59 Funcoes (sintaxe)

       Funcoes
       Representam um processamento que possui significado:
       eg de funcoes
       Math.sqrt(double) - double é um argumento
        Neste exemplo da formula Math raiz quadrados vemos bem a modularização e a
        delegacao do programa e por fim tambem poe reaproveitar a funcao varias vezes
       System.out.println(string)

       Principais vantagens: modularizacao, delegacao e reaproveitamento

       Dados de entrada e saida
       Funcoes podem receber dados de entradas(parametros ou argumentos)
       Podem ou nao retornar uma saida

       Em orientacao a objetos, funcoes em classes recebem o nome de metodos.

       */

        /* Fazer um programa para trazer o maior numero entre 3 numeros.

         */
        public static void main(String[] args) { // abre chave da funcao main
            Scanner sc = new Scanner(System.in);

            System.out.println("Entre 3 numeros: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            int higher = max(a, b, c);
            showResult(higher);

            sc.close();
        } // fecha chave da funcao main

    /* Criar uma nova funcao MAX
    1. primeiro informo a visiblidade da funcao que neste caso e = public
    2. depois informamos que é static = a funcao pode ser chamada independente de se criar um
    objeto
    3. depois informamos o tipo = int (integer)
    4. informamos o nome da funcao, neste caso MAX que vai retornar o maior dos numeros
    inteiros
    5. entre parenteses vamos declarar os parametros da funcao (composto do tipo + o nome
    note que o nome nao precisa ser o mesmo da variante principal.
    Quando executarmos o programa a funcao vai casar os valores declarados na variavel (a,b,c)
    com os valores da funcao com os nomes (x,y,z).

     */

        public static int max(int x, int y, int z) { // abre chave da funcao MAX
        /* Implementar a logica da funcao
        declarar uma variavel aux que vai ser uma variavel local e so vai valer dentro da
        funcao (baseado no escopo da funcao)
    */
            int aux;
            if (x > y && x > z) { // abre chave do if
                aux = x;
            } // fecha chave do if
            else if (y > z) { // abre chave do else if
                aux = y;
            }  // fecha chave do else if
            else { // abre chave do else
                aux = z;
            } // fecha chave do else
            return aux;
        } // fecha chave da funcao MAX

          /* Criar uma nova funcao SHOW result
    1. primeiro informo a visiblidade da funcao que neste caso e = public
    2. depois informamos que é static = a funcao pode ser chamada independente de se criar um
    objeto
    3. depois informamos o tipo = void
    Quando a funcao faz uma acao sem retornar o valor que vai ser reaproveitado
    no programa chamamos de void que significa vazio.
        4. informamos o nome da funcao, neste caso showResult
    5. entre parenteses vamos declarar os parametros da funcao (composto do tipo + o nome
    note que o nome nao precisa ser o mesmo da variante principal.
    A ideia é passe como parametro um valor e a funcao vai imprimir na tela a msg utili-
    zando o valor.


     */

        public static void showResult(int value) { // abre chave da funcao SHOW result
        /* Implementar a logica da funcao
        imprimir na tela o valor "value" com  a msg explicativa do programa.

    */
            System.out.println("Higher showResult= " + value);
        } // fecha chave da funcao Show Result

    } // fecha chave da funcao classe
