package day07.quiz;

import java.time.LocalDate;
import java.util.Date;

import static java.time.LocalDate.now;

public class Car {
    private String brand;
    private String carName;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String carName) {
        this.carName = carName;
    }

    public void setYear(int year) {
        if (year > LocalDate.now().getYear()) {
            System.out.println("유효하지 않은 연식입니다.");
            return;
        }
        this.year = year;

    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.carName;
    }

    public int getYear() {
        return this.year;
    }
}
