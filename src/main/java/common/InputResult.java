package common;

import java.util.Scanner;

public class InputResult {
	double inputResult = 0;

	public double enterResult() {
		Scanner sc = new Scanner(System.in);
		boolean active = true;
		while (active) {
			System.out.println("");
			System.out.print("Please enter the result: ");
			try {

				inputResult = Double.parseDouble(sc.nextLine());
				active = false;
			} catch (Exception e) {
				System.out.println("Please only use numbers when typing in the result.");
				
			}

		}
		return inputResult;
	}

	public double returnResult() {
		return inputResult;
	}
}
