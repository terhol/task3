package se.terhol;


/**
 * Interface for shapes which can be drawn
 *
 * @author Jan Papousek
 */
public interface Measurable {

    /**
     * It returns the perimeter of the shape.
     *
     * @return perimeter in cm
     */
    double getPerimeter();

    /**
     * It returns the area of the shape.
     *
     * @return area in cm^2
     */
    double getArea();
}
