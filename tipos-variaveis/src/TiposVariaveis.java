
public class TiposVariaveis {

    public static void main(String[] args) throws Exception {

        String mensagem = "Valor de saida é: ";

        Double salarioMinimo = 2500.00;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_DE_PI = 3.14;

        System.out.println(mensagem + VALOR_DE_PI);
    }
}
