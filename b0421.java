import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b0421 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("請輸入電子郵件：");
    String email = scanner.nextLine();
    boolean isValid = validateEmail(email);
    if (isValid) {
      System.out.println("有效");
    } else {
      System.out.println("無效");
    }
  }

  public static boolean validateEmail(String email) {
    String regex = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }
}
