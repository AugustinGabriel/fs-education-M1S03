import java.util.Random;
import java.util.Scanner;

public class Repeticao {

    public static void main(String[] args) {

        /* WHILE */
        int contador = 1;
        while (contador <= 100) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }

        /* DO-WHILE */
        int numero = new Random().nextInt(11);
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado;
        do {
            System.out.print("Tente adivinhar o numero sorteado: ");
            numeroDigitado = entrada.nextInt();
        } while (numero != numeroDigitado);
        System.out.println("Parabéns! O número é " + numero);
        entrada.close();

    }

}
