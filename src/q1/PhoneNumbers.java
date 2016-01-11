package q1;


import java.util.Random;

/**
 * <p>This program generates a phone number according to 
 * several restrictions.</p>
 * <ul> 
 * <li> number format: XXX-XXX-XXXX</li>
 * <li>the first 3 digits cannot contain 8 or 9</li>
 * <li>the second set of 3 digits must not be more than 635</li>
 * </ul>
 *
 * @author Deric
 * @version 1.0
 */
public class PhoneNumbers {
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        
        //these are all exclusive
        final int section1Max = 8;
        final int section2Max = 636;
        final int section3Max = 10000;
        
        //variables
        String section1;
        String section2;
        String section3;
        String number;
        
        //utilities
        Random rand = new Random();
        
        //build each section according to their specifications
        section1 = "" + rand.nextInt(section1Max) + rand.nextInt(section1Max) 
            + rand.nextInt(section1Max);
        section2 = String.format("%03d", rand.nextInt(section2Max));
        section3 = String.format("%04d", rand.nextInt(section3Max));
        
        //put the sections together
        number = section1 + "-" + section2 + "-" + section3;
        
        //print results
        System.out.println(number);
        
        System.out.println("Question one was called and ran sucessfully.");
        
    }
};
