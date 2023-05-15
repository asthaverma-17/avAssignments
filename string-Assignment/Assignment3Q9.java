public class Assignment3Q9 {
    public static void main(String[] args) {

    String str="This method returns the reversed object on which it was called";
    StringBuilder stringBuilder=new StringBuilder(str);
    stringBuilder.reverse();

    String finalStr=stringBuilder.toString();
    System.out.println(finalStr);
}

}
