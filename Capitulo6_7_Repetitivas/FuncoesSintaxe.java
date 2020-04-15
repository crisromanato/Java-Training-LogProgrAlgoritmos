    package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

    import java.util.Scanner;

    public class FuncoesSintaxe { // abre chave da classe


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

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            if (a > b && a > c) { // abre chave do if
                System.out.println("Higher = " + a);
            } // fecha chave do if
            else if (b > c) { // abre chave do else if
                System.out.println("Higher = " + b);
            }  // fecha chave do else if
            else { // abre chave do else
                System.out.println("Higher = " + c);
            } // fecha chave do else



            sc.close();
        } // fecha chave da funcao main


    } // fecha chave da funcao classe
