public class MyStrings {
  
  public static void main(String[] args) {
    //Concept: String is a reference type. However, because it is used so commonly, the short hand looks like a primitive because we're not using a new Operator.
    String message = " Hello \"world\"" + "!!  ";
    String openingLyrics = "Yesterday, all my troubles seemed so far away";
    System.out.println(message.length());
    System.out.println(message.indexOf("H"));
    System.out.println(message.indexOf("wee"));
    System.out.println(message.replace("!", "*"));
    System.out.println(message.trim());
    System.out.println(openingLyrics);
  }
}