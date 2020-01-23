package Decorator;

public class DecoratorTutorial {
}

interface Product {
    int getPrice();
}

class Milk implements Product {
    private final int price;

    Milk(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

abstract class Decorator implements Product {
    final Product product;

    protected Decorator(Product product) {
        this.product = product;
    }
}

class MilkDiscount extends Decorator {

    protected MilkDiscount(Product product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return this.product.getPrice() - 10;
    }
}

class Shop {
    public static void main(String[] args) {
        Decorator decorator = new MilkDiscount(new Milk(1000));
    }
}