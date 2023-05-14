import java.util.Scanner;

class Student {
    private int subjectA,subjectB,subjectC;

    public Student(int subjectA, int subjectB, int subjectC) {
        this.subjectA = subjectA;
        this.subjectB = subjectB;
        this.subjectC = subjectC;
    }

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int sumOfTotal=0;
        for(int i=0;i<students.length;i++){
            sumOfTotal+=students[i].subjectA+students[i].subjectB+students[i].subjectC;
        }
        return sumOfTotal;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int sumOfTotal=0;
        for(int i=0;i<students.length;i++){
            sumOfTotal+=students[i].subjectA+students[i].subjectB+students[i].subjectC;
        }
        double result=sumOfTotal/3;
        return result;
    }
    public int[] subjectWiseMarks(Student[] students,String subjectName){
        int marks[]=new int[3];
        if(subjectName.equals("subjectA")){

        for(int i=0;i<students.length;i++){
            marks[i]=students[i].subjectA;
            }
        }
        else if(subjectName.equals("subjectB")){
            for(int i=0;i<students.length;i++){
                marks[i]=students[i].subjectB;
            }
       }
        else{
            for(int i=0;i<students.length;i++){
                marks[i]=students[i].subjectC;
            }
        }
        return marks;
    }
    public int subjectATotalByStudents(int[] marks) {
        int sumOfSubA=0;
        for(int i=0;i<marks.length;i++){
            sumOfSubA+=marks[i];
        }
        return sumOfSubA;
    }
    public int subjectBTotalByStudents(int[] marks) {
        int sumOfSubB=0;
        for(int i=0;i<marks.length;i++){
            sumOfSubB+=marks[i];
        }
        return sumOfSubB;

    }
    public int subjectCTotalByStudents(int[] marks) {
        int sumOfSubC=0;
        for(int i=0;i<marks.length;i++){
            sumOfSubC+=marks[i];
        }
        return sumOfSubC;

    }

    public int subjectTotalByStudents(int[] marks){
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return sum;

    }

    public double subjectAAverageByStudents(int[] marks) {
        int sumOfSubA=0;
        for(int i=0;i<marks.length;i++){
            sumOfSubA+=marks[i];
        }
        double res=sumOfSubA/3;
        return res;

    }
    public double subjectBAverageByStudents(int[] marks) {
        int sumOfSubB=0;
        for(int i=0;i<marks.length;i++){
            sumOfSubB+=marks[i];
        }
        double res=sumOfSubB/3;
        return res;
    }
    public double subjectCAverageByStudents(int[] marks) {
        int sumOfSubC=0;
        for(int i=0;i<marks.length;i++){
            sumOfSubC+=marks[i];
        }
        double res=sumOfSubC/3;
        return res;
    }
}


public class Assignment1Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("marks of Student 1 in subjects A,B,C");
        String marks1[]=sc.nextLine().split(" ");
        System.out.println("marks of Student 2 in subjects A,B,C");
        String marks2[]=sc.nextLine().split(" ");
        System.out.println("marks of Student 3 in subjects A,B,C");
        String marks3[]=sc.nextLine().split(" ");
        Student stuObj1=new Student(Integer.parseInt(marks1[0]),Integer.parseInt(marks1[1]),Integer.parseInt(marks1[2]));
        Student stuObj2=new Student(Integer.parseInt(marks2[0]),Integer.parseInt(marks2[1]),Integer.parseInt(marks2[2]));
        Student stuObj3=new Student(Integer.parseInt(marks3[0]),Integer.parseInt(marks3[1]),Integer.parseInt(marks3[2]));
        Student[] list={stuObj1,stuObj2,stuObj3};
        System.out.println( stuObj1.studentsTotalMarksInAllSubjects(list));
        System.out.println(stuObj1.studentsAverageMarksInAllSubjects(list));
        System.out.println(stuObj1.subjectATotalByStudents(stuObj1.subjectWiseMarks(list,"subjectA")));
        System.out.println(stuObj1.subjectAAverageByStudents(stuObj1.subjectWiseMarks(list,"subjectA")));
        System.out.println(stuObj1.subjectBTotalByStudents(stuObj1.subjectWiseMarks(list,"subjectB")));
        System.out.println(stuObj1.subjectBAverageByStudents(stuObj1.subjectWiseMarks(list,"subjectB")));
        System.out.println(stuObj1.subjectCTotalByStudents(stuObj1.subjectWiseMarks(list,"subjectC")));
        System.out.println(stuObj1.subjectCAverageByStudents(stuObj1.subjectWiseMarks(list,"subjectC")));
    }
}
