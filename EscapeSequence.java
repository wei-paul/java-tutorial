public class EscapeSequence {
  
  public static void main(String[] args) {
    // c:\Windows\...
    String message = "c:\\Windows\\...";
    String messageNewLine = "c:\nWindows\\...";
    /*c:
      Windows\...*/
    String messageNewTab = "c:\tWindows\\...";
    //c:  Windows\...
    System.out.println(message);
    System.out.println(messageNewLine);
    System.out.println(messageNewTab);
  }
}