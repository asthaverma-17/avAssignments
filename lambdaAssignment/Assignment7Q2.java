import java.util.ArrayList;
import java.util.Scanner;

public class Assignment7Q2 {
    private int totalPrice;
    private String status;

    public Assignment7Q2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public static ArrayList<Assignment7Q2> listOfOrders(ArrayList<Assignment7Q2> orders) {
        ArrayList<Assignment7Q2> acceptedOrders = new ArrayList<>();

        for (Assignment7Q2 order : orders) {
            if (order.getTotalPrice() >= 1000 && order.getStatus().equals("ACCEPTED")) {
                acceptedOrders.add(order);
            }
        }

        return acceptedOrders;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Assignment7Q2> orders = new ArrayList<>();
        System.out.println("Enter the total number of orders");
        int orderCount=sc.nextInt();
        for(int i=0;i<orderCount;i++){
            System.out.println("Enter the total price");
            int price=sc.nextInt();
            System.out.println("Enter the status");
            String status=sc.next();
            sc.nextLine();
            orders.add(new Assignment7Q2(price,status));
        }
        ArrayList<Assignment7Q2> acceptedOrders = listOfOrders(orders);

        for (Assignment7Q2 order : acceptedOrders) {
            System.out.println("Total Price: " + order.getTotalPrice() + ", Status: " + order.getStatus());
        }
    }
}
