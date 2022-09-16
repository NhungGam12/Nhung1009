package lesson4;
import java.util.Scanner;

public class Bai2sanpham {
    public static void main(String [] args)
    {
        int i=1;
        boolean co=false;
        String kytu;
        sanpham sp = new sanpham();
        //sanpham sp2 = new sanpham();
        do {
            co=false;
            sp.Nhapsp(i);
            i++;
            System.out.printf("Có tiếp tục thêm sản phẩm? (Y/N): ");
            Scanner scan = new Scanner(System.in);
            kytu = scan.nextLine();
            if (kytu.equals("Y") || kytu.equals("y")) { co = true;}
        } while (co == true);
    }
}
