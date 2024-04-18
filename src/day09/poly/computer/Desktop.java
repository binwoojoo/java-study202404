package day09.poly.computer;

public class Desktop {

    // 다형성은 객체의 교환성을 높혀주며
    // 객체가 특정 부품 객체에 종속되지(의존하지않게) 않도록 도와준다

    Monitor monitor;

    public Desktop(Monitor monitor) {
        this.monitor = monitor;
    }

    // 모니터를 바꾸는 메서드
    public void changeMonitor(Monitor monitor) {

        this.monitor = monitor;

    }

}
