package strategy.discount;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> products = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public void addProduct(double price) {
        products.add(price);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(double total) {
        return discountStrategy.applyDiscount(total);
    }
}
