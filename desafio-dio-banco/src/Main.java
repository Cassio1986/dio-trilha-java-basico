public class Main {



    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Cassio Fernandes");
        cliente.setCPF("107.643.947-03");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(1000);
        cc.transferir(175.0, cp);

        System.out.println("=== Extrato Conta corrente ===");
        cc.imprimirExtrato();
        System.out.println("=== Extrato Conta Poupança ===");
        cp.imprimirExtrato();

    }
    
}
