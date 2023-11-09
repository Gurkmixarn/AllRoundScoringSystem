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

			if (compName.trim().isEmpty()) {
				System.out.println("Competitor's name cannot be empty.");
			} else if (!compName.matches("^[\\p{L} \\p{M}]+$")) {
				System.out.println("Please only use letters, spaces, and åäöÅÄÖ when typing in the competitor's name.");
			} else {
				active = false;
			}
		}

		return compName;
	}
}