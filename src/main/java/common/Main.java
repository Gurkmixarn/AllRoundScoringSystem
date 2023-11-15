package common;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean choice = true;
		while (choice == true) {
			InputName inputName = new InputName();
			inputName.addCompetitor();

			SelectDiscipline selectDiscipline = new SelectDiscipline();
			selectDiscipline.inputSelection();

			Scanner scanner = new Scanner(System.in);
			String userInput;

			while (true) {
				System.out.println("");
				System.out.print("Do you want to enter another competitor, please enter 'yes' or 'no': ");
				userInput = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case insensitivity

				if (userInput.equals("yes")) {
					break;
				} else if (userInput.equals("no")) {
					choice = false;
					break;
				} else {
					System.out.println("Invalid input. Please enter 'yes' or 'no': ");
				}
			}
		}

	}
}
