import java.util.Scanner;

class TaxAmount {
    public double calculateTaxAmount(int ctc) {
        double taxAmount = 0;
        if (ctc <= 180000) {
            taxAmount = 0;
        } else if (ctc >= 181001 && ctc <= 300000) {
            taxAmount = (ctc - 180000) * 0.1;
        } else if (ctc >= 300001 && ctc <= 500000) {
            taxAmount = 12000 + (ctc - 300000) * 0.2;
        } else if (ctc >= 500001 && ctc <= 1000000) {
            taxAmount = 52000 + (ctc - 500000) * 0.3;
        }
        return taxAmount;
    }
}

public class Assignment1Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ctc:");
        int ctc=sc.nextInt();
        System.out.println("Enter your gender:(M/F/SCit):");
        String gender=sc.nextLine();
        sc.nextLine();
        TaxAmount obj=new TaxAmount();
        System.out.println("The taxable amount is: "+obj.calculateTaxAmount(ctc));

    }
}
