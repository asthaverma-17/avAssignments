public class Assignment3Q5 {
    public static void main(String[] args) {
        String originalString = "It is used to _ at the specified index position";
        String replacedString = "insert text";

        StringBuffer stringBuffer = new StringBuffer(originalString);
        int index = stringBuffer.indexOf(String.valueOf('_'));
        while (index != -1) {
            stringBuffer.replace(index, index + 1, replacedString);
            index = stringBuffer.indexOf(String.valueOf('_'), index + 1);
        }

        String finalString = stringBuffer.toString();
        System.out.println(finalString);

    }


}
