package day12.stream.quiz1;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        List<Transaction> transactionList2021 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(toList());
        System.out.println("transactionList2021 = " + transactionList2021);

        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
//         List<String>
        System.out.println("=======================================================");
        List<String> collectCity = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        System.out.println("collectCity = " + collectCity);

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        System.out.println("=======================================================");
        List<Trader> cambridge = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(toList());

        System.out.println("cambridge = " + cambridge);


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        // List<String>
        System.out.println("=======================================================");
        List<String> collectName = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()  // 정렬 기준이 없을 때
                .collect(toList());
        System.out.println("collectName = " + collectName);

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        System.out.println("=======================================================");
        boolean milan = transactions.stream()
                // equalsIgnoreCase 대소문자 상관없이 비교
                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Milan"));
        System.out.println("milan = " + milan);

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        System.out.println("=======================================================");
        int sum = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .mapToInt(transaction -> transaction.getValue())
                .sum();
        System.out.println("cambridgeValue = " + sum);

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        System.out.println("=======================================================");
        int max = transactions.stream()
                .map(transaction -> transaction.getValue())
                .mapToInt(Integer::intValue)
                .max().getAsInt();
        System.out.println("max = " + max);

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        System.out.println("=======================================================");
        int min = transactions.stream()
                .map(transaction -> transaction.getValue())
                .mapToInt(integer -> integer.intValue())
                .min().getAsInt();
        List<Transaction> minTrs = transactions.stream()
                .filter(transaction -> transaction.getValue() == min)
                .collect(toList());
        System.out.println("minTrs = " + minTrs);
        // 자바의 단점: null 체크 문법이 없음
        Transaction transactionMin = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .orElse(null); // 만약 결과가 null일 경우 어떻게 할거냐

        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
        System.out.println("=======================================================");
        List<Transaction> transactionList = transactions.stream()
                .filter(transaction -> transaction.getValue() >= 500)
                .collect(toList());
        System.out.println("transactionList = " + transactionList);

        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        System.out.println("=======================================================");
        Integer min2 = transactions.stream()
                .map(transaction -> transaction.getValue())
                .sorted()
                .collect(toList())
                .get(0);
        double average = transactions.stream()
                .filter(transaction -> transaction.getValue() > min2)
                .mapToInt(value -> value.getValue())
                .average().getAsDouble();
        System.out.println("average = " + average);

        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을 연도별로 그룹화하여 출력하시오.
        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */
        System.out.println("=======================================================");
//        Map<Integer, List<Transaction>> groupByYearMap = new HashMap<>();
//
//        List<Transaction> trs2021 = transactions.stream()
//                .filter(trs -> trs.getYear() == 2021)
//                .collect(toList());
//
//        List<Transaction> trs2022 = transactions.stream()
//                .filter(trs -> trs.getYear() == 2022)
//                .collect(toList());
//
//        groupByYearMap.put(2021, trs2021);
//        groupByYearMap.put(2022, trs2022);
//
//
//        System.out.println("=====================");
//        for (Integer year : groupByYearMap.keySet()) {
//            System.out.println("year = " + year);
//            for (Transaction transaction : groupByYearMap.get(year)) {
//                System.out.println(transaction);
//            }
//        }

        Map<Integer, List<Transaction>> cambridgeTrsMap = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                // year를 key로 만들어서 그룹핑 함
                .collect(Collectors.groupingBy(transaction -> transaction.getYear()));

        cambridgeTrsMap.forEach((key, value) -> {
            System.out.println("year = " + key);
            value.forEach(System.out::println);
        });

        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700
        System.out.println("=======================================================");
        System.out.println(max - min2);

    }

}
