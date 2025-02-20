public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(String numero, double rendimento) {
        super(numero);
        this.rendimento = rendimento;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && getSaldo() >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta " + getNumero());
            return true;
        }
        System.out.println("Saque não realizado. Saldo insuficiente.");
        return false;
    }

    public void aplicarRendimento() {
        saldo += saldo * rendimento;
        System.out.println("Rendimento aplicado na conta " + getNumero() + ". Novo saldo: R$ " + getSaldo());
    }
}