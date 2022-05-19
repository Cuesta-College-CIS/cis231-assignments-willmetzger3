import java.util.Scanner;
import java.util.Random;

public class final2 {

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
    }
    public static void threeNum(int[] array)
    {
        int tmp=0, idx=0;
        for (int i=0; i<array.length-2; ++i)
        {
            if ((array[i] + array[i+1] + array[i+2])>tmp){
                tmp = array[i] + array[i+1] + array[i+2];
                idx = i;
            }
        }
        System.out.print(tmp + "\n" + array[idx] + " " + array[idx +1] + " " + array[idx+2]);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = constructArray(sc);
        printArray(arr);
        threeNum(arr);
    }
}
