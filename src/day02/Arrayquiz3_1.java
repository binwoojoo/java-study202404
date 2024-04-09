package day02;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayquiz3_1 {
    public static void main(String[] args) {
        System.out.println("* 변경 전 정보: [영웅재중,최강창민,시아준수,믹키유천,유노윤호]");
        while (true) {
            System.out.println("-수정할 멤버의 이름을 입력하세요.");
            System.out.print(">> ");
            Scanner scanner = new Scanner(System.in);
            String userInputName = scanner.nextLine();
            String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
            int index = -1;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(userInputName)) {
                    index = i;
                    String deleteName = students[i];
                    System.out.println(students[i] + "의 이름을 변경합니다.");
                    System.out.print(">> ");
                    String newName = scanner.nextLine();
                    students[i] = newName;
                    System.out.println("* 변경 후 정보" + Arrays.toString(students));
                    break;
                }
            }
            if (index == -1) {
                System.out.println(userInputName + "은 존재하지않는 이름입니다.");
            }
        }

    }
}
