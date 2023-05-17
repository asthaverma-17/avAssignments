import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Assignment7Q6 {
    public List<String> convertToUpperCase(List<String> list) {
        UnaryOperator<String> toUpperCaseOperator = String::toUpperCase;
        list.replaceAll(toUpperCaseOperator);
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> wordList = new ArrayList<>();
        System.out.println("Enter the total number of words");
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            System.out.println("Enter your word");
            String word=sc.next();
            sc.nextLine();
            wordList.add(word);
        }
        Assignment7Q6 obj = new Assignment7Q6();
        List<String> updatedList = obj.convertToUpperCase(wordList);
        System.out.println("Updated List: " + updatedList);
    }


}
