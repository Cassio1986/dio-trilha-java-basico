import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        double valorMaximoDoce = 0;

        while (mesada > 1 && mesada > valorMaximoDoce) {
            double valorDoce = ValorAleatorio();
            valorMaximoDoce = valorDoce;
            System.out.println("Valor doce adicionado: " + valorDoce);
            mesada = mesada - valorDoce;

        }
        System.out.println("João gastou toda a sua mesada em doces");
        System.out.println("Valor que sobrou da mesada: " + mesada);
    }

    private static double ValorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
