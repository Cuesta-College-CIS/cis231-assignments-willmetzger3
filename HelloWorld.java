import java.util.Arrays;

/**
 * HelloWorld
 */
public class HelloWorld {

    public static void main(String[] args) {
        Boat fastBoat = new Boat(2);
fastBoat.setName("Firebird");
System.out.println(fastBoat);
        
    }
}
        public class Vehicle {
            protected String vehicleName;
            public void setName(String name) {
               vehicleName = name;
            }
            public String toString() {
               return vehicleName;
            }
         }
         public class Boat extends Vehicle {
            private int numEngines;
            public Boat(int num) {
               numEngines = num;
            }
            public String toString() {
               return super.toString() + " " + numEngines;
            } 
         }
        

    