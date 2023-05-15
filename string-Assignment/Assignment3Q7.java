public class Assignment3Q7 {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();
        String str1="StringBuffer";
        String str2=" is a peer class of String";
        String str3=" that provides much of";
        String str4=" the functionality of strings";
        strBuilder.append(str1).append(str2).append(str3).append(str4);
        String finalStr= strBuilder.toString();
        System.out.println(finalStr);


    }
}
