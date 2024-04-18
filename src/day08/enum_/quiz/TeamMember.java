package day08.enum_.quiz;

public class TeamMember {
    private String name;
    private TeamRole role;

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask() {
        System.out.printf("%s is assign to %s\n", this.name, this.role.getToDo());
    }
}
