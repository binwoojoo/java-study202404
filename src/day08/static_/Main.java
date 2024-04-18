package day08.static_;

import static day08.static_.Count.*;
import static java.lang.Math.random;
import static java.lang.System.*;
import static util.SimpleInput.input;

public class Main {
    public static void main(String[] args) {

        // static 데이터는 객체 생성 없이 접근 가능
        x = 20;
        m1();

        Count c1 = new Count();
        Count c2 = new Count();
        c1.m2();
        c2.m2();

        c1.y = 10;
        c2.y = 20;

        x = 99;
        x = 50;

        out.println("c1.x = " + x);
        out.println("c2.x = " + x);
        out.println("=================================================");
        out.println("c1.y = " + c1.y);
        out.println("c2.y = " + c2.y);


        Calculator redCal = new Calculator();
        Calculator blueCal = new Calculator();


        double v = Calculator.calcArea(6);
        out.println("v = " + v);
//        blueCal.calcArea(5);

        redCal.paint("red");
        blueCal.paint("blue");

//        String name = input("이름 ");

        Double d = random();

        out.println(d);

        m1();
        out.println("========================================");

        out.println(Person.nation);

        Person choi = new Person("최익현", 55);

        out.println(choi.name);
        out.println(choi.age);
//        out.println(choi.nation);


    }
}
