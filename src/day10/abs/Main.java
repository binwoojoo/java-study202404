package day10.abs;

public class Main {
    public static void main(String[] args) {

//        new Pet();

        Pet myDog = new Dog();
        Dog myDog2 = new Dog();
        Dog myDog3 = new Dog();
        Cat myCat = new Cat();
        Cat myCat2 = new Cat();
        Cat myCat3 = new Cat();
        GoldFish goldFish = new GoldFish();

        Pet[] petList = {myDog,myDog2,myCat,myCat2,goldFish};

        for (Pet pet : petList) {
            pet.eat();
        }

        myDog.walk();

    }
}
