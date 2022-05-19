import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class final1 {

    public static int[] constructArray(Scanner sc)
    {
        int n,j;
        j = sc.nextInt();
        ++j;
        int[]result = new int[j];
        Random rnd = new Random();
        for (n = 0; n < j ; ++n)
        {
            result[n] = rnd.nextInt(99);
        }
        return result;
    }
    public static void printArray(int[] array)
    {
        for (int i=0; i<array.length-1;++i)
        {
            System.out.printf(array[i] + " ");
        }
        System.out.println();
        System.out.print("the median value is: " + array[(array.length/2)-1]);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = constructArray(sc);
        Arrays.sort(arr);
        printArray(arr);
    }
}
