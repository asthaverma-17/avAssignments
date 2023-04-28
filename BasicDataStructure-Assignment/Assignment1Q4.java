import java.util.Scanner;
//Condition 1: -All subjects marks is greater than 60 is Passed
//
//        Condition 2: -Any two subjects marks are greater than 60 is Promoted
//
//        Condition 3: -Any one subject mark is greater than 60 or all subjects’ marks less than 60 is failed.
class ResultDeclaration {
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        String result = "";
        int count = 0;
        if (subject1Marks > 60) {
            count++;
        }
        if (subject2Marks > 60) {
            count++;
        }
        if (subject3Marks > 60) {
            count++;
        }
        if (count == 3) {
            result = "Passed";
        } else if (count == 2) {
            result = "Promoted";
        } else {
            result = "Failed";
        }
        return result;
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marksSub1=sc.nextInt();
        int marksSub2=sc.nextInt();
        int marksSub3=sc.nextInt();
        ResultDeclaration obj=new ResultDeclaration();
        System.out.println(obj.declareResults(marksSub1,marksSub2,marksSub3));
    }

    }

