import java.util.Random;


public class ascendingOrder {
    public static void main(String[] args) {
        Random rand = new Random();
        int x,y,z,min=0,mid=0,max=0;
        x = rand.nextInt(100);
        y = rand.nextInt(100);
        z = rand.nextInt(100);
       
        
        
        if(x<y && x<z)
            min = x;
        else if ((x<y && x>z) || (x>y && x<z))
            mid = x;
        else 
            max = x;
        if(y<z && y<x)
            min = y;
        else if ((y<x && y>z) || (y>x && y<z))
            mid = y;
        else 
            max = y;
        if(z<y && z<x)
            min = z;
        else if ((z<x && z>y) || (z>x && z<y))
            mid = z;
        else 
            max = z;
        
        
        
        System.out.println("the smallest number is " + min);
        System.out.println("the middle number is " + mid);
        System.out.println("the largest number is " + max);

    }
}
