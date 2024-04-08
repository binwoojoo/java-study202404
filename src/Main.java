//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        System.out.println(123 + 4);
        System.out.println("무적권");

        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        System.out.println("Hello and welcome!ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");


        int month = 5;
        int day = 5;
        String anni = "어린이날";
        System.out.println(month + "월은 " + day + "일은 " + anni + "입니다.");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);

        int x = 10, y = 20;
        // & 단축 평가 실행 x  && 단축 평가 실행 o
        System.out.println(x > 10 && (y / 0 == 10)); //false
        System.out.println(x > 10 || y < 30); //true
    }
}
