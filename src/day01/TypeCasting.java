package day01;

public class TypeCasting {
    public static void main(String[] args) {

        byte a = 100; // 1byte
        int b = a;    // 4byte

        // 암묵적 형 변환
        System.out.println("b = " + b);


        int c = 1000; // 4byte
        // 명시적 형 변환
        byte d = (byte) c;   // 1byte
        System.out.println("d = " + d);

        // 암묵적 형 변환
        int k = 50;     // 4byte
        double j = k;   // 8byte
        System.out.println("j = " + j);

        double m = 5.567;
        int n = (int) m;
        System.out.println("n = " + n);

//      암묵적 형변환 -> upcasting (promotion)
//      명시적 형변환 -> downcasting
//      데이터 손실을 일으킬 수 있음.

        int v = 100;
        double z = 5.5;
        double result = v + z;

        float f1 = 3.14f;
        double f2 = 5.5;
        double v1 = f1-f2;
        // 데이터 타입이 다른 데이터의 연산은 작은 쪽을 큰 쪽으로 캐스팅한다.
        System.out.println("result = " + result);
        System.out.println("v1 = " + v1);
    }
}