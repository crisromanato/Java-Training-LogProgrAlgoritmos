		package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

        import java.util.Locale;
        import java.util.Scanner;

        public class for_1 {

            public static void main(String[] args) {

                // capitulo 6 - item 43


                // topico abordado: Estrutura repetitiva - For

                // Estrutura de controle que repete um bloco de comandos para
                // um certo intervalo de valores

                // Usar quando: quando se sabe previamente a quantidade de
                // repetições, ou intervalo de valores.

                // A diferenca entre o while e o if é que o while volta a excutar
                // enquanto a condicao for verdadeira e o if so executa

                // Problema exemplo:
                // Ler um valor inteiro N e depois N numeros inteiro.
                // Ao final, mostrar a soma dos N numeros lidos.

                // Entrada: 3 5 2 4
                // Saida: 11

                // estrutura para o for:

                // for (inicio; condicao; incremento)
                // inicio - executa so na primeira vez
                // condicao - se v: executa e volta  - se f: pula fora
                // incremento - executa toda vez depois de voltar.


                // estrutura base
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                // note que neste programa falamos pra ler o numero N que é (3)
                int N = sc.nextInt();

                int soma = 0;

                // logo apos falamos a quantidade de numeros inteiros que vamos ler
                // no exemplo (3 numeros sendo 5, 2 e 4)

                // comecar o programa
                // for (inicio; condicao; incremento) - valor : int i=0
                // condicao - se v: executa e volta  - se f: pula fora = valor i<N
                // ou seja executa enquanto a condicao for verdadeira
                // incremento - executa toda vez depois de voltar. = valor i=i+1 ou i++
                for (int i=0; i<N; i=i+1 ) {
                    // logica para executar varias vezes
                    int x = sc.nextInt();
                    soma = soma + x;
                }
                    System.out.println(soma);

                // como colocamos 3 para o N na execucao vai rodar 3 vezes
                // assim quando chegar no for vai iniciar e quando passar na condicao
                // i<N - enquanto o i que é zero no momento for menor que N vai continuar
                // rodando, ou seja, vai inicar com i = 0, ao checar a condicao i<N o
                // resultado sera i=0 e N=3, vai pra logica pra inserir x.
                // ao pegar o numero x que no caso foi 5 o valor vai ser levado para
                // a soma que vai ficar com 5, vai voltar (para o for) e pedir o proximo
                // numero pois definimos que seriam 3, na segunda rodada vai para o
                // incremento ao executar o i passa para 1 entao o (FOR) testa
                // a condicao novamente e e que o i agora vale 1 e o n vale 3
                // entao entra no proximo comando int z = sc.nextInt() para adicionar
                // o segundo numero.
                // ele faz isso ate a condicao ser falsa, quando for falsa ou seja
                // ao digitar o terceiro numero e somar, o programa vai sair fora
                // e ir para a impressao.

                // importante é que a impressao deve estar fora da chave do for
                // do contrario a impressao sera feita a cada incremento.

                sc.close();
                }
        }



