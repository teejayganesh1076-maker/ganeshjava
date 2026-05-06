import javax.swing.tree.VariableHeightLayoutCache;

interface Vehicle{
   public void startEngine();
   public void stopEngine();
}

class Car implements Vehicle{
 public void startEngine(){
   System.out.println("Car engine started!");
 }
 public void stopEngine(){
 System.out.println("Car engine Stopped!");
 }
}

class Bike implements Vehicle{
    public void startEngine(){
    System.out.println("Bike Engine Started!");
    }
    public void stopEngine(){
    System.out.println("Bike Engine Stopped!");
    }
}

class Truck implements Vehicle{
    public void startEngine(){
    System.out.println("Truck Engine Started!");
    }
    public void stopEngine(){
    System.out.println("Truck Engine Stopped!");
    }
}

public class Task2 {
public static void main(String[]args){
Vehicle v1 = new Bike();
Vehicle v2 = new Car();
Vehicle v3 = new Truck();

v1.startEngine();
v1.stopEngine();

v2.startEngine();
v2.stopEngine();

v3.startEngine();
v3.stopEngine();
}    
}