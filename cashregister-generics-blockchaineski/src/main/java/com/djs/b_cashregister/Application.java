package com.djs.b_cashregister;

public class Application {

    public static void main(String[] args) {

        Order order = Order.builder(1234567)
            .withArticles( Article.builder(10001)
                    .withEan("1234567890123")
                    .withName("Bread")
                    .withPrice(1.99)
                    .withDescription("A loaf of bread")
                    .build(), 2)
            .withArticles( Article.builder(10003)
                    .withEan("1234567897429")
                    .withName("Potatoes")
                    .withPrice(3.99)
                    .withDescription("Potatoes, 2 kg")
                    .build(), 2)
            .withArticles( Article.builder(10002)
                    .withEan("1234567890567")
                    .withName("Milk")
                    .withPrice(1.23)
                    .withDescription("Milk 1 ltr")
                    .build(), 4)
            .withArticles( Article.builder(10001)
                    .withEan("1234567890123")
                    .withName("Bread")
                    .withPrice(1.99)
                    .withDescription("A loaf of bread")
                    .build(), 1)
            .build();

        double cash = 20.00;
        double change = CashRegister.checkout( order, cash);
        order.setPaid(true);
        System.out.println("Cash: " + cash);
        System.out.println("Change: " + change);
    }
}
