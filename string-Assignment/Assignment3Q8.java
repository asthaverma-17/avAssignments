public class Assignment3Q8 {
    public static void main(String[] args) {
        String originalString = "It is used to _ at the specified index position";
        String replacedString = "insert text";

        StringBuilder strBuilder = new StringBuilder(originalString);
        int index = strBuilder.indexOf(String.valueOf('_'));
        while (index != -1) {
            strBuilder.replace(index, index + 1, replacedString);
            index = strBuilder.indexOf(String.valueOf('_'), index + 1);
        }

        String finalString = strBuilder.toString();
        System.out.println(finalString);

    }
}
