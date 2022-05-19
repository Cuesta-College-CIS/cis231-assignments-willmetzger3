import java.util.Scanner;

public class lab423 {
	public static void main(String[] args) {

		int sum = 0, num1 = 0, totalAmt = 0, max = 0, min = 20;
		float avg = 0;
		Scanner scnr = new Scanner(System.in);
		num1 = scnr.nextInt();

		// The max and min could be initialized with the first input
		max = num1;
		min = num1;

		// No need to test the below condition
		// if (num1 <= -1) {
		// sum = 0;
		// avg = 0;
		// }

		while (num1 >= 0) {
			if (num1 > max)
				max = num1;
			if (num1 < min)
				min = num1;
			sum += num1;
			totalAmt++;
			num1 = scnr.nextInt();
			// System.out.println(sum);
		}
		sum = sum - max - min;
		// System.out.println(sum);
		if (totalAmt > 0)
			avg = (float) sum / (float) (totalAmt - 2);
		if (totalAmt <= 2) {
			sum = 0;
			avg = 0;
		}
		// System.out.println(max);
		// System.out.println(min);
		// System.out.println(totalAmt);

		System.out.printf("%d %.2f\n", sum, avg);
		scnr.close();
	}
}