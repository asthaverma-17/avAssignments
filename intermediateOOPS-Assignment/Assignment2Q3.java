import java.util.ArrayList;
import java.util.Scanner;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits+creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
        int totalAmt=0;
        for(int amt:cash){
            totalAmt+=amt;
        }
        return totalAmt;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> cashList = new ArrayList<>();
        Assignment2Q3 obj = new Assignment2Q3();
        CurrentAccount caObj = new CurrentAccount();
        SavingsAccount saObj = new SavingsAccount();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the account type");
            System.out.println("1. Current Account");
            System.out.println("2. Savings Account ");
            System.out.println("3. Total cash in the bank ");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int result1 = caObj.getCash();
                    cashList.add(result1);
                    break;
                case 2:
                    int result2 = saObj.getCash();
                    cashList.add(result2);
                    break;
                case 3:
                    System.out.println("total cash in the bank is: " + obj.totalCashInBank(cashList));
                    break;
                case 4:
                    return;
            }
        }
    }

}
