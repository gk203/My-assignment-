package week1.day2;

public class postivetonegative {

	public static void main(String[] args) {
		int number = -40;
		
		if(number<0)
		{
			int positve = number * -1;
			
			System.out.println("Negative number:"+number);
			System.out.println("converted to postive number:"+positve);
			
		}
		else
		{
			System.out.println("Number neither postive or negative");
		}
	}

}
