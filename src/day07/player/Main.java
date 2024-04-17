package day07.player;

public class Main {
    public static void main(String[] args) {

        Warrior w = new Warrior("김삿갓");
        Mage m = new Mage("홍두깨");
        Hunter h = new Hunter("망나니");

        w.showStatus();
        m.showStatus();
        h.showStatus();
    }
}
