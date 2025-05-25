package com.djs.b_cashregister;

public class CashRegister {

    public static double checkout(Order order, double cash) {

        double total = 0;

        for(Article article : order.getArticles()) {
            total += article.getPrice();
            System.out.println(article);
        }

        return cash - total;
    }
}
