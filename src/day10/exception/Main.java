package day10.exception;

public class Main {
    public static void main(String[] args) throws Exception {
//
//        ThrowsExample te = new ThrowsExample();
//
//
////        int n = te.inputNumber();
////        System.out.println("n = " + n);
//
//        try {
//            int n = te.convert("100!!!");
//            System.out.println("n = " + n * 200);
//        } catch (NumberFormatException e) {
//            System.out.println("ㅈ버그: 정수형태만 변환 가능하다~!");
//        }

        LoginUser loginUser = new LoginUser("abc1234", "1234");

        try {
            loginUser.loginValidate("abc1234", "1234");
        } catch (InvalidLoginInputException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // 에러 로그 출력
        }

    }
}
