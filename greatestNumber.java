import java.util.Random;


public class greatestNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int x,y,z, max;
        x = rand.nextInt(100);
        y = rand.nextInt(100);
        z = rand.nextInt(100);

        if ((x>y) && (x>z))
            max = x;
        else if ((y>x) && (y>z))
            max = y;
        else 
            max = z;
        System.out.println("The largest number is: " + max);
    }
}