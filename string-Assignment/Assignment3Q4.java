public class Assignment3Q4 {
    public static void main(String[] args) {
        StringBuffer strBuff = new StringBuffer();
        String str1="StringBuffer";
        String str2=" is a peer class of String";
        String str3=" that provides much of";
        String str4=" the functionality of strings";
        strBuff.append(str1).append(str2).append(str3).append(str4);
        String finalStr= strBuff.toString();
        System.out.println(finalStr);


    }
}
