package week2.day1;

import java.util.Arrays;
public class Firstsecondlargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int a = data.length;
		Arrays.sort(data);
		System.out.println("The Second Largest Number is " + data[a-2]);
	}

}
