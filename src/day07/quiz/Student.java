package day07.quiz;

public class Student {

    private String name;
    private String studentId;
    private String major;


    public void setName(String inputName) {
        if (inputName.equals("") || inputName == null) {
            System.out.println("유효하지않은 입력입니다.");
            return;
        }
        this.name = inputName;
    }

    public void setStudentId(String studentId) {
        if (studentId.equals("") || studentId == null) {
            System.out.println("유효하지않은 입력입니다.");
            return;
        }
        this.studentId = studentId;
    }

    public void setDepartment(String major) {
        if (major.equals("") || major == null) {
            System.out.println("유효하지않은 입력입니다.");
            return;
        }
        this.major = major;
    }


    public String getName() {
        return this.name;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public String getDepartment() {
        return this.major;
    }

}

