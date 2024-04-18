package day08.enum_;

// enum: 열거형 - 상수를 모아 놓은 클래스

public enum PizzaStatus {

    Ordered("주문완료!!", 5),
    Ready("준비완료!!!", 20),
    Delivered("배달완료ㅎ", 30);

    private String description;
    private int timeToSetUp;

    PizzaStatus(String description, int timeToSetUp) {
        this.description = description;
        this.timeToSetUp = timeToSetUp;
    }

    public String getDescription() {
        return description;
    }

    public int getTimeToSetUp() {
        return timeToSetUp;
    }
}
