class LoginSystem{
    void login(String username,String password){
    System.out.println("Username is "+username+" and password is "+password);
    }
    void login(String email,String password,boolean isEmail){
    if(isEmail){
     System.out.println("User email is "+email+" and password is "+password);
    }
    }
    void login(long mobileNumber,int otp){
    System.out.println("Mobile Number : "+mobileNumber);
    System.out.println("OTP : "+otp);
    } 
}

public class task4 {
public static void main(String[] args) {
LoginSystem l = new LoginSystem();
l.login("ganesh", "123456");
l.login("sakthi@gmail.com","654321",true);    
l.login(532133221, 1233);
}    
}