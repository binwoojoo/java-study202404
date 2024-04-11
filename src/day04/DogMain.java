package day04;

public class DogMain {

    int x = 20;

    public static void main(String[] args) {


        int a = 10;
        Dog jjon = new Dog("쫀득");
        Dog bae = new Dog("형배");

        System.out.println("jjon = " + jjon);
        System.out.println("bae = " + bae);


        jjon.petInfo();
        System.out.println("==================================================");
        bae.inject();
        bae.petInfo();

    }
}
