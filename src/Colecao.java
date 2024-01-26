import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Double> dimensoes = new ArrayList<>();

        System.out.println("*****************************************************");
        System.out.println("*                     Bem vindo                     *");
        System.out.println("* Ao melhor sistema de cálculo de volume da galáxia *");
        System.out.println("*****************************************************");

        System.out.print("Digite a altura: ");
        dimensoes.add(entrada.nextDouble());

        System.out.print("Digite a largura: ");
        dimensoes.add(entrada.nextDouble());

        System.out.print("Digite o comprimento: ");
        dimensoes.add(entrada.nextDouble());

        double volume = dimensoes.get(0) * dimensoes.get(1) * dimensoes.get(2);
        System.out.println("Volume calculado: " + volume);
    }

}
