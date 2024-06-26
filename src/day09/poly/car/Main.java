package day09.poly.car;

public class Main {
    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

//        Car[] sArr = {sonata1, sonata2, sonata3};
//
//        for (Car sonata : sArr) {
//            sonata.accelerate();
//        }

        Car tusan1 = new Tusan();
        Car tusan2 = new Tusan();

        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        // 다형성을 통해 이종 모음 배열을 구현할 수 있음
        Car[] cArr = {sonata1, tusan2, mustang1};
        for (Car car : cArr) {
            car.accelerate();
        }

        Object[] sArr = {"a", "b", 1, 2}; // 오브젝트배열...데이터타입 상관없음

        System.out.println("===========================================");

        Drive drive = new Drive();

        drive.drive(sonata3);
        drive.drive(new Mustang());

        Sonata mySonata = new Sonata();

        mySonata.accelerate();
        mySonata.joinSonataClub();

        Car[] cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("==========================================");

        CarShop shop = new CarShop();

        // 객체타입에서 다운캐스팅의 전제조건: 반드시 상속관계가 있어야 하며
        // 자식객체가 부모타입으로 업캐스팅 된 것만 내릴 수 있음
        // 즉, 부모객체를 자식타입으로 내릴 수는 없다.
        Sonata car = (Sonata) shop.exportCar(3000);
        car.accelerate();
        car.joinSonataClub(); // 소나타 동호회 가입이 안됨...Car 타입으로 리턴받았기떄문

        System.out.println("==========================================");

//        Sonata ccc = (Sonata) new Car(); // 즉, 부모객체를 자식타입으로 내릴 수는 없다.

//        Mustang mmm = (Sonata) new Mustang(); // 형제는 상속이 아니다^^

        Car ttt = new Tusan();
        Tusan tts = (Tusan) ttt;
    }
}
