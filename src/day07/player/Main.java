package day07.player;

//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Warrior w = new Warrior("김삿갓");
        Mage m = new Mage("홍두깨");
        Hunter h = new Hunter("망나니");

        Warrior bitch = new Warrior("빗치");
        Warrior bitch2 = new Warrior("빗치2");
        Mage[] z = new Mage[2];
        z[0] = new Mage("이상혁");
        z[1] = new Mage("정지훈");

        w.showStatus();
        m.showStatus();
        h.showStatus();
        w.Dash(bitch);
        w.Dash(bitch2);
        m.thunderBolt(z);


    }
}
