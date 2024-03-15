import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private int numero;
    private String nome;
    private static List<String> bancos = new ArrayList<>();

    public static void main(String[] args) {

        bancos.add("001");
        bancos.add("033");
        bancos.add("104");
        bancos.add("237");

        menuBanco();

    }

    public static void listaBancos() {

        System.out.println("=====Lista de Bancos=====");
        for (String banco : bancos) {
            System.out.println(banco);
        }
        menuBanco();
    }

    public static void adicionarBanco() {
        System.out.println("Informa o numero do Banco: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String banco = scanner.nextLine();
            bancos.add(banco);
        }
        menuBanco();

    }

    public static void menuBanco() {
        System.out.println("====Menu====");
        System.out.println("1 - lista banco");
        System.out.println("2 - Adicioanr Banco");
        System.out.println("3 - Finalizar");
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                listaBancos();

            } else if (opcao == 2) {

                adicionarBanco();
            }

            else if (opcao == 3) {
                System.out.println("Finalizado sessão!!");
                System.out.println(opcao);
                ;
            } else {
                System.out.println("!! Opção invalida !!");
                menuBanco();
            }
        }
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
