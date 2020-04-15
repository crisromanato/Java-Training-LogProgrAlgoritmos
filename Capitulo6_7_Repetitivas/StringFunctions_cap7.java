package LogicaProgramacaoAlgoritmos.Capitulo6_Repetitivas;

public class StringFunctions_cap7 {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG     ";

        String S01 = original.toLowerCase();
        String S02 = original.toUpperCase();
        String S03 = original.trim();  // remove espaço em branco no final
        String S04 = original.substring(2); // nova string a partir da casa indicada
        String S05 = original.substring(2,9); // nova string a partir da casa indicada
        // comeco e fim inidicado no argumento (2,9)
        String S06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");


        System.out.println("String Original:             -" + original + "-");
        System.out.println("String LowerCase:            -" + S01 + "-");
        System.out.println("String UperCase:             -" + S02 + "-");
        System.out.println("String trim:                 -" + S03 + "-");
        System.out.println("String substring (2):        -" + S04 + "-");
        System.out.println("String substring (2,9):      -" + S05 + "-");
        System.out.println("String replace (a,x):        -" + S06 + "-");
        System.out.println("String replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("String Index of 'bc':        -" + i + "-");
        System.out.println("String Last index of 'bc':   -" + j + "-\n");


        String s = "potato apple lemon";

        String [] vect = s.split(" ");

        System.out.println("String Split - vetor 0 : " + vect[0]+"-");
        System.out.println("String Split - vetor 1 : " + vect[1]+"-");
        System.out.println("String Split - vetor 2 : " + vect[2]+"-");

        String t; // comentario de linha
        // comentario de bloco


    }
}
