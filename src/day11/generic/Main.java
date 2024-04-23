package day11.generic;

public class Main {
    public static void main(String[] args) {

//        AppleBasket ab = new AppleBasket();
//        ab.setApple(new Apple(10));
//
//        Apple apple = ab.getApple();
//
//        BananaBasket bb = new BananaBasket();
//        bb.setBanana(new Banana(15));
//
//        Banana banana = bb.getBanana();
//
//        Basket basket = new Basket();
//        basket.setFruit(new Apple(8));
//
//        Basket basket2 = new Basket();
//        basket.setFruit(new Banana(12));
//
//        Object fruit = basket.getFruit();

        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.setFruit(new Apple(4));
        Apple fruit = appleBasket.getFruit();

        Basket<Banana> bananaBasket = new Basket<>();
        bananaBasket.setFruit(new Banana(22));
        Banana fruit1 = bananaBasket.getFruit();


    }
}
