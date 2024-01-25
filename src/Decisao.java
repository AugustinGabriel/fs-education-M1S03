public class Decisao {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        if (a == b) {
            System.out.println("A é igual a B");
        }

        if (a < b) {
            System.out.println("A é menor do que B");
        }

        /* ********************************************* */

        boolean primeiro = true;
        boolean segundo = false;
        boolean terceiro = false;

        boolean resultado = primeiro && segundo && terceiro; // false
        System.out.println(resultado);

        boolean resultado1 = primeiro || segundo && terceiro; // true

        System.out.println(resultado1);

        /* ********************************************* */

        int valorCarro = 80000;

        // 30 % > 100.000
        // 20 % >  80.000
        // 10 % <= 80.000

        double imposto = 0.1;
        if (valorCarro > 100000) {
            imposto = 0.3;
        } else if (valorCarro > 80000) {
            imposto = 0.2;
        }

        System.out.println("O valor total do imposto é: " + (valorCarro * imposto));

        /* ********************************************* */

        int valor = 1;
        System.out.println(((valor % 2) == 0) ? "É par" : "É impar");

        /* ********************************************* */

        int diaSemana = 6;
        String mensagem;
        switch (diaSemana) {
            case 1:
                mensagem = "Domingo - !!! IMPORTANTE !!! Não acorde cedo ;)";
                break;
            case 2:
                mensagem = "Segunda - !!! ALERTA !!! Corre que tá atrasado";
                break;
            case 3:
                mensagem = "Terça - Tome seu café reforçado";
                break;
            case 4:
                mensagem = "Quarta - Final de semana ta quase ai";
                break;
            case 5:
                mensagem = "Quinta - Final de semana ta quase ai MESMO";
                break;
            case 6:
                mensagem = "Sexta - Nos vemos na lanchonete";
                break;
            case 7:
                mensagem = "Sabado - Limpa a casa";
                break;
            default:
                mensagem = "Ups!";
        }

        System.out.println(mensagem);
    }

}
