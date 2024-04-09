package day03;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static void push(String newfoods) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newfoods;
        foods = temp;
        System.out.println(Arrays.toString(foods));
    }

    static int indexOf(String food) {
        int i = -1;
        for (int j = 0; j < foods.length; j++) {
            if (food.equals(foods[j])) {
                i = j;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        int index = indexOf("치킨");

    }
}
