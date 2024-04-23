package day11.collection.map;

import day09.poly.car.Mustang;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        // 데이터 추가: put();
        map.put("지갑 잔액", 500);
        map.put("좋아하는 자동차", new Mustang());
        map.put("좋아하는 음식", "새콤달콤");
        System.out.println(map);

        System.out.println(map.size());

        // get(key)
        int o = (int) map.get("지갑 잔액");
        System.out.println(o);

        // 중복된 키를 저장하면 값이 수정된다.
        map.put("지갑 잔액", 999900);
        System.out.println(map);

        // map의 반복문 처리
        for (String key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
        }

    }
}
