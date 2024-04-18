package day09.poly;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class basic {

    void test() {

        // 다형성: 객체가 여러 타입을 사용할 수 있다.
        // -부모의 타입을 사용 가능
        Object x1 = new A();
        A x2 = new B();
        A x3 = new C();

        A x4 = new D();
        A x5 = new E();

        int a = 10;
        double b = a; // 캐스팅

        C c = new C();
        A d = (A) c;  // 캐스팅

    }

}
