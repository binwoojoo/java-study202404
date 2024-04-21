package day10.inter.animal;

import day08.protec.pac1.A;

public class Rabbit extends Animal implements Pet, Wild {  // 인터페이스는 여러개 상속 가능 extands는 불가능

    public Rabbit() {
        this.age = 10;
    }

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void violent() {

    }

    // 사냥 기능 없음

    // 난폭한 성격

    // 애완동물로 키우기 가능

}
