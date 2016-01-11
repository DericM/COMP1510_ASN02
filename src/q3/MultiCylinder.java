package q3;

/**
 * <p>This class builds two cylinder objects and manipulates and prints 
 * their parameters to show the functionality of the cylinder object.</p>
 *
 * @author Deric
 * @version 1.0
 */
public class MultiCylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        
        final int initHeight1 = 4;
        final int initRadius1 = 8;
        final int initHeight2 = 7;
        final int initRadius2 = 3;
        
        final int newHeight1 = 2;
        final int newRadius1 = 3;
        final int newHeight2 = 8;
        final int newRadius2 = 6;
        
        //variables
        Cylinder cylinder1;
        Cylinder cylinder2;
        
        //build cylinder1
        cylinder1 = new Cylinder(initHeight1, initRadius1);
        
        //build cylinder2
        cylinder2 = new Cylinder(initHeight2, initRadius2);
        
        //print
        System.out.println("Build two Cylinders and set "
                + "values using the Constructor:");
        print(cylinder1, 1);
        print(cylinder2, 2);
        System.out.println();
        
        //change cylinder1
        cylinder1.setHeight(newHeight1);
        cylinder1.setRadius(newRadius1);
        
        //change cylinder2
        cylinder2.setHeight(newHeight2);
        cylinder2.setRadius(newRadius2);
        
        //print
        System.out.println("Change the attributes of "
                + "the cylinders using the getters:");
        print(cylinder1, 1);
        print(cylinder2, 2);
        System.out.println();
        
        System.out.println("Question three was called"
                + " and ran sucessfully.");
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param cylinder The cylinder object to print.
     * @param indentifier the number used to distinguish 
     * the cylinder when printing.
     */
    public static void print(Cylinder cylinder, int indentifier) {
        System.out.print("cylinder" + indentifier + " " + cylinder.toString());
        System.out.print(" Volume: " + cylinder.volume());
        System.out.println(" Surface Area: " + cylinder.surfaceArea());
    }
    

};
