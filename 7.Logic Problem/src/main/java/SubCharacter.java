public class SubCharacter {
    public static void main(String[] args) {
        String input = "qhqqqnnndenaaaq";
        String search = "q";

        int count = input.length() - input.replace(search,"").length();
        System.out.println("The Character '" + search + "' appears " + count + " times." + input);
    }
}
