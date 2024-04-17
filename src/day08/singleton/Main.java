package day08.singleton;

public class Main {
    public static void main(String[] args) {

        Mypet mypet1 = Mypet.getInstance();
        Mypet mypet2 = Mypet.getInstance();
        Mypet mypet3 = Mypet.getInstance();

        System.out.println("mypet1 = " + mypet1);
        System.out.println("mypet2 = " + mypet2);
        System.out.println("mypet3 = " + mypet3);

        mypet1.setName("바둑");
        mypet1.introduce();
        mypet2.introduce();
        mypet3.introduce();
    }
}
