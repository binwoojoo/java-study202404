package day03;

public class MethodBasic {

    // 자바의 함수는 반드시 클래스 블록 내부, 다른 메서드 외부에 만들어야 함

    // 두개의 정수를 전달받아 합을 리턴하는 함수
    static int add(int n1, int n2) {
        return n1 + n2; // 함수의 이름은 리턴되는 값의 종류로 지정
    }

    static void multiply(int n1, int n2) { // 리턴이 없으면 void로 입력
        if (n1 > 100) return;
        System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
    }

    // n개의 정수를 전달받아 그 총합을 반환하는 함수
    static int total(int... numbers) {  // 업케스팅은 자동으로 해준다
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 2개의 정수를 전달받아 사칙연산의 결과를 모두 리턴
    static int[] operate(int n1, int n2) {
        int plus = add(n1, n2);
        int minus = n1 - n2;
        return new int[]{add(n1, n2), n1 - n2, n1 * n2, n1 / n2};
    }

    public static void main(String[] args) {
        // 함수를 호출할 때는 함수 안에서만 가능
        int r1 = add(10, 20);
        System.out.println(r1);

        // void 함수는 함수의 결과를 변수에 담을 수 없음
        // 반드시 단독 호출해서 사용
        multiply(5, 3);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int r2 = total(arr);
        int r3 = total(new int[]{3, 4, 5, 6, 8});
//        int r4 = total(...numbers:10, 20, 30, 40);
        System.out.println("r2 = " + r3);

        int[] operateResult = operate(20,10);
        System.out.println(operateResult[1]);

    }// end main method

    // 자바의 함수는 반드시 클래스 블록 내부, 다른 메서드 외부에 만들어야 함

}// end class
