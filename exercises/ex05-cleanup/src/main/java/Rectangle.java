/**
 * Represents a rectangle with a width and a height.
 */
public class Rectangle {

  private double width;
  private double height;

  /**
   * Constructs a rectangle with the specified width and height.
   *
   * @param width  the width of the rectangle
   * @param height the height of the rectangle
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return the area of this rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales this rectangle by the specified factor.
   *
   * @param factor the scaling factor
   */
  public void scale(double factor) {
    width *= factor;
    height *= factor;
  }

  /**
   * Determines whether this rectangle has a larger area
   * than the specified rectangle.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has a larger area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}