package lab_Classes.point_Class;

public class Main {

  public static void main(String[] args) {
    Point point = new Point();

    point.display();
    point.translate(2, 3);

    Point point1 = new Point(2);

    point1.display();
    point1.translate(2, 3);

    Point point2 = new Point(4, 5);

    point2.display();
    point2.translate(2, 3);
  }
}
