class ShapeCalculator{
    double area(double side){
      return side* side;
    }
    double area(double length,double width){
      return length *width;
    }
    double area(float radius){
    return Math.PI * radius * radius;
    }
}

public class Task2 {
    public static void main(String[] args) {
      ShapeCalculator s = new ShapeCalculator();  
     System.out.println("Square : "+s.area(5.0)); 
     System.out.println("Rectangle : "+s.area(10.0,4.0));
     System.out.println("Circle : "+s.area(7.0f));
    }
    
}