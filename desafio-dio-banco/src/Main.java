import java.util.Scanner;

public class Main {
    static ContaCorrente cc = new ContaCorrente();
    static ContaPoupanca poupanca = new ContaPoupanca();

    public static void main(String[] args) {
        if (cc.saldo == 0)
            cc.depositar(200);
        if (poupanca.saldo == 0)
            poupanca.depositar(100);

        terminal();
    }

    public static void terminal() {

        System.out.println("==== Terminal ==== ");
        System.out.println("1 - Extrato");
        System.out.println("2 - Deposito");
        System.out.println("3 - Sacar");
        System.out.println("4 - Transferir");
        System.out.println("5 - Sair Sessão");
        Scanner scanner = new Scanner(System.in);
        int opcaoMenu = scanner.nextInt();

        if (opcaoMenu == 1) {
            extrato();
            System.out.println();
            terminal();
        }
        if (opcaoMenu == 2) {
            depositar();
            System.out.println();
            terminal();
        }
        if (opcaoMenu == 3) {
            sacar();
            System.out.println();
            terminal();
        }
        if (opcaoMenu == 4) {
            trasnferir();
            System.out.println();
            terminal();
        }
        if (opcaoMenu == 5) {
            System.out.println("Sessão encerrada!");
        } else if (opcaoMenu <=0 || opcaoMenu >= 6){
            System.out.println("Opção XXX inválida!");
            terminal();
        }
    }

    public static void extrato() {
        System.out.println("=== Selecione o tipo da conta ===");
        ;
        System.out.println("1 -  Conta Corrente");
        System.out.println("2 -  Conta Poupança");
        Scanner tconta = new Scanner(System.in);
        int tipoConta = tconta.nextInt();

        if (tipoConta == 1) {
            cc.imprimirExtrato();
        }
        if (tipoConta == 2) {
            poupanca.imprimirExtrato();
        } else if (tipoConta < 1 || tipoConta > 2) {
            System.out.println("Opção inválida");
            extrato();
        }
    }

    public static void depositar() {
        System.out.println("=== Selecione o tipo da conta ===");
        System.out.println("1 -  Conta Corrente");
        System.out.println("2 -  Conta Poupança");
        Scanner tconta = new Scanner(System.in);
        int tipoConta = tconta.nextInt();
        System.out.println("Informe o valor depositado:");
        double depositoValor = tconta.nextDouble();

        if (tipoConta == 1) {
            System.out.println(String.format("Saldo anterior da Conta Corrente: %.2f", cc.saldo));
            cc.depositar(depositoValor);
            System.out.println(String.format("Saldo Atual da Conta Corrente: %.2f", cc.saldo));

        }
        if (tipoConta == 2) {
            System.out.println(String.format("Saldo anterior da Conta Poupança: %.2f", poupanca.saldo));
            poupanca.depositar(depositoValor);
            System.out.println(String.format("Saldo Atual da Conta Poupança: %.2f", poupanca.saldo));
        } else if (tipoConta <=0 || tipoConta >= 3) {
            System.out.println("Opção inválida");
            
        }

    }

    public static void sacar() {
        System.out.println("=== Selecione o tipo da conta ===");
        System.out.println("1 -  Conta Corrente");
        System.out.println("2 -  Conta Poupança");
        Scanner tconta = new Scanner(System.in);
        int tipoConta = tconta.nextInt();
        System.out.println("Informe o valor sacado");
        double sacarValor = tconta.nextDouble();

        if (tipoConta == 1) {
            System.out.println(String.format("Saldo anterior da Conta Corrente: %.2f", cc.saldo));
            cc.sacar(sacarValor);
            System.out.println(String.format("Saldo Atual da Conta Corrente: %.2f", cc.saldo));

        }
        if (tipoConta == 2) {
            System.out.println(String.format("Saldo anterior da Conta Poupança: %.2f", poupanca.saldo));
            poupanca.sacar(sacarValor);
            System.out.println(String.format("Saldo Atual da Conta Poupança: %.2f", poupanca.saldo));
        } else if (tipoConta <=0 || tipoConta >= 3) {
            System.out.println("Opção inválida");
            
        }

    }


    public static void trasnferir() {
        System.out.println("=== Selecione o tipo da conta ===");
        System.out.println("1 -  Conta Corrente");
        System.out.println("2 -  Conta Poupança");
        Scanner tconta = new Scanner(System.in);
        int tipoConta = tconta.nextInt();
        System.out.println("Informe o valor sacado");
        double tranferirValor = tconta.nextDouble();

        if (tipoConta == 1) {
            System.out.println(String.format("Saldo anterior da Conta Corrente: %.2f", cc.saldo));
            cc.trasnferir(tranferirValor, poupanca);
            System.out.println(String.format("Saldo Atual da Conta Corrente: %.2f", cc.saldo));

        }
        if (tipoConta == 2) {
            System.out.println(String.format("Saldo anterior da Conta Poupança: %.2f", poupanca.saldo));
            poupanca.trasnferir(tranferirValor, cc);
            System.out.println(String.format("Saldo Atual da Conta Poupança: %.2f", poupanca.saldo));
        } else if (tipoConta <=0 || tipoConta >= 3) {
            System.out.println("Opção inválida");
            
        }

    }

}
