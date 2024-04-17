package day07.quiz;

public class Product {
    private String name;
    private int price;
    private int stock;
    private int reduceStock;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int reduceStock) {
        if (reduceStock > this.stock) {
            System.out.println("상품 재고가 부족합니다.");
            return;
        } else {
            this.stock -= reduceStock;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }
}
