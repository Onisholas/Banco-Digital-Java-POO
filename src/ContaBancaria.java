public interface ContaBancaria {
    void depositar(double valor);
    boolean sacar(double valor);
    void transferir(double valor, ContaBancaria contaDestino);
    double getSaldo();
    String getNumero();

}