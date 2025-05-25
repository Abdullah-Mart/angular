package com.djs.b_cashregister;

public class Article {

    private long id;
    private String ean;
    private String name;
    private double price;
    private String description;

    private Article() {
    }

    public String getEan() {
        return ean;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", ean='" + ean + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public static Builder builder( long id){
        return new Builder(id);
    }

    static class Builder{

        private long id;
        private String ean;
        private String name;
        private double price;
        private String description;

        public Builder(long id) {
            this.id = id;
        }

        public Builder withEan(String ean) {
            this.ean = ean;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Article build(){

            Article article = new Article();
            article.id = this.id;
            article.ean = this.ean;
            article.name = this.name;
            article.price = this.price;
            article.description = this.description;
            return article;
        }
    }
}
