package day35Encaplation;

public class CarpetTest {

	public static void main(String[] args) {
		Floor f   =new Floor(10,20);
		Carpet c  =new Carpet(5.2);
		
		Calculator   cal     = new Calculator(f, c);
		// Calculator cal = new Calculator(new Floor(10,20), new Carpet(5.2));
		System.out.println(cal.getTotalCost());
		
		
		
		
	}

}
