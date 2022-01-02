public class Casting {
  
  public static void main(String[] args) {
    //Implicit casting 
    //byte > short > int > long > float > double
    // double x = 1.1;
    // double y = x + 2; This 2 = 2.0 

    // double x = 1.1;
    // //Explicit casting where 
    // int y = (int)x + 2;

    String x = "1.1";
    double y = Double.parseDouble(x) + 2;
    System.out.println(y); 
  }
}