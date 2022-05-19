import java.util.Scanner;

public class Lab515 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] userValues = new int[20];
		int i, n;// List of integers from input
		// n = 20;
		// for (i = 0; i <= n + 1; i++) {
		// Chaging the condition criteria might be harmful to make consistent logic

		// userValues[i] = scnr.nextInt();
		// if (i == 0)
		// n = userValues[i];

		// Chaging the condition criteria might be harmful to make consistent logic
		// Instead of
		// if (i == 0)
		// n = userValues[i];
		// n = scnr.nextInt( ); before the loop

		// - - - - - - - - - - - - - - - - - - - -
		// check out this code

		n = scnr.nextInt();
		for (i = 0; i < n; i++) {
			userValues[i] = scnr.nextInt();
		}
		int threshold = scnr.nextInt();

		// System.out.printf(userValues[i] + ",");

		for (i = 0; i < n; i++) {
			if (userValues[i] < threshold)
				System.out.printf(userValues[i] + ",");
		}
		// for (i = 1; i <= n; i++) {
		// if ((i > 0) && (i != n + 1) && (userValues[i] <= userValues[n + 1]))
		// System.out.printf(userValues[i] + ",");

		// }
		System.out.printf("\n");

	}
}
