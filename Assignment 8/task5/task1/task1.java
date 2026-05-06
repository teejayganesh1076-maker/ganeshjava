interface Payment{
   public void processPayment(double amt);
}

class CreditCard implements Payment{
    public void processPayment(double amt){
    System.out.println("Credit Card processed Amount :"+amt);
    }
}
class UPI implements Payment{
   public void processPayment(double amt){
    System.out.println("UPI processed payment :"+amt);
   }
}
class Paypal implements Payment{
 public void processPayment(double amt){
  System.out.println("Paypal processed payment :"+amt);
 }
}
public class task1 {
public static void main(String[] args){

CreditCard c1 = new CreditCard();

c1.processPayment(2200.00);

UPI u1 = new UPI();

u1.processPayment(4333.00);

Paypal p1 = new Paypal();

p1.processPayment(5222.00);

}    
}