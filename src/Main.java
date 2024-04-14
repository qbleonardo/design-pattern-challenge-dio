import observer.ExecuteObserver;
import strategy.discount.ExecuteStrategyDiscount;

public class Main {
    public static void main(String[] args) {

        /* Testes para o desafio do Singleton
         ExecuteSingleton.executeImpl(); */

        /* Testes para o desafio da calculadora utilizando Strategy
        ExecuteOperationStrategy.executeImpl(); */

        /* Testes para o desafio do Observer
        ExecuteObserver.executeImpl(); */

        // Testes para o desafio do carrinho de compra utilizando Strategy
        ExecuteStrategyDiscount.executeImpl();

    }
}