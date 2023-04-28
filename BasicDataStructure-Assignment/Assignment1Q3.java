import java.util.Scanner;
import java.lang.Math;
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double resultSimple=(principalAmount*time*interestRate)/100;
        return resultSimple;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){

        double resultCompound=principalAmount*Math.pow((1+(interestRate/100)),time)-principalAmount;
    return resultCompound;
    }
}

public class Assignment1Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        double pAmount=sc.nextDouble();
        System.out.println("Enter time:");
        int time=sc.nextInt();
        System.out.println("Enter interest rate:");
        double intRate=sc.nextDouble();
        SiCi obj=new SiCi();
        System.out.printf("Simple interest on the given amount is %.2f\n",obj.simpleInterest(pAmount,time,intRate));
        System.out.printf("Compound interest on the given amount %.2f",obj.compoundInterest(pAmount,time,intRate));
    }
}
