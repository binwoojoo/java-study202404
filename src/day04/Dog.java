package day04;

public class Dog {

    // 필드: 객체의 속성
    String dogName;
    int age;
    boolean injection; // 예방접종 유무


    void petInfo() {
        System.out.printf("우리집 강아지는 %s에요ㅋㅋ %d살이에요ㅋㅋ\n", dogName, age);
        if (injection) {
            System.out.println("예방접종을 했어요");
        } else {
            System.out.println("아직 예방접종을 못했어요");
        }
    }

    Dog() {
        System.out.println("1번 생성자 호출");
    }

    void inject() {
        System.out.printf("%s 강아지에게 주사를 맞혀요!\n", dogName);
        injection = true;

    }

    // 생성자
    Dog(String dName) {
        dogName = dName;
        age = 1;
    }
}
