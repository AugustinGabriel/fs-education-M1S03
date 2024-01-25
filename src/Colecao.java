import java.util.Scanner;

public class Colecao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] dimensoes = new double[3];

        System.out.println("*****************************************************");
        System.out.println("*                     Bem vindo                     *");
        System.out.println("* Ao melhor sistema de cálculo de volume da galáxia *");
        System.out.println("*****************************************************");

        System.out.print("Digite a altura: ");
        dimensoes[0] = entrada.nextDouble();

        System.out.print("Digite a largura: ");
        dimensoes[1] = entrada.nextDouble();

        System.out.print("Digite o comprimento: ");
        dimensoes[2] = entrada.nextDouble();

        System.out.println("Volume calculado: " + (dimensoes[0] * dimensoes[1] * dimensoes[2]));
    }

}
