package day07.player;

import java.util.Arrays;

public class Mage extends Player {


    int mana;

    public Mage(String nickname) {
        super(nickname);
        this.mana = 100;
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# mana: " + this.mana);
    }

    public void thunderBolt(Player... target) {
        System.out.println("thunderBolt 스킬을 사용합니다.");

        for (Player player : target) {
            // 내가 맞으면
            if (player == this) {
                continue;
            }
            // 10~15의 랜덤 피해
            int damage = (int) (Math.random() * 6 + 10);
            // 실제 체력에서 차감
            player.hp -= damage;
            System.out.println(player.nickname + "은 개쳐맞았습니다.\n남은 체력: " + player.hp);
        }
    }
}
