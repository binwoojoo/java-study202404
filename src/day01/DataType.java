package day01;

public class DataType {
    public static void main(String[] args) {
        // 1m = 1024btye
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483648634634L; // 정수형 기본 타입이 int 이기 때문에 뒤에 L을 붙여 long으로 표현.
        System.out.println(d);

        float e = 3.141242142141F; // 4btye
        double f = 3.134737354; // 8btye
        double g = 100;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        boolean flag1 = false;
        boolean flag2 = 10 > 5;

        int i = 100;  // ctrl + alt + v 하면 자동으로 변수에 담아줌
        double v = 5.5;
        String dddd = "ㅇㅇ";
        boolean b1 = a > b;
        System.out.println(flag1);
        double random = Math.random();


        int x = 200;
        System.out.println(x + a);
        System.out.println(b * x);
    }
}
