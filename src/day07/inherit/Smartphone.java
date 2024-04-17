package day07.inherit;

public class Smartphone extends ElectronicProduct {

    int gb;

    public Smartphone(String name, int price, String manufacturer, int gb) {
        this.productName = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.gb = gb;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("저장 용량: " + this.gb + " GB");
    }
}
