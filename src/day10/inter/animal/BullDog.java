package day10.inter.animal;

public class BullDog implements Pet, Aggresive{  // 인터페이스는 여러개 상속 가능 extands는 불가능

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void hunt(Pet pet) {

    }

    @Override
    public void violent() {

    }

    // 사냥 기능

    // 난폭함

    // 애완동물로 키우기 가능

}
