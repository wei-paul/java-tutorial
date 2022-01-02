import java.text.NumberFormat;
public class FormatNumber {
  public static void main(String[] args) {
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(1234567.891);
    System.out.println(result);


    String resultX = NumberFormat.getPercentInstance().format(0.1);
    System.out.println(resultX);
  }
}