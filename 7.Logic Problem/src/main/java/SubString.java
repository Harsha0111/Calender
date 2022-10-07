public class SubString {
    public static void main(String[] args) {
        String str = "hellohijiiiihijjjhijk";
        String subStr = "hi";

        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1){
            lastIndex = str.indexOf(subStr,lastIndex);

            if ( lastIndex != -1){
                count++;
                lastIndex += subStr.length();
            }

        }
        System.out.println("The substring '" + subStr + "' appears " + count + " times.");
    }
}
