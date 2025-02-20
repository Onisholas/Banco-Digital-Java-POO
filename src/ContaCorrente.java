public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta " + getNumero());
            return true;
        }
        System.out.println("Saque não realizado. Saldo insuficiente.");
        return false;
    }
}