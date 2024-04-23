package day10.exception;

public class LoginUser {

    private String account; // 가입 시도 계정명
    private String password; // 가입 시도 패스워드

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    private enum LoginStatus {
        SUCCESS, ID_FAIL, PW_FAIL
    }

    // 로그인 검증 로직
    public LoginStatus loginValidate(String inputAccount, String inputPassword) throws InvalidLoginInputException {

        // 아이디가 일치하는가!?
        if (!inputAccount.equals(account)) {
            throw new InvalidLoginInputException("계정이 일치하지 않습니다");
        }

        // 비번이 일치하는가!?
        if (!inputPassword.equals(password)) {
            throw new InvalidLoginInputException("비번이 일치하지 않습니다");
        }

        System.out.println("로그인 성공");
        return LoginStatus.SUCCESS;
    }

}