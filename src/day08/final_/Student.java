package day08.final_;

public class Student {

    String name;
    final String ssn; // 주민번호
    static final String nation = "대한민국"; // 국적

    Student(final String ssn) {
//        ssn = "dfjkdsfjds";
        final int a = 10;
//        a = 20;
        this.ssn = ssn;
        double pi = Math.PI;
    }

    public String getSsn() {
        return ssn;
    }

//        public void setSsn(String ssn) {
//        this.ssn = ssn;
//    }
}
