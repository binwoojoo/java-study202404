package day08.enum_.quiz;

public enum TeamRole {

    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");

    private final String toDo;

    TeamRole(String toDo) {
        this.toDo = toDo;
    }

    public String getToDo() {
        return toDo;
    }
}
