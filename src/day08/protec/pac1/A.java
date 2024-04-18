package day08.protec.pac1;

public class A {

    protected int f1;
    int f2;

    protected void m1() {

    }

    void m2() {

    }

    public A() {
    }

    protected A(int a) {
    }

    A(double b) {

    }

    void test() {
        f1 = 1;
        f2 = 2;
        new A();
        new A(1);
        new A(3.2);
        m2();
    }
}
