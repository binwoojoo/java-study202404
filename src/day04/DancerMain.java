package day04;

// 실행용 클래스: 객체를 생성해서 객체의 기능을 실행시키는 곳
// --> main이 필요
public class DancerMain {
    public static void main(String[] args) {

        // 설계도(클래스)를 통해 객체를 찍어냄(생성)
        Dancer kim = new Dancer();

        // 객체의 속성 부여
        kim.dancerName = "김두한";
        kim.crewName = "종로의 오야붕";
        kim.genre = "각기";
        kim.danceLevel = 2;

        kim.introduce();
        kim.dance();

        // 두번쨰 댄서
        Dancer lee = new Dancer();

        lee.dancerName = "왕초";
        lee.crewName = "거지왕";
        lee.genre = "뽕짝";
        lee.danceLevel = 1;

        lee.introduce();
        lee.dance();

        Dancer hong = new Dancer();
        hong.dance();

        Dancer choi = new Dancer("나미꼬");

        choi.dance();
        choi.introduce();

        Dancer park = new Dancer("털바퀴", "캣맘즈");

        park.dance();
        park.introduce();

        Dancer rock = new Dancer("메롱","미친놈들","락킹");

        rock.introduce();
    }
}
