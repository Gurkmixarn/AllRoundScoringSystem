package decathlon;

import common.CalcTrackAndField;
import common.InputResult;

public class DecaJavelinThrow {

	public int score;
	private double A = 10.14;
	private double B = 7;
	private double C = 1.08;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on distance and height. Measured in meters.
	public void calculateResult(double distance) {

		while (active) {

			try {
				// Acceptable values.
				if (distance < 0) {
					System.out.println("Value entered is too low.");
					distance = inputResult.enterResult();
				} else if (distance > 110) {
					System.out.println("Value entered is too high.");
					distance = inputResult.enterResult();

				} else {

					score = calc.calculateField(A, B, C, distance);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please only enter numbers.");
			}
		}
		System.out.println("The score is: " + score);

	}

	public double getScore() {
		return score;
	}
}
