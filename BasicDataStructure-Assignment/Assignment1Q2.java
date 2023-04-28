import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max) {
        List<Integer> armArray=new ArrayList<Integer>();
        for (int i = min; i <=max; i++) {
            int sum = 0;
            int temp=i;
            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, 3);
                temp = temp / 10;
            }
            if (sum == i) {
                armArray.add(i);
            }
        }
        int[] resultArr=new int[armArray.size()];
        for(int i=0;i<armArray.size();i++){
            resultArr[i]=armArray.get(i);
        }
        return resultArr;
    }
}
public class Assignment1Q2 {
    public static void main(String[] args) {
        int min=100;
        int max=999;
        System.out.println("Armstrong numbers between 100 and 999 are: ");
        ArmstrongNumBetweenRange armObj=new ArmstrongNumBetweenRange();
        int[] resultArr=armObj.armstrongNumbersInRange(min,max);
        for(int i=0;i<resultArr.length;i++){
            System.out.print(resultArr[i]+" ");
        }
    }
}
