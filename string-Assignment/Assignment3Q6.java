public class Assignment3Q6 {
    public static void main(String[] args) {

        String str="This method returns the reversed object on which it was called";
        StringBuffer stringBuff=new StringBuffer(str);
        stringBuff.reverse();

        String finalStr=stringBuff.toString();
        System.out.println(finalStr);
    }
}
