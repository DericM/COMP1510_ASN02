package q3;

/**
 * <p>Represents a cylinder with a height and radius.</p>
 *
 * @author Deric
 * @version 1.0
 */
public class Cylinder {
    
    /**Height of the Cylinder. */
    private int height;
    /**Radius of the Cylinder. */
    private int radius;
    
    /**
     * Constructor: Sets up this cylinder with the specified parameters.
     * @param height The height of the cylinder
     * @param radius The radius of the cylinder
     */
    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }
    
    /**
     * Calculates the volume of the cylinder.
     * @return the volume
     */
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    /**
     * Calculates the surface area of the cylinder.
     * @return the surface area
     */
    public double surfaceArea() {
        return 2 * Math.PI * (radius + height);
    }
    
    /**
     * Returns a string representation of the cylinder.
     * @return the string that we built.
     */
    public String toString() {
        return "Radius:" + radius 
                + " Height:" + height;
    }
    
    /**
     * Set height.
     * @param height the new height
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    /**
     * Set radius.
     * @param radius the new radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    /**
     * Get height.
     * @return the height of the cylinder
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * Get radius.
     * @return the radius of the cylinder
     */
    public int getRadius() {
        return radius;
    }
    

};
