package day07.modi.pac1;

import day04.Dancer;
import day07.modi.pac2.C;

class B {

    public int z1;
    int z2;
    private int z3;

    void test() {

        A a1 = new A(50);
        A a2 = new A(5.5);
//        new A(false);  // private

        a1.f1 = 20;
        a2.f2 = 50;
//        a3.f3 = 88;   // private

        a1.m1();
        a1.m2();
//        a1.m3();      // private

        C c = new C();
        c.y1 = 10;
//        c.y2 = 10;
//        c.y3 = 10;

        Dancer dancer = new Dancer();
        dancer.dance();

    }

}
