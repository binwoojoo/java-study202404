package day08.static_;

public class Department {

    private String departmentName;
    private int studentCount;
    private static int totalStudents;

    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
    }

    public void addStudent(int number) {
      this.studentCount += number;
      Department.totalStudents += studentCount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudents() {
       return Department.totalStudents;
    }

}
