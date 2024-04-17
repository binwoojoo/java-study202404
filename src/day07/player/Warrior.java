package day07.player;

// 하위 클래스 (sub class)
//: 상위 클래스로부터 공통 필드와 메서드를 내려받은 클래스
public class Warrior extends Player{

    int rage;

    public Warrior(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 100;
        this.rage = 100;
    }

    public void Dash(Warrior target) {
        System.out.println("Dash 스킬을 사용합니다.");
    }
}
