import java.util.Date;
import java.awt.*;
public class Reference {
  public static void main(String[] args) {
    //Concept: When dealing with reference types (complex objects) you need to allocate memory (using the new)
    Date now = new Date();
    System.out.println(now);
    //Concet: Difference between storing primitive type data and reference type data is that the reference type will store the ADDRESS of the memory. Compared to the VALUE (primitive type).
    Point point1 = new Point(1, 1);
    Point point2 = point1;
    point1.x = 2;
    System.out.println(point2);
  }
}