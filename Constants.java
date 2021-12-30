public class Constants {
  
  public static void main(String[] args) {
    //Concept: use final for constants that can't be changed later. Naming convention for constants: (use all caps. i.e. PI, MONEY)
    final float PI = 3.14F;
    //PI = 2.14F; can't be reassigned due to "final"
    System.out.println(PI);
  }
}