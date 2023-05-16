import java.util.Scanner;

public class Assignment4Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int num1=sc.nextInt();
        System.out.println("Enter divisor: ");
        int num2=sc.nextInt();
        try{
            double ans=num1/num2;
            System.out.println("Answer is: "+ans);
        }
        catch (ArithmeticException e){
            throw new UnsupportedOperationException("Division by zero is not supported.Try again");

        }

    }
}
