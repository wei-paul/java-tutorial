import java.util.Scanner;

public class ForLoops {
  public static void main(String[] args) {
    String input = "";
    //Concept: Input is a string (reference type) and so we can not use the comparison operator within reference types. Because this operator will compare the address for a string object (end up having different addresses), not their value.
    //I.e. while (input != "quit") big no.
    Scanner scanner = new Scanner(System.in);
    while (true) {
      //Concept: if using true technique, make sure to have a break statement, otherwise code will run forever. 
      System.out.print("Input: ");
      input = scanner.next().toLowerCase();
      if (input.equals("pass")) {
        continue;
      }
      if (input.equals("quit")) {
        break;
      }
      System.out.println(input);
    }
  }
}