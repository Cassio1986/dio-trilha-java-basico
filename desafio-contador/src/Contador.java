import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();
        terminal.close();
    
        try{
            contar(parametroUm, parametroDois);
        }catch(Exception e)
        {
            System.out.println("O valor do parametro Um e maior que o valor do parametro Dois");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for (int x = 0; x <= contagem; x++) {
            System.out.println("imprimindo o numero: " + x);
        }

    }

}
