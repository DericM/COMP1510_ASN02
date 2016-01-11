package q4;

/**
 * <p>Represents a box with a height width, depth, and boolean 
 * representing if the box is full or not..</p>
 *
 * @author Deric
 * @version 1.0
 */
public class Box {
    
    /**Height of the Cylinder. */
    private int height;
    /**Width of the Cylinder. */
    private int width;
    /**Depth of the Cylinder. */
    private int depth;
    /**Is the cylinder full or not. */
    private boolean full;
    
    /**
     * Constructor: Sets up this box with the specified parameters.
     * Set full to false.
     * @param height The height of the box
     * @param width The width of the box
     * @param depth The depth of the box
     */
    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
    }
    
    /**
     * Returns a string representation of the cylinder.
     * @return the string that we built.
     */
    public String toString() {
        return "Height:" + height 
                + " Width:" + width 
                + " Depth:" + depth 
                + " Full:" + full;
    }
    
    
    
    /**
     * Set height.
     * @param height the new height
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    /**
     * Set width.
     * @param width the new width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Set depth.
     * @param depth the new depth
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * Set full.
     * @param full true or false
     */
    public void setFull(boolean full) {
        this.full = full;
    }
    
    /**
     * Get height.
     * @return the height of the box
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * Get width.
     * @return the width of the box
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * Get depth.
     * @return the depth of the box
     */
    public int getDepth() {
        return depth;
    }
    
    /**
     * Get full.
     * @return full true if the box is full, false if the box is empty.
     */
    public boolean getFull() {
        return full;
    }
    
};
