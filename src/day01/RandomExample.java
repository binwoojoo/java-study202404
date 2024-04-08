package day01;

public class RandomExample {
    public static void main(String[] args) {
        // 연산자 우선순위
        // 단항(++, --, !) > 2항(*, /, %...) > 3항(? :) > 대입(=)
        int a = 10;
        int b = ++a - 10 * 3;
        System.out.println("b = " + b);

        // 자바에서 난수만들기
        int random = (int) (Math.random() * 10) + 1;
        System.out.println("random = " + random);
    }
}
