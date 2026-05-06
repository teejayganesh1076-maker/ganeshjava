// Abstract class Appliance
abstract class Appliance {
    public abstract void turnOn();
    public abstract void turnOff();
}

// Fan class extending Appliance
class Fan extends Appliance {
    public void turnOn() {
        System.out.println("Fan is turned ON!");
    }

    public void turnOff() {
        System.out.println("Fan is turned OFF!");
    }
}

// WashingMachine class extending Appliance
class WashingMachine extends Appliance {
    public void turnOn() {
        System.out.println("Washing Machine is turned ON!");
    }

    public void turnOff() {
        System.out.println("Washing Machine is turned OFF!");
    }
}

// Main class to test
public class Task1 {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        fan.turnOn();
        fan.turnOff();

        Appliance wm = new WashingMachine();
        wm.turnOn();
        wm.turnOff();
    }
}

