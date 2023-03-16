import java.util.Scanner;
public class InputPeso {
  private Scanner scanner;
  public InputPeso() {
      scanner = new Scanner(System.in);
  }
  public double readDouble(String prompt) {
      System.out.println(prompt);
      return scanner.nextDouble();
  }
}
