
public class task1 {
    static void bankApp(int amt) throws Exception{
      int balance = 5000;

      if(amt < 0){
        throw new Exception("Amount Can't be Negative");
      }
      if(balance < amt){
        throw new Exception("Insuficient Balance!");
      }else{
        System.out.println("Amount Withdrawn :"+amt);
      }
    }
public static void main(String[]args){
 try {
    bankApp(4991);
 } catch (Exception e) {
    System.out.println("ERROR :"+e.getMessage());
 }finally{
    System.out.println("Transaction Log : Withdrawal Attempt Recorded");
 }
}    
}