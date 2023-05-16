
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Assignment5Q2{
    public static void main(String[] args) {
        HashMap<Integer, Double> randomMap = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int key = random.nextInt();
            double value = random.nextDouble();
            randomMap.put(key, value);
        }

        System.out.println("Data stored in HashMap:");
        for (Map.Entry<Integer, Double> randomValue : randomMap.entrySet()) {
            int key = randomValue.getKey();
            double value = randomValue.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
