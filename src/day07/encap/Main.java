package day07.encap;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("구아방");

//        myCar.model = "페라리";

        myCar.startStop();
//        myCar.start = false;

        // 속도 0~200km 사이로 제한
        myCar.setSpeed(99);

        System.out.println("현재속도: " + myCar.getSpeed() + "km/h");

        // 변속 모드
        myCar.setMode('P');

        System.out.println(myCar.getMode());

//        myCar.injectGasoline();
//        myCar.moveEngineOil();
//        myCar.moveCylinder();

    }
}
