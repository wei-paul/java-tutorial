import java.util.Scanner;

//If the number is divisible by 3, return buzz,
//If the number is divisible by 5, return fizz,
//If the number is divisble by both 3 and 5, return fizzbuzz
//If the number is not divisible by either 3 or 5, return number.
public class FizzBuzz {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: ");
    int number = scanner.nextInt();
    if (number % 3 == 0 && number % 5 == 0) {
      System.out.println("FizzBuzz");
    } else if (number % 3 == 0) {
      System.out.println("Buzz");
    } else if (number % 5 == 0) {
      System.out.println("Fizz");
    } else {
      System.out.println(number);
    }
  }
}
