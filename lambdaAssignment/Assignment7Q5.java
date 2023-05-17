import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment7Q5 {
    public static String processWords(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();

        Consumer<String> firstLetterConsumer = word -> stringBuilder.append(word.charAt(0));

        list.forEach(firstLetterConsumer);

        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        String result = processWords(list);
        System.out.println("Result: " + result);
    }

}

