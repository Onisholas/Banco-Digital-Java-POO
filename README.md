# Projeto Banco em Java

Este projeto é uma simulação de um sistema bancário em Java, que permite a criação de contas correntes e contas poupança. O sistema oferece funcionalidades como depósito, saque, transferência entre contas e aplicação de rendimento.

## Funcionalidades

- **Conta Corrente**
  - Depósito
  - Saque (com limite)
  - Transferência para outras contas

- **Conta Poupança**
  - Depósito
  - Saque
  - Aplicação de rendimento
### Descrição das Classes

- **ContaBancaria**: Interface que define os métodos que todas as contas devem implementar.
- **Conta**: Classe abstrata que implementa a interface `ContaBancaria` e fornece a implementação comum para os métodos de depósito e transferência.
- **ContaCorrente**: Extende a classe `Conta` e implementa o método `sacar`, permitindo saques que consideram um limite.
- **ContaPoupanca**: Também extende a classe `Conta` e implementa o método `sacar`. Possui um método para aplicar rendimento ao saldo.
- **Main**: Classe principal que executa o programa e testa as funcionalidades das contas.

## Como Executar o Projeto

### Pré-requisitos

- Java Development Kit (JDK) instalado em sua máquina.

### Compilação e Execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu_usuario/seu_repositorio.git
   cd seu_repositorio/src
