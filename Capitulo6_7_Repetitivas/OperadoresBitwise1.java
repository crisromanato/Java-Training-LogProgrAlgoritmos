package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

import java.util.Scanner;

public class OperadoresBitwise1 {
    public static void main(String[] args) {
        // Operadores bitwise - capitulo 6 - item 56
        // Sao operadores que realizam operacoes logicas bit a bit em valores

        // Operador & chamado de E - só da verdadeiro quando as duas condicoes forem verdadeiras
        // Operador | chamada de OU - da verdadeiro quando pelo menos uma for verdadeira
        // Operador ^ chamdo de OU-exclusivo ou XOR da verdadeiro quando apenas uma
        // das condicoes forem verdadeira.
        // E quando ambas forem verdadeiras ele da falso - esta é a principal dif para o
        // OU normal.


        // para testar os valores binarios - use a calc no formato programador
        // digitando numeros aleatorios a calc vai mostrar o numero binario em decimal.

        // pra calcular os valores e mostrar o resultado
        // dependendo do operador bit a bit que usarmos ele vai fazer de uma maneira dif.

        // aplicacao em programcao de baixo nivel, microcontrolador, operacao de interface
        // com rede, arduino

        // testar numa aplicacao de verificacao de bit


        Scanner sc = new Scanner(System.in);

       int mask = 32;
        // ou declaracao em numero binaio
        // int mask = 0b00100000;
        // numero a esquerda pode apagar
        //int mask = 0b100000;

        int n = sc.nextInt();
        // testar se o eto bit da operacao q o usuario entrar vale 1 ou 0

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false");


            sc.close();
        }

    }
}
