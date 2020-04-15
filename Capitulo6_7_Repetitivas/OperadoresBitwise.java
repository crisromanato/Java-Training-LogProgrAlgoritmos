package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

public class OperadoresBitwise {
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



        int n1 = 89;
        int n2 = 60;

        System.out.println("comparacao dois numeros para operadores diferentes : " + n1 +
                " e " + n2);
        System.out.println("Valor bit a bit para : 89 = 0101 1001");
        System.out.println("Valor bit a bit para : 60 = 0011 1100");
        System.out.println("Resultado em bit 0001 1000 e em decimal para o operador &(E) : " + (n1 & n2));
        System.out.println("Resultado em bit 0111 1101 e em decimal para o operador |(OU): " + (n1 | n2));
        System.out.println("Resultado em bit 0110 0101 e em decimal para o operador ^(XOR): " + (n1 ^ n2));

    }
}
