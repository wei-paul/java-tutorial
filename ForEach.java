public class ForEach {
  public static void main(String[] args) {
    String[] fruits = { "Apple", "Mango", "Orange" }; 

    for (int i = fruits.length - 1; i >= 0; i--) {
      System.out.println(fruits[i]);
    }
    System.out.println("------");
    for (String fruit: fruits) {
      System.out.println(fruit);
    }
  }
}