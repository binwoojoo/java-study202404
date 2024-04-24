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
                .map(simpleDish::new)
                .collect(Collectors.toList());
        System.out.println("simpleDishList = " + simpleDishList);

    }
}
