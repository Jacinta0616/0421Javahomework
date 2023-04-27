// public class a0421{
//     public static void main(String[] args) throws Exception{
//         String a=new String(new inputstring(System.in));

//         String src;
//         String pat;
//         String rep;

//         System.out.print("請輸入出生年月日");
//         src = br.readLine();
//         pat = br.readLine("\\d{4},\\d{2},,\\d{2}");

//         System.out.println(src.replaceAll(pat));
        
//     }
// }

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class a0421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入日期: ");
        String input = scanner.nextLine();

        LocalDate date;
        try {
            if (input.contains("/")) {
                date = LocalDate.parse(input, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            } else {
                date = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
            }
            System.out.printf("您輸入的日期是: %d年%d月%d日", date.getYear(), date.getMonthValue(), date.getDayOfMonth());
        } catch (Exception e) {
            System.out.println("日期格式錯誤。");
        }
    }
}
