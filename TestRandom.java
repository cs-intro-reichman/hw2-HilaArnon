// Tests the distribution generated by Java's Math.random() function.
public class TestRandom {
	/*
	 * Second question (15 points) - WHERE??
	 * % java TestRandom 100
	 * > 0.5: 47 times
	 * <= 0.5: 53 times
	 * Ratio: 0.8867924528301887
	 */
	public static void main(String[] args) {
		int loop = Integer.parseInt(args[0]);
		int moreThenHalf = 0, lessThenHalf = 0;
		while (loop > 0) {
			double number = Math.random();
			if (number <= 0.5) {
				lessThenHalf++;
			} else {
				moreThenHalf++;
			}
			loop--;
		}
		System.out.println("> 0.5: " + moreThenHalf);
		System.out.println("<= 0.5: " + lessThenHalf);
		double answer = (double) Math.min(moreThenHalf, lessThenHalf) / Math.max(moreThenHalf, lessThenHalf);
		if (moreThenHalf != 0 && lessThenHalf != 0) {
			System.out.print("Ratio: " + answer);
		}
	}
}
