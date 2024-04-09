package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("우리반 학생들의 별명:[영웅재중,믹키유천,최강창민,유노윤호,시아준수]");
        System.out.println("-삭제할 학생의 별명을 입력하세요!");
        System.out.print(">> ");
        String[] name = {"영웅재중", "믹키유천", "최강창민", "유노윤호", "시아준수"};
        String[] temp = new String[name.length - 1];
        boolean cheker = false;

        while (true) {
            String userInputName = scanner.nextLine();

            for (int i = 0; i < name.length; i++) {
                if (userInputName.equals(name[i])) {
                    String deleteName = name[i];
                    for (int j = i; j < name.length - 1; j++) {
                        name[j] = name[j + 1];
                    }
                    for (int x = 0; x < temp.length; x++) {
                        temp[x] = name[x];
                    }
                    name = temp;
                    temp = null;
                    System.out.printf("삭제된 별명은 %s입니다\n", deleteName);
                    System.out.printf("* 삭제 후 정보: " + Arrays.toString(name) + "\n");
                    cheker = true;
                    break;
                }
            }
            if (!cheker) {
                System.out.printf("해당 별명(%s)는 존재하지 않습니다\n", userInputName);
            }
            cheker = false;
        }
    }

}


