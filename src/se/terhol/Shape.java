package se.terhol;

/**
 * Interface for geometric shapes.
 *
 * @author Jan Papousek
 */
public interface Shape {

    /**
     * It returns the color of the shape.
     *
     * @return Name of the color
     */
    String getColor();

    /**
     * It returns maximal height of the shape.
     *
     * @return maximal height in cm
     */
    double getHeight();

    /**
     * It returns maximal width of the shape.
     *
     * @return maximal width in cm
     */
    double getWidth();

    /**
     * It returns a string representation of the shape.
     * The returned value has pattern '<color> <type of shape>',
     * e.g. "red shape", "blue circle", etc.
     *
     * @return string representation of the shape
     */
    String toString();
}
