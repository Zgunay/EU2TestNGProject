package day24Arrays;

import java.util.Scanner;

public class Task87Day {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		String[] day= new String[7];
		day[0]="Monday";
		day[1]="Tuesday";
		day[2]="Wednesday";
		day[3]="Thursday";
		day[4]="Friday";
		day[5]="Saturday";
		day[6]="Sunday";
		System.out.println("ENTER YOUR INDEX");
		int index=sc.nextInt();		
		sc.nextLine();
		System.out.println("Today is " + day[index]);
		
		
	}

}
