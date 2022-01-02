import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Principal: ");
    Scanner principalScanner = new Scanner(System.in);
    byte principal = principalScanner.nextByte();
        
    System.out.print("Annual Interest Rate: ");
    Scanner interestRateScanner = new Scanner(System.in);
    double interestRate = interestRateScanner.nextDouble();

    System.out.print("Period (Years): ");
    Scanner periodScanner = new Scanner(System.in);
    byte period = periodScanner.nextByte();
 
    // M = P ( r (1 + r)^n / (1 + r)^n - 1 )
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(//);
    
    System.out.print("Annual Interest Rate: " + result);
    
  }
}