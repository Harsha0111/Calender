import java.util.Date;
import java.awt.*;
import java.util.Arrays;

public class Age {
 public static void main(String args[]) {

	//int age= 30;
	int temperature= 20;
	//age = 40;
	//int herAge= age;
	byte age =30;
	
	System.out.println(age + "\n" + temperature);

	long viewsCount =120_344_669L;
	float price = 10.44F;
	char letter = 'H';
	String name = "HARSHA";
	boolean isEligible = false;
	
	System.out.println( viewsCount  + "\n" + letter + "\n" + price + "\n" + name + "\n" + isEligible);
	 
	// import date
	Date now = new Date();
	
	System.out.println(now);	

	byte x =1;
	byte y = x;
	x =2;
		
	System.out.print(x);	


	//import awt
	Point point1 = new Point(8, 9);
	Point point2 = point1;
	point1.x =2;
	System.out.println(point2); 
	
	String message = " Hello World !!!";

	System.out.println(message); 
	System.out.println(message.endsWith("!!!")); 
	System.out.println(message.startsWith("!!!")); 
	System.out.println(message.length());
 	System.out.println(message.indexOf("H"));  
	System.out.println(message.replace("!","*")); 
	System.out.println(message.toLowerCase()); 
	System.out.println(message.toUpperCase()); 

	String message1= "      Meow World "+"  !  !!  ";
	
	System.out.println(message1); 
	System.out.println(message1.trim()); 
	 
	// Code "March"
	String message2= "Code \"March\" ";
		
	System.out.println(message2); 
	
	// c:\Windows\...
	String message3= "c:\n \t Windows\\.... ";
	
	System.out.println(message3); 

	//import Array
	int[] numbers = new int[5];
	numbers[0] = 2;
	numbers[1] = 3;
	numbers[2] = 4;
	
	System.out.println(Arrays.toString(numbers)); 

	//length ->curly brasis
	int[] numbers1 ={19,3,4,5,8,6,12};

	//sorting num into oder		
	Arrays.sort(numbers1);
	
	System.out.println(Arrays.toString(numbers1));

	//3d Array ->instead of toString use "deepToString"(Rows(1),Column(2))
	//int[] [] numbers2 = new int[1][2];

	//Array format
	int[] [] numbers2 = {{1,2,3}, {4,5,6}};


	//setting value to 1st row and 1st col
	numbers2 [0] [0]  = 2; 
	  
	System.out.println(Arrays.deepToString(numbers2));

	 // constant
	final float pi = 31.4F;
	System.out.println(pi);

	//function(+,-,*,/)
	int result = 10+3;

	// double
	double result1 =(double)10 /(double)3;
	System.out.println(result1);


	// increment model (++s) = (s ++) 
	// post na x ku matum increment pre na tan initially  
	int s = 4;

	// post na r = s value so r =4
	//int r = s++;

	// pre so initially s = 5 and r=5
	//int r =++s;
	
	//s = s+2;
	s += 2;
	System.out.println(s);
	//System.out.println(r);


	//Implict Casting
	// byte > short > int > long > float >    double
	
	short  e = 1;
	int f = e + 2;
	 
	double g = 1.1;
	double h = g +2 ;

	System.out.println(h );
	


	

	}
}