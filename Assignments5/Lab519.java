import java.util.Scanner;

public class Lab519 {
	public static void main(String[] args) {
		int length = 5;
		int[] numbers = { 5, 20, 30, 35, 50, 0, 0, 0, 0, 0 };
		int insert_value, idx;

		Scanner scnr = new Scanner(System.in);
		insert_value = scnr.nextInt();

		for (idx = 0; idx < length; idx++) {
			if (insert_value < numbers[idx]) {
				break;
			}
		}
		for (int i = length - 1; i >= idx; i--)
			numbers[i + 1] = numbers[i];
		numbers[idx] = insert_value;
		if (length < numbers.length)
			length += 1;

		for (int i = 0; i < length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		scnr.close();
	}

}
