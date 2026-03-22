public class task2 {
	

	  static class MobileShop{
		int Price;
		String Model;
		
		
		MobileShop(){
			Model = "Iphone 15pro";
		   Price= 70000;  
		
	}
	  }
		
	   public static void main(String[] args) {
		   
		   MobileShop  MS = new MobileShop();
		   System.out.println("The Model is: "+MS.Model+", which price can be as: Rs." +MS.Price);
			   
	   }
	}
