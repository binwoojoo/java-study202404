package day08.static_;

//import static util.SimpleInput.sc;

public class Person {

    String name;
    int age;
    static String nation;

    // 정적 초기화자 (static initiializer)
    // static필드의 생성자같은 역할 (static필드 초기화 담당)
    static {
        nation = "대한민국";
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
//        this.nation = "대한민국";
    }

}
