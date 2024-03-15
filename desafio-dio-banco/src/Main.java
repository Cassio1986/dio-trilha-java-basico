import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        terminalBancario();
    }

    public static void terminalBancario() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cassio Fernandes");
        cliente.setCPF("107.643.947-03");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        cc.saldo = 1150;
        cp.saldo = 3500;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Conta Corrente = 1 ou Conta Poupança = 2");
            int tipoConta = scanner.nextInt();
            if (tipoConta == 0 || tipoConta >= 3) {
                System.out.println("Valor invádio");
                terminalBancario();
            }

            System.out.println("=========Terminal=========");
            System.out.println("1 - Menu Banco");
            System.out.println("2 - Depositor");
            System.out.println("3 - Transferir");
            System.out.println("4 - Imprimir Extrato");
            System.out.println("5 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Banco.menuBanco();
                    terminalBancario();
                    break;

                case 2:
                    System.out.println("=====Deposito=====");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");
                    int deposito = scanner.nextInt();
                    System.out.println("Valor: ");
                    double valor = scanner.nextDouble();
                    if (deposito == 1) {
                        System.out.println("Saldo Conta Corrente");
                        cc.depositar(valor);
                        System.out.println("");
                        terminalBancario();
                    } else {
                        System.out.println("Saldo Conta Poupança");
                        cp.depositar(valor);
                        System.out.println("");
                    }
                    terminalBancario();
                    break;
                case 3:
                    System.out.println("=====Transferir======");
                    System.out.println("Informe o valor:");
                    double transferir = scanner.nextDouble();

                    if (tipoConta == 1) {
                        cc.transferir(transferir, cp);
                        System.out.printf("Saldo Conta corrente: R$ %.2f", cc.saldo);
                        System.err.println("");
                        System.out.printf("Saldo Conta Poupança: R$ %.2f", cp.saldo);
                    } else {
                        cp.transferir(transferir, cc);
                        System.out.printf("Saldo Conta Poupança: R$ %.2f", cp.saldo);
                        System.err.println("");
                        System.out.printf("Saldo Conta corrente: R$ %.2f", cc.saldo);
                    }
                    terminalBancario();
                    break;
                case 4:
                    System.out.println("=====Extrato=====");
                    if (tipoConta == 1) {
                        System.out.println("      Dados");
                        System.out.println(" Conta Corrente");
                        cc.imprimirExtrato();
                    } else {
                        System.out.println("      Dados");
                        System.out.println(" Conta Poupança");
                        cp.imprimirExtrato();
                    }
                    terminalBancario();
                    break;
                case 5:
                    System.out.println("Sessão encerrada");
                    break;
                default:
                    System.err.println("Opção inválida!");
                    terminalBancario();
                    break;
            }
        }

    }

}
