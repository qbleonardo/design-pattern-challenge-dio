package strategy.discount;

import java.util.Scanner;

public class ExecuteStrategyDiscount {

    public static void executeImpl(){
        Scanner scanner = new Scanner(System.in);

        // Criando instâncias das estratégias de desconto
        DiscountStrategy tenPercentDiscount = new TenPercentDiscount();
        DiscountStrategy freeShipping = new FreeShipping();

        // Criando o carrinho de compras
        ShoppingCart cart = new ShoppingCart();

        // Adicionando produtos ao carrinho
        String productName = scanner.nextLine();
        double productPrice = scanner.nextDouble();
        cart.addProduct(productPrice);

        // Escolhendo a estratégia de desconto
        int strategyChoice = scanner.nextInt();

        // Configurando a estratégia no carrinho
        switch (strategyChoice) {
            case 1:
                cart.setDiscountStrategy(tenPercentDiscount);
                break;
            case 2:
                cart.setDiscountStrategy(freeShipping);
                break;
            default:
                System.out.println("Escolha invalida. Nenhum desconto aplicado.");
        }
        double totalCompra = cart.calculateTotal(productPrice);
        System.out.println("Total da compra: R$" + totalCompra);
    }
}
