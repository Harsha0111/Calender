import java.util.Arrays;

public class ExampleOne{
	
	public static void main(String args[]) {
		int k = 15;
		int[] numbers = {-5,1,-40,20,6,8,7};
		int size = 

		// 7,8 & 20 ,-5 (o/p)	
		//method calling in boolean to check the condition is true / false
		
		boolean check = match(numbers, k);
		
		
	}
	
	private static boolean match(int[] array, int k) {
	
		//System.out.println(k);
		//Arrays.sort(array);
		//System.out.println(Arrays.toString(array)); 

		//return true;
			
 	for (int i = 0; i < (size - 1); i++) {
          for (int j = (i + 1); j < size; j++) {
              if (A[i] + A[j] == x) {
                  System.out.println("Pair with a given sum " + x +
                                     " is (" + A[i] + ", " + A[j] + ")");
   
                  return true;
              }
          }
      }
 
      return false;
  }
	

}
