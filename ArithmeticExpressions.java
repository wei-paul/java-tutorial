public class ArithmeticExpressions {
  
  public static void main(String[] args) {
    double result  = (double)10 / (double)3;
    int x = 1;
    /*Concept: depending on the prefix or suffix ++x or x++, the value of y will be different.
    x++ will mean that y will be copy x value as is originally BEFORE the increment
    ++x will mean that y will copy x value AFTER the increment*/
    int y = x++;
    System.out.println(x);
    System.out.println(y);
    System.out.println(result);


  }
}