package day07.player;

public class Mage extends Player{


    int mana;

    public Mage(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.mana = 100;
    }

    public void thunderBolt(Mage... target) {
        System.out.println("thunderBolt 스킬을 사용합니다.");
    }
}
