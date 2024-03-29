package decathlon;

import common.*;

public class Deca110MHurdles {

	public int score;
	private double A = 5.74352;
	private double B = 28.5;

	private double C = 1.92;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	public int getScore() {
		return score;
	}

	// Calculate the score based on time. All running events.
	public void calculateResult(double runningTime) {

		while (active) {

			try {
				// Acceptable values.
				if (runningTime < 10) {
					System.out.println("Value entered is too low.");
					runningTime = inputResult.enterResult();
				} else if (runningTime > 28.5) {
					System.out.println("Value entered is too high.");
					runningTime = inputResult.enterResult();
				} else {
					score = calc.calculateTrack(A, B, C, runningTime);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please only enter numbers.");
			}
		}
		System.out.println("The score is: " + score);

	}

}
