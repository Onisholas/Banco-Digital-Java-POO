public abstract class Conta implements ContaBancaria {
    private String numero;
    protected double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado na conta " + numero);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void transferir(double valor, ContaBancaria contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " da conta " + numero + " para a conta " + contaDestino.getNumero() + " realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente.");
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String getNumero() {
        return numero;
    }
}