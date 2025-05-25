package com.djs.b_cashregister;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private long id;
    private LocalDateTime date;
    private boolean paid;
    private List<Article> articles = new ArrayList<>();

    private Order() {
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public static Builder builder(long id) {
        return new Builder(id);
    }

    static class Builder{

        private long id;
        private LocalDateTime date;
        private boolean paid;
        private List<Article> articles = new ArrayList<>();

        public Builder( long id){
            this.id = id;
            this.date = LocalDateTime.now();
        }

        public Builder withArticles(Article article, int nof) {

            for(int i = 0; i < nof; i++) {
                articles.add(article);
            }
            return this;
        }

        public Order build(){
            Order order = new Order();
            order.id = this.id;
            order.date = this.date;
            order.paid = this.paid;
            order.articles = this.articles;
            return order;
        }
    }
}
