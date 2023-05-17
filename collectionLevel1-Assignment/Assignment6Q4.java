import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Assignment6Q4{
    private static Date parseDate(String input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return dateFormat.parse(input);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter dates in the format DD-MM-YYYY.");
            System.exit(1);
        }
        return null;
    }
    public static void main(String[] args) {
        LinkedList<Date> datesOfBirth = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dates of birth (DD-MM-YYYY), one per line (press Enter to finish):");

        // Read the dates of birth until the user finishes entering them
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            Date dateOfBirth = parseDate(input);
            datesOfBirth.addFirst(dateOfBirth);
            input = scanner.nextLine();
        }

        // Iterate over the dates of birth in reverse order
        for (int i = datesOfBirth.size() - 1; i >= 0; i--) {
            Date dateOfBirth = datesOfBirth.get(i);
            printDateOfBirth(dateOfBirth);
        }
    }

    private static void printDateOfBirth(Date dateOfBirth) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(dateOfBirth);

        int year = dateOfBirth.getYear() + 1900;
        boolean isLeapYear = isLeapYear(year);

        System.out.println("Your date of birth is " + formattedDate + " and it " +
                (isLeapYear ? "was" : "was not") + " a leap year");
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 100 != 0)
            return true;
        else return year % 400 == 0;
    }
}
