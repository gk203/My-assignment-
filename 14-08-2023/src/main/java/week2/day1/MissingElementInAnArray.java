package week2.day1;

public class MissingElementInAnArray {

	public static void main(String[] args) {
         int[] arr = {1, 2, 3, 4, 7, 6, 8};
        
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println("The missing element is: " + (i + 1));
                break;
            
            }
	   }
	}
}
