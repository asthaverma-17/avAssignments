import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
    int candies;
    public int addCandies(int candies){
        this.candies=candies;
        return candies;
    }

    @Override
    public int getCost() {

        return candies*60;
    }
}
class Cookie extends DesertItem {
    int cookies;
    public int addCookies(int cookies){
        this.cookies=cookies;
        return cookies;

    }

    @Override
    public int getCost() {
        return cookies*70;
    }
}
class IceCream extends DesertItem {
    int iceCreams;
    public int addIceCreams(int iceCreams){
        this.iceCreams=iceCreams;
        return iceCreams;
    }

    @Override
    public int getCost() {
        return iceCreams;
    }
}

public class Assignment2Q7 {
    Scanner sc = new Scanner(System.in);
    List<DesertItem> desertList=new ArrayList<>();
    private void selectRoles(){
        System.out.println("Enter your role:(owner/customer):");
        String role=sc.nextLine();
        roles(role);

    }
    private void roles(String role){
        if(role.equalsIgnoreCase("owner")){
            addItems();
        }
        else if(role.equalsIgnoreCase("customer")){
            placeOrder();
        }
        else{
            System.out.println("Invalid role.Try again");
            selectRoles();
        }

    }
    private void addItems() {
        System.out.println("Select a desert item:\n1. Candy\n2.Cookie\n3.IceCream");
        int choice=sc.nextInt();
        sc.nextLine();
        addItemsOperation(choice);
    }
    private void addItemsOperation(int choice) {
        switch(choice){
            case 1:
                System.out.println("Enter the number of candies to be added : ");
                int noOfcandies=sc.nextInt();
                sc.nextLine();
                Candy candyObj=new Candy();
                candyObj.addCandies(noOfcandies);
                desertList.add(candyObj);
                System.out.println(noOfcandies+" candies are added to the shop storage");
                break;
            case 2:
                System.out.println("Enter the number of cookies to be added : ");
                int noOfCookies=sc.nextInt();
                sc.nextLine();
                Cookie cookieObj=new Cookie();
                cookieObj.addCookies(noOfCookies);
                desertList.add(cookieObj);
                System.out.println(noOfCookies+" cookies are added to the shop storage");
                break;
            case 3:
                System.out.println("Enter the number of IceCreams to be added : ");
                int noOfIceCreams=sc.nextInt();
                sc.nextLine();
                IceCream iceCreamobj=new IceCream();
                iceCreamobj.addIceCreams(noOfIceCreams);
                desertList.add(iceCreamobj);
                System.out.println(noOfIceCreams+" iceCreams are added to the storage");
                break;

        }
    }
    private void placeOrder() {
        System.out.println("Place your order:\n1. Candy\n2.Cookie\n3.IceCream");
        int choice=sc.nextInt();
        sc.nextLine();
        placeOrderOperation(choice);
    }
    private void placeOrderOperation(int choice) {
        switch (choice){
            case 1:
                System.out.println("Enter the no of candies to be ordered: ");
                int noOfcandies=sc.nextInt();
                sc.nextLine();
                Candy candyObj=new Candy();
                candyObj.addCandies(noOfcandies);
                System.out.println("The total cost of the candies are: "+candyObj.getCost());
                break;
            case 2:
                System.out.println("Enter the no of cookies to be ordered: ");
                int noOfcookies=sc.nextInt();
                sc.nextLine();
                Cookie cookieObj=new Cookie();
                cookieObj.addCookies(noOfcookies);
                System.out.println("The total cost of the cookies are: "+cookieObj.getCost());
                break;
            case 3:
                System.out.println("Enter the no of iceCreams to be ordered: ");
                int noOfIceCreams=sc.nextInt();
                sc.nextLine();
                IceCream iceCreamObj=new IceCream();
                iceCreamObj.addIceCreams(noOfIceCreams);
                System.out.println("The total cost of the candies are: "+iceCreamObj.getCost());
                break;

        }

    }
    public static void main(String[] args) {
        Assignment2Q7 obj=new Assignment2Q7();
        obj.selectRoles();
    }



}
