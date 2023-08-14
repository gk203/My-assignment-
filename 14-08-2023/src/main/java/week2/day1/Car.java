package week2.day1;

public class Car {
	public void driveCar()
	{
		System.out.println("drivecar");
	}
	public void applyBrake(){
		System.out.println("Applybrake");
	}
   public void  soundHorn(){
	   System.out.println("soundhorn");
   }
   
   public static void main(String args[])
   {
	   Car e1 = new Car();
	   e1.driveCar();
	   e1.applyBrake();
	   e1.soundHorn();
	   
	   
   }
}
