public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    private static final int AGENCIA_PADRAO = 00001;
    private static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(double valor) {
        saldo -= valor;

    }

    public void depositar(double valor) {
        saldo += valor;

    }

    public void trasnferir(double valor, Conta conta) {
        this.sacar(valor);
        conta.depositar(valor);

    }

    public void imprimirDadosConta()
    {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
