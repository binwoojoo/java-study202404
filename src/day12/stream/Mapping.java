package day12.stream;

import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.*;

// map: 리스트에서 원하는 데이타만 추출
public class Mapping {

    public static void main(String[] args) {

        // 요리 이름만 추출
        List<String> nameList = menuList.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());
        System.out.println(nameList);

        System.out.println("===================================");

        // 단어의 글자 수 추출 스트링 배열에서 인티저 배열로 바뀜
        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );

        List<Integer> collected = words.stream()
                .map(w -> w.length())
                .collect(Collectors.toList());
        System.out.println(collected);

        System.out.println("===================================");

        List<Character> characterList = words.stream()
                .map(w -> w.charAt(0)) // 문자열에서 해당 위치 글자 추출
                .collect(Collectors.toList());
        System.out.println(characterList);

        System.out.println("===================================");

        // 메뉴 목록에서 메뉴 이름과 칼로리를 추출해서
        // 새로운 객체에 포장하고 싶음
        // 새로운 클래스를 만들어서 객체 생성ㅋㅋ
//        List<simpleDish> simpleDishList = menuList.stream()
//                .map(dish -> new simpleDish(dish.getName(), dish.getCalories()))
//                .collect(Collectors.toList());

        List<simpleDish> simpleDishList = menuList.stream()
                .map(dish -> new simpleDish(dish))
                .collect(Collectors.toList());
        System.out.println("simpleDishList = " + simpleDishList);

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.

            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */
        System.out.println("====================================");

        List<DishDetail> dishDetailList = menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> new DishDetail(dish))
                .collect(Collectors.toList());
        System.out.println(dishDetailList);

        System.out.println("====================================");

        // 메뉴 목록에 있는 요리들의 총 칼로리 수 구하기
        int sum = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .sum();
        System.out.println("sum = " + sum);

        // 육류 메뉴의 평균 칼로리
        double averageCalories = menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .mapToInt(dish -> dish.getCalories())
                .average()
                .getAsDouble();
        System.out.println("averageCalories = " + averageCalories);
    }
}
