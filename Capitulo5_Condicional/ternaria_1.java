		package LogicaProgramacaoAlgoritmos.Capitulo5_Condicional;

        public class ternaria_1 {

            public static void main(String[] args) {

                //  capitulo 5 - item 38 - expressao condicional ternaria

                //Estrutura opcional ao if-else qundo se deseja decidir um VALOR com base
                // em uma condicao - normalmente unica

                // sintaxe:
                // (condicao) ? valor_se_verdadeiro : valor_se_falso

                //Exemplos
                // (2 > 4) ? 50:80 ...... resultado sera 80 porque a condicao e falsa
                // (10 != 3) ? "Maria":"Alex" ...... resultado sera "Maria" pq a condicao
                // e verdadeira



                // demonstracao com if-else

                double preco = 34.5;
                double desconto;
                if (preco<20.0) {
                    desconto = preco * 0.1;
                }
                else {
                    desconto = preco * 0.05;
                }

                // demonstracao com expressao ternaria - reducao de 8 linhas para 2

                double preco1 = 34.5;
                double desconto1 = (preco1<20.0) ? preco1 *0.1 : preco1 * 0.05;

                System.out.println("preco com if-else : " + preco);
                System.out.println("desconto com if-else : " + desconto);
                System.out.println("preco com ternaria : " + preco1);
                System.out.println("desconto com ternaria : " + desconto1);
                }


        }



