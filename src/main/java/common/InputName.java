package common;

import java.util.Scanner;

public class InputName {
	String compName = "";

	
	//Add competitor
	public String addCompetitor() {

		boolean active = true;
		String compName = "";
		Scanner sc = new Scanner(System.in);
		
		while (active) {
			System.out.println("");
			System.out.print("Please enter the competitor's name: ");
			compName = sc.nextLine();
			if (!compName.matches(".*[a-�A-�]")) {
				System.out.println("Please only use letters when typing in competitor's name.");

			} else {
				active = false;
			}

		} 
		return compName;
	}


}
