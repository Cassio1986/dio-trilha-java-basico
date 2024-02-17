import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt();
        System.out.println("Digite o número da Agência:");
        String agencia = scanner.next();
        System.out.println("Digite o Nome:");
        String nomeCliente = scanner.next();
        System.out.println("Digite o Sobrenome");
        String sobreNome = scanner.next();
        System.out.println("Digite o Saldo:");
        Double saldo = scanner.nextDouble();

System.out.println("Olá, " + nomeCliente + " " + sobreNome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
