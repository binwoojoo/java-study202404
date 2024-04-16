package day06.member;

// 역할: 사용자의 메뉴 입력을 분기하는 역할

import util.SimpleInput;

public class MemberController {

    MemberView mv;
    SimpleInput si;

    MemberController() {
        this.mv = new MemberView();
        this.si = new SimpleInput();
    }

    // 메뉴 입력 분기에 따라 할 일을 나눠주는 기능
    void run() {
        while (true) {
            String menuNum = mv.showProgramMenu();

            switch (menuNum) {
                case "1":
                    mv.inputNewMember();
                    break;
                case "2":
                    mv.viewOneMember();
                    break;
                case "3":
                    mv.showMembers();
                    break;
                case "4":
                    mv.modifyMemberInfo();
                    break;
                case "5":
                    mv.deleteMember();
                    break;
                case "6":
                    boolean flag = mv.exitProgram();
                    if (flag) return;
            }

            si.stopInput();
        }
    }
}