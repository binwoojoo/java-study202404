package day08.static_;

public class Calculator {

    String color;  // 계산기의 색깔
    static double pi = 3.14;  //  계산기 안에 저장된 원주율

    // 원의 넓이를 구하는 메서드
    static double calcArea(double r) {
        return pi * r * r;
    }

    // 계산기에 색칠하는 메서드
    void paint(String color) {
        this.color = color;
    }
}
