import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment7Q3 {
    static void modifyValue() {
        // Supplier functional interface is used to generate a random value using the Math.random() method.
        Supplier<Double> randomSupplier = Math::random;
        double randomValue = randomSupplier.get();
        System.out.println("Random value is: " + randomValue);

        //  Consumer functional interface is used to add names to a list using the add() method of ArrayList.
        List<String> names = new ArrayList<>();
        Consumer<String> nameConsumer = names::add;
        nameConsumer.accept("Astha Verma");
        nameConsumer.accept("Manya Verma");
        System.out.println("Names: " + names);

        // Predicate functional interface  is used to check if a number is even by applying the % operator.
        Predicate<Integer> evenPredicate = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + evenPredicate.test(4));
        System.out.println("Is 7 even? " + evenPredicate.test(7));

        // Function functional interface is used to get the length of a string using the length() method.
        Function<String, Integer> stringLengthFunction = String::length;
        int length = stringLengthFunction.apply("Milky Way");
        System.out.println("Length of given string is: " + length);
    }

    static class Product {
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
    }

    static void display() {
        // Example using Supplier functional interface
        Supplier<Product> productSupplier = () -> new Product("Phone", 999.99);
        Product product = productSupplier.get();
        System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
    }

    public static void main(String[] args) {
        modifyValue();
        display();
    }
}
