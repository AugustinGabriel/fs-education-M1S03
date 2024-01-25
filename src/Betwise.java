public class Betwise {

    public static void main(String[] args) {

        /*
            00000000 = 0
            00000001 = 1
            00000010 = 2
            00000011 = 3
            00000100 = 4
            00000101 = 5
            00000110 = 6
            00000111 = 7
        */

        /* **************** */
        /*  Bitwise AND (&) */
        /* **************** */

        int a = 5; // 101  (true , false, true)
        int b = 3; // 011  (false, true , true)
                   //      (false, false, true) 001

        System.out.println("Bitwise AND (&): " + (a & b)); // 001
        // RESULTADO: 1

        /* **************** */
        /*  Bitwise OR (|)  */
        /* **************** */

        a = 5; // 00000101  (true , false, true)
        b = 3; // 00000011  (false, true , true)
               //           (true , true , true) 111

        System.out.println("Bitwise OR (|): " + (a | b)); // 00000111
        // RESULTADO: 7

        /* **************************** */
        /* Bitwise XOR (^)              */
        /* Resultados iguais    = FALSE */
        /* Resultados diferentes = TRUE */
        /* **************************** */

        a = 3; // 00000101  (true , false, true )
        b = 5; // 00000011  (false, true , true )
               //           (true , true , false) 110

        System.out.println("Bitwise XOR (^): " + (a ^ b )); // 00000110
        // RESULTADO: 6

        // HACK da substituição dos valores (By Lucas)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Valor a: " + a + "; Valor b: " + b);

    }

}
