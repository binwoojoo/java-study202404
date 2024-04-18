package day08.enum_;

public class Pizza {

    private String pizzaName;
    private PizzaStatus status; // 주문 중, 조리중, 배달중

    // 피자 주문 기능
    public void orderPizza() {
        this.status = PizzaStatus.Ordered;
        System.out.println("피자 주문 들어와씃빈다.");
    }

    // 피자 준비 완료 기능
    public void readtPizza() {
        if (this.status == PizzaStatus.Ordered) {
            this.status = PizzaStatus.Ready;
            System.out.println("피자가 준비됐습니다.");
        } else {
            System.out.println("주문이 없습니다.");
        }
    }

    // 피자 배달 기능
    public void deliverPizza() {
        if (this.status == PizzaStatus.Ready) {
            this.status = PizzaStatus.Delivered;
            System.out.println("피자가 배달되었습니다.");
        } else {
            System.out.println("아직 조리 중입니다.");
        }
    }

    public PizzaStatus getStatus() {
        return status;
    }
}
