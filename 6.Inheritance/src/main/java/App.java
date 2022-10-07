public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setA(3);
        cal.setB(4);

        Add add = new Add();
        Sub sub = new Sub();

        int res1 = add.add();


        System.out.println(res1);
        System.out.println(sub.sub(3, 5));

    }
}
