
import java.util.HashSet;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product otherProduct = (Product) obj;
        return name.equals(otherProduct.name) && price == otherProduct.price;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Double.hashCode(price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}

public class Assignment6Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Product> products = new HashSet<>();
        System.out.println("Enter the no of products to be added");
        String pName = "";
        double pPrice = 0;
        
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            System.out.println("Enter the product name:");
            pName=sc.next();
            sc.nextLine();
            System.out.println("Enter the price of the product:");
            pPrice= sc.nextDouble();
            Product proObj=new Product(pName,pPrice);
            products.add(proObj);
        }


        Product duplicateProduct = new Product(pName,pPrice);
        products.add(duplicateProduct);
        for (Product product : products) {
            System.out.println(product.getName()+" : "+product.getPrice());
        }
    }
}
