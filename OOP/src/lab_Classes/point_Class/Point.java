package lab_Classes.point_Class;

public class Point {

  private double x;
  private double y;

  public Point() {
    this(2.000);
  }

  public Point(double x) {
    this(x, x);
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void display() {
    System.out.printf("Point is at coordinates x = %.2f and y = %.2f.", x, y);
    System.out.println();
  }

  public void translate(double x, double y) {
    this.x += x;
    this.y += y;

    System.out.printf("Point is translated at coordinates x = %.2f and y = %.2f.", getX(), getY());
    System.out.println();
  }
}
