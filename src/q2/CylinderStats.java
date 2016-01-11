package q2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p>Read a radius and a height from the user and calculate the surface area
 * and volume of a cylinder, and then print the results.</p>
 *
 * @author Deric
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        
        //initialize variables
        int radius;
        int height;
        double surfaceArea;
        double volume;
        
        //utilities
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        
        //Get radius, height
        System.out.print("Enter the radius: "); 
        radius = scan.nextInt();
        System.out.print("Enter the height: "); 
        height = scan.nextInt();
        
        //calculate surface area and volume
        surfaceArea = 2 * Math.PI * (radius + height);
        volume = Math.PI * Math.pow(radius, 2) * height;
        
        //print results
        System.out.println("Surface area: " + df.format(surfaceArea));
        System.out.println("Volume: " + df.format(volume));
        
        System.out.println("Question two was called and ran sucessfully.");
    }

};
