package day09.poly.quiz;

import day07.player.Player;

public class ComputerPart {

    protected String partName;
    protected double partPrice;

    public ComputerPart(String partName, double partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }

    public void describePart() {
        System.out.println("Part: " + partName + ", Price: " + partPrice);
    }

}
