import java.util.ArrayList;
import java.util.Scanner;

public class Assignment7Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> wordList) {
        wordList.removeIf(word -> word.length() % 2 != 0);
        return wordList;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        System.out.println("Enter the total number of words");
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            System.out.println("Enter your word");
            String word=sc.next();
            sc.nextLine();
            wordList.add(word);

        }
        Assignment7Q4 assignmentObj = new Assignment7Q4();
        ArrayList<String> updatedList = assignmentObj.removeOddLength(wordList);

        System.out.println("Updated List: " + updatedList);
    }
}
