package day02;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {10, 50, 90, 100, 150};
        int newNumber = 66;
        int targetIndex = 2;

        // 50 과 90 사이에 66을 삽입!

        // 1. 사이즈가 1개 더 큰 배열 생성
        int[] temp = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        // 3. 삽입위치에서 데이터로 뒤로 1칸씩 이동
        //    이동 순서는 끝에서부터 시작해야함
        for (int x = arr.length; x > targetIndex; x--) {
            temp[x] = temp[x - 1];
        }
        // 4. 새로운 데이터를 타겟 인덱스자리에 복사
        temp[targetIndex] = newNumber;

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("temp: " + Arrays.toString(temp));

    }
}

