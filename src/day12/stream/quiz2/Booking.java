package day12.stream.quiz2;

// 예약 정보
public class Booking {

    private Traveler traveler;
    private Destination destination;
    private int year;
    private double price;

    public Booking(Traveler traveler, Destination destination, int year, double price) {
        this.traveler = traveler;
        this.destination = destination;
        this.year = year;
        this.price = price;
    }

    public Traveler getTraveler() {
        return traveler;
    }

    public Destination getDestination() {
        return destination;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "traveler=" + traveler +
                ", destination=" + destination +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
