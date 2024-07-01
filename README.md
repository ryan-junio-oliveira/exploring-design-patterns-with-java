# Processamento de Pagamentos em Java

Este projeto demonstra um sistema de processamento de pagamentos em Java, utilizando os padrões de projeto Singleton, Strategy e Facade para oferecer flexibilidade e organização na implementação.

## Padrões de Projeto Implementados

### Singleton

O padrão Singleton é utilizado para garantir que haja apenas uma única instância do `PaymentManager` durante toda a execução do programa.

- **Exemplo de Implementação:**
  - `PaymentManager.java`: Implementação do Singleton que gerencia o processamento de pagamentos.

### Strategy

O padrão Strategy é usado para definir diferentes estratégias de pagamento (como cartão de crédito, PayPal, etc.), encapsulando cada uma delas em classes separadas.

- **Exemplo de Implementação:**
  - `PaymentStrategy.java`: Interface que define o contrato para as estratégias de pagamento.
  - `CreditCardPayment.java` e `PayPalPayment.java`: Implementações concretas das estratégias de pagamento.
  - `PaymentStrategyFactory.java`: Fábrica que retorna a estratégia correta com base no método de pagamento escolhido.

### Facade

O padrão Facade oferece uma interface simplificada (`PaymentFacade`) para o cliente interagir com o sistema de pagamentos, ocultando a complexidade das implementações de estratégia.

- **Exemplo de Implementação:**
  - `PaymentFacade.java`: Facade que fornece métodos simples para o cliente (aplicação principal) processar pagamentos.

## Como Usar

Para utilizar este projeto em seu ambiente de desenvolvimento:

1. Clone o repositório:
   
git clone https://github.com/seu-usuario/processamento-de-pagamentos-java.git

2. Importe o projeto para sua IDE favorita (como Eclipse, IntelliJ IDEA) como um projeto Maven.

3. Execute o `Main.java` para ver exemplos de processamento de pagamentos utilizando diferentes métodos (cartão de crédito, PayPal).

4. Explore e adapte as implementações conforme necessário para seu próprio uso.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorar este exemplo ou adicionar mais funcionalidades de pagamento.
