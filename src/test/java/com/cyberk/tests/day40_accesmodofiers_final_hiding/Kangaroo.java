package day40_accesmodofiers_final_hiding;

public class Kangaroo extends Marsupial{
	public static boolean isBiped() {
		return true;
	}
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}

}
