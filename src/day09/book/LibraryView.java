package day09.book;

import static util.SimpleInput.*;

// 역할: 도서관리 프로그램에서 입출력을 담당하는 객체
public class LibraryView {

    private LibraryRepository repository;

    public LibraryView() {
        this.repository = new LibraryRepository();
    }

    // 회원 정보를 입력받는 기능
    public void makeNewBookUser() {
        System.out.println("\n# 회원 정보를 입력해주세요.");
        String name = input("# 이름: ");
        int age = 0;
        while (true) {
            try {
                age = Integer.parseInt(input("# 나이: "));
                break;
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요~^^");
            }
        }
        Gender gender = inputGender();

        // 입력된 데이터를 저장시켜야 함.
        repository.saveBookUser(new BookUser(name, age, gender, 0));
    }

    // 성별을 정확히 입력할때가지 무한히 입력받고
    // 정확히 입력하면 해당 성별 문자를 리턴
    private Gender inputGender() {
        while (true) {
            String gender = input("# 성별(M/F): ").toUpperCase();
            if (gender.startsWith("M")) return Gender.MALE;
            if (gender.startsWith("F")) return Gender.FEMALE;
            System.out.println("\n# 성별을 잘못 입력했습니다.");
        }
    }

    // 메뉴를 출력하는 기능
    public void showMainScreen() {
        System.out.println("\n============ 도서 메뉴 ==============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 5. 도서 반납하기");
        System.out.println("# 9. 프로그램 종료하기");
    }

    // 코드의 흐름을 캡슐화
    public void start() {
        makeNewBookUser();

        while (true) {
            showMainScreen();
            String menuNum = input("- 메뉴 번호 : ");

            switch (menuNum) {
                case "1":
                    displayUser();
                    break;
                case "2":
                    displayAllBooks();
                    break;
                case "3":
                    searchBookName();
                    break;
                case "4":
                    rentBook();
                    break;
                case "5":
                    refundBook();
                    break;
                case "9":
                    System.out.println("# 프로그램을 종료합니다!!");
                    return;
                default:
                    System.out.println("# 올바른 메뉴 번호를 입력하세요!");
            }
        }
    }


    // 회원 정보를 출력
    private void displayUser() {
        System.out.println("\n=============== 회원 정보 ================");
        BookUser user = repository.getUserInfo();
        System.out.println("# 이름: " + user.getName());
        System.out.println("# 나이: " + user.getAge());
        System.out.println("# 성별: " + user.getGenderToString());
        System.out.println("# 쿠폰갯수: " + user.getCouponCount());
    }

    // 전체 도서 정보를 출력
    private void displayAllBooks() {
        System.out.println("\n=============== 전체 도서 목록 ================");
        Book[] informationList = repository.getAllBooksInfo();

        for (int i = 0; i < informationList.length; i++) {
            Book book = informationList[i];
            System.out.printf("%d. %s\n", i + 1, book.info());
        }

    }

    private void refundBook() {
        System.out.println("\n=============== 대여한 도서 목록 ================");
        Book[] removeinformationList = repository.getAllremoveBooksInfo();
        int removebookNum = Integer.parseInt(input("- 반납할 책의 번호: "));
        for (int i = 0; i < removeinformationList.length; i++) {
            Book book = removeinformationList[i];
            System.out.printf("%d. %s\n", i + 1, book.info());
        }
    }

    // 책을 입력한 검색어로 찾기
    private void searchBookName() {
        String searchName = input("# 검색어: ");
        Book[] informationList = repository.getAllBooksInfo();
        System.out.printf("============ [%s] 검색 결과 ============\n", searchName);
        int i = -1;
        for (Book book : informationList) {
            if (book.getTitle().contains(searchName)) {
                System.out.println(book.info());
                i = 1;
            }
        }
        if (i == -1) {
            System.out.printf("[%s]을(를) 포함하는 검색 결과가 없습니다.\n", searchName);
        }
    }

    // 대여 가능한 도서 정보 찾기
    public void rentBook() {
        displayAllBooks();
        String bookNum = input("- 대여할 도서 번호 입력: ");
        // 저장소에다가 대여가능한지 여부 검증
        RentStatus status = null;
        try {
            status = repository.rentBook(bookNum);
        } catch (NullPointerException e) {
            return;
        }
        if (status == RentStatus.RENT_SUCCESS_WITH_COUPON) {
            System.out.println("# 쿠폰과 함께 대여 성공");

        } else if (status == RentStatus.RENT_SUCCESS) {
            System.out.println("# 대여 성공");
        } else {
            System.out.println("# 대여 실패");
        }
    }
}


