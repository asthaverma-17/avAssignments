import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment7Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Enter total number of entries");
        int entryCount=sc.nextInt();
        for(int i=0;i<entryCount;i++){
            System.out.println("Enter your string");
            String str= sc.next();
            sc.nextLine();
            System.out.println("Enter your value");
            int val= sc.nextInt();
            map.put(str, val);
        }

        Assignment7Q7 obj = new Assignment7Q7();
        String result = obj.convertKeyValueToString(map);

        System.out.println("Result: " + result);
    }

    public String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            stringBuilder.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append(", ");
        }

        // Remove the trailing ", " from the final string
        if (stringBuilder.length() > 2) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }

        return stringBuilder.toString();
    }
}
