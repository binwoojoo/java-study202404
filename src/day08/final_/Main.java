package day08.final_;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("991111-1111222");
        Student s2 = new Student("881222-2222111");
        s1.name = "홍길동";
//        s.nation = "대한민국";
        s1.name = "피터 홍";
//        s.nation = "캐나다";
//        System.out.println(s2.ssn);
//        s.ssn = "zz";
//        s2.ssn = "dfsd";
        System.out.println(s1.getSsn());
    }
}