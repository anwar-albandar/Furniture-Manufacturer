package com.furnitureapp.entity;

public class Product {

    private int productCode;
    private String name;
    private double price;
    private double size;
    private String description;

    private Product(Builder builder) {
        this.productCode = builder.productCode;
        this.name = builder.name;
        this.price = builder.price;
        this.size = builder.size;
        this.description = builder.description;

    }

    public int getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", description='" + description + '\'' +
                '}';
    }


    public static class Builder {
        private int productCode;
        private String name;
        private double price;
        private double size;
        private String description;

        public Builder setProductCode(int productCode) {
            this.productCode = productCode;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setSize(double size) {
            this.size = size;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Product product) {
            this.productCode = product.productCode;
            this.name = product.name;
            this.price = product.price;
            this.size = product.size;
            this.description = product.description;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }
}
