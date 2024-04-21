package day10.abs;

public class Dog extends Pet {

    public Dog() {
    }

    public Dog(String name, int age, String kind) {
        super(name, age, kind);
    }

    @Override
    public void eat() {
        System.out.println("강아지가 사료 묵어요");
    }

    @Override
    public void sleep() {
        System.out.println("강아지는 낮잠을 자요");
    }

}
