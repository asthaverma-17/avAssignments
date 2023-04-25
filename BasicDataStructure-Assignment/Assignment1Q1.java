import java.util.Scanner;
import java.lang.Math;
class ArmstrongOrNot{
    public boolean armstrongCheck(int num) {
        int temp1=num;
        int count=0;
        int sum=0;
        int temp2=num;
        while(num>0) {
            num = num / 10;
            count++;
        }
        while(temp1>0){
            int rem=temp1%10;
            sum= (int) (sum+Math.pow(rem,count));
            temp1=temp1/10;
        }
        if(temp2==sum){
            return true;
        }
        else{
            return false;
        }

    }
}
public class Assignment1Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        ArmstrongOrNot armObj=new ArmstrongOrNot();
        if(armObj.armstrongCheck(num)){
            System.out.println(num+" is an armstrong number");
        }
        else{
            System.out.println(num+" is not an armstrong number");
        }
    }
}
