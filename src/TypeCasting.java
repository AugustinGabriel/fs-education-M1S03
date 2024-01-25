import java.math.BigDecimal;
import java.math.RoundingMode;

public class TypeCasting {
    public static void main(String[] args) {
        byte primeiroNumero = 4;
        double segundoNumero = primeiroNumero + 0.8;

        System.out.println("Implícito: " + segundoNumero);

        short terceiroNumero = (short) segundoNumero;
        System.out.println("Explícito: " + terceiroNumero);

        String primeiroTexto = "" + terceiroNumero;
        System.out.println("Double para String concatenando (+ \"\"): " + primeiroTexto);

        String segundoTexto = Double.toString(segundoNumero);
        System.out.println("Double para String: " + segundoTexto);

        double quartoNumero = Double.parseDouble(segundoTexto);
        System.out.println("String para Double: " + quartoNumero);

        double quintoNumero = 7.3491;
        double res = Math.floor(quintoNumero * 100) / 100;
        System.out.printf("Resultado: %.2f \n", quintoNumero);
        System.out.println("Resultado: " + res);

        BigDecimal resExemplo = new BigDecimal("7.3491").setScale(2, RoundingMode.DOWN);
        System.out.println("Resultado BigDecimal: " + resExemplo);

        int sextoNumero = 21;
        System.out.println("Soma: " + (sextoNumero + 4));
        System.out.println("Subtração: " + (sextoNumero - 4));
        System.out.println("Multiplicação: " + (sextoNumero * 4));
        System.out.println("Divisão (inteiro): " + (sextoNumero / 4));
        System.out.println("Divisão (double): " + ((double) sextoNumero / 4));
        System.out.println("Mod (double): " + (sextoNumero % 4));
        System.out.println("Expoente: " + Math.pow(sextoNumero, 4));

    }
}
