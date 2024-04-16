package day06.member;

// 역할: 회원 데이터 관리를 위해 입력 출력을 담당함

import util.SimpleInput;

public class MemberView {

    // 객체의 입력
    MemberRepository mr;
    SimpleInput si;

    MemberView() {
        this.mr = new MemberRepository();
        this.si = new SimpleInput();
    }

    // 모든 회원의 정보를 출력하는 기능
    void showMembers() {
        System.out.printf("=============현재 회원 목록 (총 %d명)=============\n", mr.members.length);
        for (Member m : mr.members) {
            System.out.println(m);
        }

    }

    // 회원정보 생성을 위해 입력을 처리
    void inputNewMember() {
        String email = null;
        while (true) {
            email = si.input("- 이메일: ");
            if (!mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("중복된 이메일입니다.");
        }
        String name = si.input("- 이름: ");
        String password = si.input("- 비밀번호: ");
        String gender = si.input("- 성별: ");
        int age = Integer.parseInt(si.input("- 나이: "));

        // 입력데이터를 기반으로 한 명의 회원 객체를 생성
        Member newMember = new Member(email, password, name, gender, age);

        // 위임 - 관심사의 분리
        mr.addNewMember(newMember);
    }

    // 사용자에게 보여줄 전체 메뉴 화면 출력
    String showProgramMenu() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 프로그램 종료");
        System.out.println("============================");

        String menuNumber = si.input("- 메뉴 번호: ");
        return menuNumber;
    }

    // 프로그램 종료를 판단하는 입출력
    boolean exitProgram() {
        String exit = si.input("- 프로그램을 종료합니까? [y / n]\n>>");
        if (exit.equals("y")) {
            System.out.println("프로그램을 종료합니다.");
            return true;
        } else {
            System.out.println("프로그램을 종료를 취소합니다.");
            return false;
        }
    }

    // 개별회원 정보 조회를 위한 입출력
    void viewOneMember() {
        String targetEmail = si.input("- 조회하실 회원의 이메일을 입력하세요^^\n");
        Member foundMember = mr.findMemberByEmail(targetEmail);
        if (foundMember != null) {
            System.out.println("============조회 결과============");
            System.out.println("이름: " + foundMember.memberName);
            System.out.println("비밀번호: " + foundMember.password);
            System.out.println("성별 :" + foundMember.gender);
            System.out.println("나이 :" + foundMember.age);
        } else {
            System.out.println("\n 해당 회원은 존재하지 않습니다.");
        }
    }

    // 회원의 정보를 변경하기 위한 입출력
    public void modifyMemberInfo() {
        String targetEmail = si.input("- 변경하실 회원의 이메일을 입력하세요^^\n");
        Member foundMember = mr.findMemberByEmail(targetEmail);
        if (foundMember != null) {
            System.out.println(foundMember.memberName + "님의 비밀번호를 변경합니다.");
            String inputNewPassword = si.input("변경할 비밀번호\n>>");
            foundMember.changePassword(inputNewPassword);

            System.out.println("변경 완료ㅋㅋ");
        } else {
            System.out.println("\n 해당 회원은 존재하지 않습니다.");
        }
    }

    // 회원의 정보를 삭제하기 위한 입출력
    public void deleteMember() {
        String targetEmail = si.input("- 삭제하실 회원의 이메일을 입력하세요^^\n");
        Member foundMember = mr.findMemberByEmail(targetEmail);
        if (foundMember != null) {
            // 삭제 진행
            // 패스워드 검사
            String inputPw = si.input("# 비밀번호를 입력하세요\n>>");
            if (inputPw.equals(foundMember.password)) {
                mr.removeMemberInfo(targetEmail);
                System.out.printf("%s님의 회원정보가 삭제되었습니다.", foundMember.memberName);
            } else {
                System.out.println("\n비밀번호가 일치하지않습니다. 탈퇴를 취소합니두");
            }
            String delete = si.input(foundMember.memberName + "님의 정보를 삭제하시겠습니까!? [y / n]\n>>");
        } else {
            System.out.println("\n 해당 회원은 존재하지 않습니다.");
        }

    }
}





