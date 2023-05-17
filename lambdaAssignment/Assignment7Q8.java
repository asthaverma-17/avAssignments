import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment7Q8 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Consumer<Integer> numberPrinter = number -> System.out.println(number);

        Thread thread = new Thread(() -> numberList.forEach(numberPrinter));
        thread.start();
    }
}
