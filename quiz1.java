
import java.util.Arrays;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		final int CNT = 5;
		int minval=100, minidx=0, tmp=0,i,j,f;
 
		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int[] numbers = new int[N];
		for (i = 0; i < N; i++)
			numbers[i] = scnr.nextInt();
        for (j = 0; j < CNT; j++)
        {
            minval = 100;
            for (i = j; i < N; i++)
                if (numbers[i]<minval) 
                {
                    //System.out.println("one iteration");
                    minval = numbers[i];
                    minidx = i;
                    tmp = numbers[j];
                }
            numbers[j] = minval;
            numbers[minidx] = tmp;
            for (f = 0; f < N; f++)
                System.out.printf("%d ",numbers[f]);
            System.out.println();

        }
                /*
                    minidx = i;
                    minval = numbers[i];
                    tmp = numbers[0];
                    numbers[0] = numbers[i];
                    numbers[i] = tmp;
                */

        /*
        System.out.println(minidx);
        System.out.println(minval);
        System.out.println(tmp);
        System.out.println();
        */
		

		scnr.close();
	}

}