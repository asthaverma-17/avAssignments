
import java.util.*;

class Contact {
    private long phoneNumber;
    private String name;
    private String email;
    private Gender gender;

    public Contact(long phoneNumber, String name, String email, Gender gender) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

enum Gender {
    MALE, FEMALE, OTHER
}

public class Assignment6Q1  {
    public static void main(String[] args) {
        TreeMap<Long, Contact> contactsMap = new TreeMap<>(Collections.reverseOrder());
        // Assuming contactsMap is already populated

        // Add some sample contacts
        contactsMap.put(1234567890L, new Contact(1234567890L, "John Doe", "john@example.com", Gender.MALE));
        contactsMap.put(9876543210L, new Contact(9876543210L, "Jane Smith", "jane@example.com", Gender.FEMALE));

        // Fetch all the keys and print them
        Set<Long> phoneNumbers = contactsMap.keySet();
        for (Long phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
        System.out.println();

        // Fetch all the values and print them
        Collection<Contact> contacts = contactsMap.values();
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
        System.out.println();

        // Print all key-value pairs
        Set<Map.Entry<Long, Contact>> entries = contactsMap.entrySet();
        for (Map.Entry<Long, Contact> entry : entries) {
            Long phoneNumber = entry.getKey();
            Contact contact = entry.getValue();
            System.out.println("Phone Number: " + phoneNumber + ", Contact: " + contact);
        }
    }
}
