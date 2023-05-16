
import java.util.Arrays;
import java.util.Scanner;

public class Assignment5Q3 {
    public static <T> void exchangeElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid index.");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int arrLen=sc.nextInt();
        Integer[] numArr= new Integer[arrLen];
        for(int i=0;i<numArr.length;i++){
             numArr[i]= sc.nextInt();
        }
        System.out.println("Enter index 1 ");
        int index1=sc.nextInt();
        System.out.println("Enter index 2 ");
        int index2=sc.nextInt();

        System.out.println("Before exchanging elements: " + Arrays.toString(numArr));
        exchangeElements(numArr, index1, index2);
        System.out.println("After exchanging elements: " + Arrays.toString(numArr));
    }
}
