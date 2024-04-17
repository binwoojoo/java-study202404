package day07.inherit;

public class Television extends ElectronicProduct {

    int screenSize;

    public Television(String name, int price, String manufacturer, int screenSize) {
        this.productName = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("screen Size: " + this.screenSize + " inches");
    }
}
