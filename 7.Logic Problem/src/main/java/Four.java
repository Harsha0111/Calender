public class Four {
    public static void main(String[] args) {
       int m = 9, n= 11;

    swap(m,n);
    }
    public  static  void swap(int m , int n) {
        int temp = m;
        m =n;
        n = temp;
        System.out.println("Value of m " + m + "Value of n " + n);
    }
}
