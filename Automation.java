package week6.day1;

public class Automation extends MultipleLanguage{

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}
	
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}
	public static void main(String[] args) {
		Automation get = new Automation();
		get.java();
		get.selenium();
		get.ruby();
		get.python();
	}

}
