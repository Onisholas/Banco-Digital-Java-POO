public class Main {
    public static void main(String[] args) {
        // Criando uma conta corrente com limite
        ContaBancaria contaCorrente = new ContaCorrente("12345-6", 500.0);

        // Criando uma conta poupança com rendimento
        ContaPoupanca contaPoupanca = new ContaPoupanca("65432-1", 0.05);

        // Testando a conta corrente
        contaCorrente.depositar(1000); // Depósito inicial
        contaCorrente.sacar(200);       // Saque de R$ 200
        contaCorrente.sacar(300);       // Saque de R$ 300

        // Testando a conta poupança
        contaPoupanca.depositar(300);   // Depósito de R$ 300 na conta poupança
        contaPoupanca.depositar(500);    // Depósito de R$ 500 na conta poupança
        contaPoupanca.aplicarRendimento(); // Aplicar rendimento após os depósitos

        // Transferência de R$ 300 da conta corrente para a conta poupança
        contaCorrente.transferir(300, contaPoupanca);

        // Saque na conta poupança
        contaPoupanca.sacar(100);        // Saque de R$ 100 na conta poupança

        // Exibindo saldos finais
        System.out.println("Saldo final da conta corrente: R$ " + contaCorrente.getSaldo());
        System.out.println("Saldo final da conta poupança: R$ " + contaPoupanca.getSaldo());
    }
}