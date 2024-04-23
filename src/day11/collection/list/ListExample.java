package day11.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> foods = new ArrayList<>();

        foods.add("짜장면");
        foods.add("냉면");
        foods.add("보신탕");

        System.out.println(foods);

        // 중간 삽입 add(index, E)
        foods.add(1, "짬뽕");
        System.out.println(foods);

        int size = foods.size();
        System.out.println("size = " + size);

        int index = foods.indexOf("보신탕");
        System.out.println("index = " + index);

        boolean flag = foods.contains("짬뽕");
        System.out.println("flag = " + flag);

        foods.remove(0);
        foods.remove("보신탕");
        System.out.println(foods);

        foods.set(0, "만두");
        System.out.println(foods);

        String s = foods.get(0);
        System.out.println("s = " + s);

        // 반복문 처리
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }
        System.out.println("=======================================");

        for (String food : foods) {
            System.out.println(food + " 좃노맛");
        }

        foods.clear();
        System.out.println(foods);

        System.out.println(foods.isEmpty());

        // 리스트에 초기값 넣고 시작하기
        List<Integer> nums = new ArrayList<>(List.of(99, 55, 10, 20, 30));
        int[] arr = {2, 4, 6};
//        List<Integer> nums2 = new ArrayList<>();
        System.out.println(nums);

        // 오름차 정렬
        nums.sort(Integer::compareTo);
        System.out.println(nums);

        // 내림차 정렬
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);
    }

}
