package day08.static_;

public class Store {

    static int totalSales;

    static void addSale(int price) {
        totalSales += price;
    }

    public static int getTotalSales() {
        return Store.totalSales;
    }
}
