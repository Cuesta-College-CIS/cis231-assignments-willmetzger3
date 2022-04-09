import java.util.Scanner;
import java.util.Random;

public class programmingQuiz2 {
    
    
    public static int[] constructArray(Scanner scnr)
    {
        int n,j;
        j = scnr.nextInt();
        j++;
        int[]result = new int[j];
        Random rnd = new Random();
        for (n = 0; n < j ; n++)
        {
            result[n] = rnd.nextInt(100);
        }

        return result;
    }

    public static void printArray(int[] array)
    {
        for (int i=0; i<array.length-1;i++)
        {
            System.out.printf(array[i] + " ");
        }
        System.out.println();
    }

    public static int findMoreEvens(int[] n1, int[]n2)
    {
        int cnt,cnt2;
        cnt = cnt2 = 0;
        for (int i=0;i<n1.length; i++)
        {
            if (n1[i]%2==0)
                cnt++;
        }
        for (int i=0;i<n2.length; i++)
        {
            if (n2[i]%2==0)
                cnt2++;
        }
     
        if (cnt>cnt2)
            return 1;
        else 
            return 2;
        
    }

    public static int findGreatest(int[] n1, int[]n2)
    {
        int greatest1, greatest2;
        greatest1 = greatest2 = 0;
        for (int i =0; i<n1.length; i++)
            {
                if (n1[i] > greatest1)
                greatest1 = n1[i];
            }
        for (int i =0; i<n2.length; i++)
            {
                if (n2[i] > greatest2)
                greatest2 = n2[i];
            }
        n1[n1.length-1] = greatest1;
        n2[n2.length-1] = greatest2;
        if (greatest1 >= greatest2)
            return 1;
        else 
            return 2;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] array1, array2;
        array1 = constructArray(scnr);
        array2 = constructArray(scnr);

        printArray(array1);
        printArray(array2);

        int result = findMoreEvens(array1,array2);
        System.out.println("the array " + result + " has more even numbers");
        
        result = findGreatest(array1,array2);
        if (result == 1 )
        {
            System.out.printf("The array " + result);
            System.out.printf(" has the greatest value "+ array1[array1.length - 1]);
        }
        else
        {
            System.out.printf("The array " + result);
            System.out.printf(" has the greatest value "+ array2[array2.length - 1]);
        }
        scnr.close();
        
            }
}
