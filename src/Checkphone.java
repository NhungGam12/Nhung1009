import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Checkphone {
    public static void main(String[] args)
    {
      String phoneRegex= "(0|84|\\+84)((8[0-689]\\d)|(9[0-46-8]\\d)|(3[2-9]\\d)|(5[68]\\d)|(7[06-9]\\d))((\\.|-)?)(\\d{3})((\\.|-)?)(\\d{3})";
      Pattern pattern= Pattern.compile(phoneRegex);
      Scanner scanner= new Scanner(System.in);
      System.out.println("Nhập số điện thoại:");
      String phone = scanner.nextLine();
      int size = phone.length();
      String s = "";
      s=phone.substring(0,3);
      if((size==10 && pattern.matcher(phone).find()))
      {
          System.out.println("Số "+ phone + " đúng định dạng");
          switch(s)
          {
              case "088": case "091": case "094": case "083": case "084": case "085": case "081": case "082":
                {
                System.out.printf("Số điện thoại " + phone + " mạng vinaphone");
                }break;
              case "089": case "090": case "093": case "070": case "079": case "077": case "076": case "078":
                {
                    System.out.printf("Số điện thoại " + phone + " mạng mobile phone");
                }break;
              case "092": case "056": case "058":
                {
                    System.out.printf("Số điện thoại " + phone + " mạng Vietnam mobile");
                }break;
              case "086": case "096": case "097": case "098": case "032": case "034": case "035": case "036":
              case "037": case "038": case "039":
                {
                    System.out.printf("Số điện thoại " + phone + " mạng Viettel");
                }break;
              default:
                  break;
          }
      }
      else
          System.out.println("Số " + phone + " không đúng định dạng");
    }
}
