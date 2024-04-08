package day02;

import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("우리반 학생들의 별명:[영웅재중,믹키유천,최강창민,유노윤호,시아준수]");
        System.out.println("-삭제할 학생의 별명을 입력하세요!");

        while (true) {
            String deleteName = scanner.nextLine();
            if(!deleteName.equals("영웅재중,믹키유천,최강창민,유노윤호,시아준수")){
                System.out.println("해당 별명("+deleteName+")은 존재하지않습니다.");
                continue;
            }
        }
    }
}
