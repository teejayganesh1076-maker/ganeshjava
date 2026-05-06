// Abstract class Transport
abstract class Transport {
    public abstract void bookTicket();
}

// Bus class extending Transport
class Bus extends Transport {
    public void bookTicket() {
        System.out.println("Booking a Bus ticket: Select route, choose seat, and confirm payment.");
    }
}

// Train class extending Transport
class Train extends Transport {
    public void bookTicket() {
        System.out.println("Booking a Train ticket: Select train, choose berth, and confirm reservation.");
    }
}

// Main class to test
public class Task3 {
    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.bookTicket();

        Transport train = new Train();
        train.bookTicket();
    }
}

