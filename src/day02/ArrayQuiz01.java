package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String[] foodList = new String[]{};
        String[] foodList = {}; // 생략 가능
        System.out.println("#먹고싶은 음식을 입력하세요");
        System.out.println("#입력을 중지하려면 <그만>을 입력하세요");

        while (true) {
            System.out.print(">> ");
            String newFood = scanner.nextLine();
            if (newFood.equals("그만")) {
                break;
            } else {
                String[] temp = new String[foodList.length + 1];
                for (int i = 0; i < foodList.length; i++) {
                    // 좌항: 영역, 우향: 값
                    temp[i] = foodList[i];
                }
                temp[temp.length - 1] = newFood;
                foodList = temp;
                temp = null;
            }
        }
        System.out.println("foodList = " + Arrays.toString(foodList));
    }
}
