import java.util.Scanner;

public class ReadingInput {
  public static void main(String[] args) {
    //To work with the data from terminal use System.in
    System.out.print("Age: ");
    Scanner scanner = new Scanner(System.in);
    byte age = scanner.nextByte();
    System.out.println("You are " + age + " years old");
    System.out.print("Name: ");
    Scanner nameScanner = new Scanner(System.in);
    String name = nameScanner.nextLine().trim(); //CONCEPT: if you use .next() only, it will only read the first token (assuming you want to input full name, with spaces.)
    System.out.println("Your name is " + name);
  }
}