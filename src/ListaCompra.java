import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> listaCompras = new ArrayList<>();

        listaCompras.add("Feijão");
        listaCompras.add("Arroz");
        listaCompras.add("Batata");
        listaCompras.add("Macarrão");
        listaCompras.add("Requeijão");
        listaCompras.add("Leite");
        listaCompras.add("Limão");
        listaCompras.add("Laranja");
        listaCompras.add("Goiaba");
        listaCompras.add("Manjericão");

        System.out.println("Bem vindo à lista de compras");

        do {

            System.out.print("Deseja (v)er | (a)dicionar | (r)emover | (s)air: ");
            String opcao = entrada.next();

            /** DESAFIO: Converter IFs para SWITCH */
            if (opcao.equalsIgnoreCase("s")) {
                break;
            }

            if (opcao.equalsIgnoreCase("a")) {
                System.out.print("Informe o item: ");
                String item = entrada.next();
                listaCompras.add(item);
                opcao = "v";
            } else if (opcao.equalsIgnoreCase("r")) {
                System.out.print("Informe o indice: ");
                int indice = entrada.nextInt();
                listaCompras.remove(indice);
                opcao = "v";
            }

            if (opcao.equalsIgnoreCase("v")) {
                for (int i = 0; i < listaCompras.size(); i++) {
                    String item = listaCompras.get(i);
                    System.out.println(i + " - " + item);
                }
            }

        } while (true);

    }

}
