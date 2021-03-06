package day_42_interfaces;



public class ElectricCarTest {

	public static void main(String[] args) {

		//	ElectricCar ec= new ElectricCar(); // Error -can not be instantiated
		Tesla modelS= new Tesla("Model S", 45000,"Grey");
		modelS.charge();
		modelS.start();
		modelS.drive();
		modelS.stop();
		
		System.out.println("=======================");
		
		Ford fusion =new Ford("Fusion", 35000, "Black",2017);
		fusion.charge();
		fusion.drive();
		fusion.start();
		fusion.stop();
		
		System.out.println("=======================");
		
		TeslaSemi semi= new TeslaSemi("Semi", 50000, "Brown",3.5);
		semi.charge();
		semi.drive();
		semi.start();
		semi.stop();
		semi.load("Orange");
		
		System.out.println("=======================");
		
		TeslaTruck tr= new TeslaTruck("CybertekTruck", 100000, "White",6.0);
		
		tr.charge();
		tr.drive();
		tr.load("Java Books");
		tr.start();
		tr.stop();
		
		System.out.println("=======================");
		
		System.out.println(modelS.toString());
		System.out.println(fusion.toString());
		System.out.println(tr.toString());
	

		
	}

}
