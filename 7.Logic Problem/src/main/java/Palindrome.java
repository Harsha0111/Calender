public class Palindrome {
    public static void main(String[] args) {
        String str = "Harsha";
        String newSrt = "";
        newSrt = str.replaceAll("[aeiouAEIOU]","");
        System.out.println(newSrt);
    }
}
