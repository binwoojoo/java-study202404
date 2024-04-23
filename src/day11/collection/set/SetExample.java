package day11.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        // 중복 저장 허용 X, 순서가 없음, 비교적 빠른 저장속도
        Set<String> set = new HashSet<>();
        boolean flag1 = set.add("김말이");
        set.add("닭꼬치");
        set.add("김밥");
        set.add("순대");
        boolean flag2 = set.add("김말이");
        System.out.println(set);
        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);
        System.out.println(set.size());

        // 탐색시에는 개별 탐색은 불가
        for (String s : set) {
            System.out.println(s);
        }

        set.remove("순대");
        System.out.println(set);

        // set은 보통 데이터 중복을 빠르게 제거할 때 사용
        List<Integer> numbers = List.of(3, 3, 3, 3, 1, 1, 41, 5, 5, 5, 6);

        // set으로 변환
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);

        // list로 다시 변환
        numbers = new ArrayList<>(numberSet);
        System.out.println("numbers = " + numbers);
    }
}
