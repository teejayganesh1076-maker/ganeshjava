interface SmartDevice{
    public void turnOn();
    public void turnOff();
}

class Fan implements SmartDevice{
    public void turnOn(){
      System.out.println("Fan is Turned On!");
    }
    public void turnOff(){
      System.out.println("Fan is Turned Off!");
    }
}

class Light implements SmartDevice{
    public void turnOn(){
    System.out.println("Light is Turned On!");
    }
    public void turnOff(){
    System.out.println("Light is Turned Off!");
    }
}

class AirConditioner implements SmartDevice{
    public void turnOn(){
    System.out.println("Airconditioner is Turned On!");
    }
    public void turnOff(){
    System.out.println("Airconditioner is Turned Off!");
    }
}
public class task3 {
public static void main(String[] args){
SmartDevice f1 = new Fan();

f1.turnOn();
f1.turnOff();

SmartDevice l1 = new Light();

l1.turnOn();
l1.turnOff();

SmartDevice a1 = new AirConditioner();

a1.turnOn();
a1.turnOff();
}    
}