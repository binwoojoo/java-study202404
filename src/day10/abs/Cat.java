package day10.abs;

public class Cat extends Pet {

    public Cat() {
    }

    public Cat(String name, int age, String kind) {
        super(name, age, kind);
    }

    @Override
    public void eat() {
        System.out.println("고양이가 생선을 묵어요");
    }

    @Override
    public void sleep() {
        System.out.println("털바퀴는 낮잠을 많이 자요");
    }

}
