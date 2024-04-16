package day06.member;

// 역할: 회원 배열을 관리하는 역할 - 회원 데이터 저장소

public class MemberRepository {

    // 필드
    static Member[] members;

    // 생성자
    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("abc@def.com", "1234", "콩순이", "여성", 22);
        members[1] = new Member("ooo@ggg.com", "5678", "김삿갓", "남성", 25);
        members[2] = new Member("xxx@yyy.com", "4444", "박격포", "나비", 34);
    }

    // 메서도

    // 회원정보 생성
    void addNewMember(Member newMember) {

        // 배열에 데이터를 추가하는 로직
        Member[] temp = new Member[members.length + 1];

        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length - 1] = newMember;
        members = temp;
    }
}

