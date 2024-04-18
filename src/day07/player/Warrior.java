package day07.player;

// 하위 클래스 (sub class)
//: 상위 클래스로부터 공통 필드와 메서드를 내려받은 클래스
public class Warrior extends Player {

    int rage;

    public Warrior(String nickname) {
        super(nickname);
        this.rage = 100;
    }

    public void Dash(Warrior target) {
        System.out.println("Dash 스킬을 사용합니다.");
        System.out.println(target.nickname + "은 개쳐맞았습니다.");
    }

    // 오버라이딩: 부모가 물려준 메서드를 고쳐 쓰는 것
    // 규칙: 부모가 물려준 형태를 유지할 것(파라미터, 리턴타입, 이름)
    //  접근 제한자는 부모보다 more public 할 것!

    @Override // 오버라이딩 룰을 지켰는지 검증
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage: " + this.rage);
    }

}
