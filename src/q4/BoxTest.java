package q4;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class BoxTest {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        
        //initialize
        final int initHeight1 = 4;
        final int initWidth1 = 8;
        final int initDepth1 = 9;
        final int initHeight2 = 7;
        final int initWidth2 = 3;
        final int initDepth2 = 3;
        
        final int newHeight1 = 2;
        final int newWidth1 = 3;
        final int newDepth1 = 2;
        final int newHeight2 = 8;
        final int newWidth2 = 6;
        final int newDepth2 = 7;
        
        Box box1;
        Box box2;
        
        //build the boxes
        box1 = new Box(initHeight1, initWidth1, initDepth1);
        box2 = new Box(initHeight2, initWidth2, initDepth2);
        
        //print the boxes
        System.out.println("Build two box objects, and set the "
                + "values with their constructors:");
        System.out.println("box1 " + box1.toString());
        System.out.println("box2 " + box2.toString());
        
        //modify box1 and 2
        modify(box1, newHeight1, newWidth1, newDepth1, true);
        modify(box2, newHeight2, newWidth2, newDepth2, true);
        
        //print to show modifications with setter methods
        System.out.println();
        System.out.println("After modifying each box with "
                + "their respective setter methods:");
        System.out.println("box1 " + box1.toString());
        System.out.println("box2 " + box2.toString());
        
        //print to show functionality of getter methods
        System.out.println();
        System.out.println("The following will demopnstrate "
                + "each getter method for box1");
        getterPrint(box1);
        System.out.println();
        
        System.out.println("Question four was called and ran sucessfully.");
    }
    
    /**
     * <p>Modify a box object with the given parameters.</p>
     *
     * @param box The box object to modify.
     * @param newHeight the new height
     * @param newWidth the new width
     * @param newDepth the new depth
     * @param full true if the box is full, false if not
     */
    public static void modify(Box box, int newHeight, 
            int newWidth, int newDepth, boolean full) {
        box.setHeight(newHeight);
        box.setWidth(newWidth);
        box.setDepth(newDepth);
        box.setFull(full);
    }
    /**
     * <p>Print a box using its getters.</p>
     *
     * @param box The box object to modify.
     */
    public static void getterPrint(Box box) {
        System.out.println("Height:" + box.getHeight());
        System.out.println("Width:" + box.getWidth());
        System.out.println("Depth:" + box.getDepth());
        System.out.println("Full:" + box.getFull());
    }

};
