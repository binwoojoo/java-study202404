package day07.player;

public class Hunter extends Player {

    int concentration;

    public Hunter(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 80;
        this.concentration = 10;
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# concentration: " + this.concentration);
    }

    public void multipleArrow(Hunter... target) {
        System.out.println("multipleArrow 스킬을 사용합니다.");
    }
}
