package day08.static_;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void sellProduct() {
        Store.addSale(this.price);
    }
}
