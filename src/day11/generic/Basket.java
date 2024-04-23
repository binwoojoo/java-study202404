package day11.generic;

// 제네릭 클래스: 타입 복제가 가능한 클래스
public class Basket<f>{

    private f fruit;

    public f getFruit() {
        return fruit;
    }

    public void setFruit(f fruit) {
        this.fruit = fruit;
    }
}
