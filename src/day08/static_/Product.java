package day08.static_;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void sellProduct() {
        Store.addSale(price);
//        Store.totalSales += this.price;
    }
}
