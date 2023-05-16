import java.util.Date;

public class Pair<T1, T2> {
    private String key;
    private T2 value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        // Check if key is a String
        if (!(key instanceof String)) {
            throw new IllegalArgumentException("Invalid key type. Only String type is allowed.");
        }

        this.key = key;
    }

    public T2 getValue() {
        return value;
    }

    public void setValue(T2 value) {
        // Check if value is of type java.util.Date
        if (!(value instanceof T2)) {
            throw new IllegalArgumentException("Invalid value type. Only java.util.Date type is allowed.");
        }

        this.value = value;
    }

    public static void main(String[] args) {
        // Scenario a: String key and value
        Pair<String, String> pair1 = new Pair<>();
        pair1.setKey("1");
        pair1.setValue("Hello");
        System.out.println("Key: " + pair1.getKey());
        System.out.println("Value: " + pair1.getValue());
        System.out.println();

        // Scenario b: String key and java.util.Date value
        Pair<String, Date> pair2 = new Pair<>();
        pair2.setKey("Today is");
        pair2.setValue(new Date());
        System.out.println("Key: " + pair2.getKey());
        System.out.println("Value: " + pair2.getValue());
    }
}
