package op.task4;

import java.util.Objects;

public class Train {
    private String destination;
    private String departure;
    private int number;


    public Train(String destination, String departure, int number) {
        this.destination = destination;
        this.departure = departure;
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number &&
                Objects.equals(destination, train.destination) &&
                Objects.equals(departure, train.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, number, departure);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", departure='" + departure + '\'' +
                '}';
    }


}
