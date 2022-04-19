import java.util.Scanner;

public class LabProgram {

	// public static void swap(Number num1, Number num2, Number tmp) {
	// tmp.setNum(num2.getNum());
	// num2.setNum(num1.getNum());
	// num1.setNum(tmp.getNum());
	// }
	public static void swap(Number num1, Number num2) {
		int tmp;
		tmp = num2.getNum();
		num2.setNum(num1.getNum());
		num1.setNum(tmp);
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int int1;
		int int2;
		int1 = scnr.nextInt();
		int2 = scnr.nextInt();
		int tmp1 = 0;
		Number num1 = new Number(int1);
		Number num2 = new Number(int2);
		// Number tmp = new Number(tmp1);
		swap(num1, num2);
		System.out.println("num1 = " + num1.getNum() + ", num2 = " + num2.getNum());
	}
}