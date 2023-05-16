import java.util.Scanner;

class  InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String str){
        super(str);
    }
}
class IllegalBankTransactionException extends Exception{
    public IllegalBankTransactionException(String str){
        super(str);
    }
}

class SavingAccount{
    private long id;
    private double balance;

    public SavingAccount(long id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public double withdrawValidator(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
        if (amount < 0) {
            throw new IllegalBankTransactionException("Invalid transaction: Cannot withdraw a negative amount.Please Enter a positive amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance: Cannot withdraw more than the current balance.");
        }

        if (balance == 0) {
            throw new InsufficientBalanceException("Insufficient balance: Cannot withdraw from an empty account.");
        }

        balance -= amount;
        return balance;
    }
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
}
public class Assignment4Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1. Withdraw Money\n2. Deposit Money");
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter the id of your account");
                long accId = sc.nextLong();
                System.out.println("Enter the balance");
                double accBalance = sc.nextDouble();
                SavingAccount savingAccObj = new SavingAccount(accId, accBalance);
                try {
                    System.out.println("Enter the amount to be withdrawn");
                    double withdrawAmt = sc.nextDouble();
                    double answer=savingAccObj.withdrawValidator(withdrawAmt);
                    System.out.println(withdrawAmt+" is withdrawn successfully.Current balance is: "+answer);
                } catch (IllegalBankTransactionException e) {
                    System.out.println(e.getMessage());
                } catch (InsufficientBalanceException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                System.out.println("Enter the id of your account");
                long accId2 = sc.nextLong();
                System.out.println("Enter the balance");
                double accBalance2 = sc.nextDouble();
                System.out.println("Enter the amount to be deposited");
                double depositedAmt=sc.nextDouble();
                SavingAccount savingAccObj2 = new SavingAccount(accId2, accBalance2);
                double answer2=savingAccObj2.deposit(depositedAmt);
                System.out.println("Amount deposited successfully.Current balance is: "+answer2);
                break;
        }

    }
}
