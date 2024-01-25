import java.util.Scanner;

public class EntradaDado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.next();

        System.out.print("Digite sua idade: ");
        byte idade = entrada.nextByte();

        System.out.println();
        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);

        entrada.close();
    }
}
