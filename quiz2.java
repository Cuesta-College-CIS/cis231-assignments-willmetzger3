import java.util.Arrays;
import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
        int i,sum=0,sum1=0;
		final int L = 3; // will NOT use L. Just for the extendability.
		final int M = 3;
		final int N = 2;
		int[][] matrix1 = { { 2, 5, 10 },
				{ 3, 6, 9 },
				{ 1, 2, 3 } };
		int[][] matrix2 = { { 10, 20 },
				{ 30, 40 },
				{ 50, 60 } };
		int rowidx = scnr.nextInt();

            for (i=0; i<M; i++)
                sum += matrix1[rowidx][i] * matrix2[i][0];
            for (i=0; i<M; i++) 
                sum1 += matrix1[rowidx][i] * matrix2[i][1];
        System.out.println(sum + " " +sum1);


	}

}