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

        HighMage d = new HighMage();
        d.showStatus();

        System.out.println("========================================");

        // 썬더볼트는 여러 플레이어를 대상으로 공격하는 스킬이다.
        // 1. 자기 자신이 대상이 되면 자기 자신은 피해를 입지 않는다.
        // 2. 타겟이 된 대상은 10~15의 랜덤 피해를 입고 실제로 체력이 감소한다.
        m.thunderBolt(w,m,new Mage("황근출"));

    }
}
