package day02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] pets = {"멍멍이", "털바퀴", "비둘기"};
//        String[] petsCopy = pets; // 배열 복사가 아니라 배열 주소 복사

        String[] petsCopy = new String[pets.length]; // 길이가 같은 새 배열을 다시 만들어준다
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }

        pets[1] = "단또"; // 복사 후 원본 수정

        System.out.println("pets = " + Arrays.toString(pets));
        System.out.println("petsCopy = " + Arrays.toString(petsCopy));
    }
}
