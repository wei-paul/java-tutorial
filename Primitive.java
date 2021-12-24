
public class Main {
  public static void main(String[] args) {
    //Concept: important to think about what primitive types to use so we can save memory.
    //I.e. we're talking about age here so there's no reason to use int age = 30. (int (goes up to 2B) takes 4 bytes of memory whereas byte takes 1)
    byte age = 30;
    //Concept: Numbers in java will be automatically set as int. (limit of 2B). So if you want numbers bigger than that, you Need to add L to the end
    long viewsCount = 45_123_412_321L;
    //Concept: Java automatically sees decimal point as a "double" type (8 bytes of memory). We can use float (4 bytes of memory) for that by adding F;
    float price = 10.99F;
    //Concept: Store one letter in single quotes, and strings in double quotes
    char letter = 'A';
    System.out.println(letter);
  }
}