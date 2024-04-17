package day07.player;

public class Mage extends Player {


    int mana;

    public Mage(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.mana = 100;
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# mana: " + this.mana);
    }

    public void thunderBolt(Mage... target) {
        System.out.println("thunderBolt 스킬을 사용합니다.");
        System.out.println(target[0].nickname+"은 개쳐맞았습니다.");
        System.out.println(target[1].nickname+"은 피했습니다.");
    }
}
