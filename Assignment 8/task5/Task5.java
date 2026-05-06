
class Transport{
    void calculateFare(){
    System.out.println("Fare calculation");
    }
}
class Bus extends Transport{
    void calculateFare(){
    System.out.println("Bus ticket is 8rs");
    }
}
class Train extends Transport{
   void calculateFare(){
   System.out.println("Train ticket is 5rs");
   }
}
class taxi extends Transport{
   void calculateBonus(){
   System.out.println("Taxi is 100rs");
   }
}

public class Task5 {
    public static void main(String[] args) {
        
        Transport t1 = new Transport();
        Bus t2 = new Bus();
        Train t3 = new Train();
        taxi t4 = new taxi();
        t1.calculateFare();
        t2.calculateFare();
        t3.calculateFare();
        t4.calculateBonus();
    }

    }
