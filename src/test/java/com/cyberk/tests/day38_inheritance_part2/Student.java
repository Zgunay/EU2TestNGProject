package day38_inheritance_part2;

public class Student extends Person {

	@Override
	public void message() {
	
		System.out.println("This is student Class");
	}
	
	public void display() {
		
		message();
		super.message();
	}

}
