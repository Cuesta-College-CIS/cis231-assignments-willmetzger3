import java.util.Scanner;

public class lab425 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int cnt = 0, i;
		char max_char, x = 'B';
		max_char = ' ';
		String strInput;
		strInput = scnr.nextLine();
		// System.out.println(strInput);

		strInput = strInput.toLowerCase();
		for (i = 0; i < strInput.length(); i++) {
			x = strInput.charAt(i);

			if (Character.isLetter(x) && (x > max_char))
				// if ((x > max_char) && (((x >= 'a') && (x <= 'z')) || ((x >= 'A') && (x <=
				// 'Z'))))
				max_char = strInput.charAt(i);
			// System.out.println(max_char);

			// if (((x >= 'a') && (x <= 'z')) || ((x >= 'A') && (x <= 'Z')))
			if (Character.isLetter(x))
				cnt++;
		}
		// Use the below line to print the result.
		System.out.printf("%d\t%c\n", cnt, Character.toUpperCase(max_char));
		scnr.close();
	}
}
