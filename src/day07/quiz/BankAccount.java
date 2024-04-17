package day07.quiz;

public class BankAccount {

    private String accountNumber;
    private String accountName;
    private int accountMoney;


    BankAccount(String inputAccountNumber, String inputName, int inputAccountMoney) {
        this.accountNumber = inputAccountNumber;
        this.accountName = inputName;
        this.accountMoney = inputAccountMoney;
    }

    public int getBalance() {
        return this.accountMoney;
    }

    public void deposit(int money) {
        if (money < 0) {
            System.out.println("입금액은 음수일 수 없습니다.");
            return;
        }
        this.accountMoney += money;
    }

    public void withdraw(int money) {
        if (money < 0 || money > this.accountMoney) {
            System.out.println("잔액이 부족하거나 잘못된 출금액입니다.");
        }
        this.accountMoney -= money;
    }

}




