import java.util.Scanner;

class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        if(user.equals(userId)&&pass.equals(password)){
            return "Welcome "+user;
        }
        else{
            return "You have entered wrong credentials ,please enter the right credentials.";
        }
    }
}
public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Login loginObj=new Login();
        String output="";
        String loopEndStr="You have entered wrong credentials ,please enter the right credentials.";
        for(int i=0;i<3;i++){
            System.out.println("Enter userId");
            String userName=sc.nextLine();
            System.out.println("Enter password");
            String password=sc.nextLine();
            output=loginObj.loginUser(userName,password);
            if(!output.equals(loopEndStr)){
                break;
            }
            if(i==2&&output.equals(loopEndStr)){
                output="You have entered wrong credentials 3 times\nContact Admin";
            }
        }
        System.out.println(output);
    }
}
