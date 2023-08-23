package week3day3;

public class Automation extends MultipleLangauge implements Language,TestTool {

	

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation AM = new Automation();
		AM.python();
		AM.Selenium();
		AM.java();
		AM.ruby();
		

	}

}
