public class SingleInheritance {
    public static void main(String[] args) {
        ChildInheritance parentInheritance = new ChildInheritance();
        parentInheritance.a =  5;
        parentInheritance.b =  10;
        int c = parentInheritance.add();

        ChildTwoInheritance parentOneInheritance = new ChildTwoInheritance();
        parentOneInheritance.a = 5;
        parentOneInheritance.b = 9;
        int d = parentOneInheritance.sub();
        System.out.println(c +" " + d);
    }
}
