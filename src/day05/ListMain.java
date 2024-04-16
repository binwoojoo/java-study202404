package day05;

public class ListMain {
    public static void main(String[] args) {

        StringList foods = new StringList();
        StringList userNames = new StringList();

        // 배열에 데이터 추가
        foods.push("짬뽕");
        foods.push("치킨");
        userNames.push("김철수");
        foods.push("갈치");
        foods.push("닭발");
        // 자료 삭제
        foods.remove(0); // 인덱스 번호로 지우기
        foods.remove("치킨"); // 값으로 지우기

        // 자료 중간 삽입
        userNames.push("신짱구");
        userNames.push("신형만");

        userNames.insert(1,"봉미선");
        foods.insert(1,"마라탕");

        // 배열 데이터 수정
        foods.set(2,"김치볶음밥");
        userNames.set(1,"최상길");

//         배열 데이터 전체삭제
        foods.clear();
        userNames.clear();

        // 배열 데이터가 한개라도 있는지 확인
        boolean flag = foods.isEmpty(); // 배열이 비어 있으면 true 아니면 false

        StringList xxx = new StringList("형배","쫀득","코알라");

        System.out.println(foods.sArr.length);
        System.out.println("foods = " + foods.toString());
        System.out.println("userNames = " + userNames.toString());
        System.out.println("xxx = " + xxx);

        // 배열 내부 데이터 수 확인
        System.out.println("foods = " + foods.size());
        System.out.println("flag = " + flag);

    }
}
