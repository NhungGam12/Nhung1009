package lesson4;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class sanpham {
    String spID, tensp;
    double dongia, giamgia;
    public sanpham() {
    }
    public sanpham(String spID, String tensp, double dongia, double giamgia)
    {
        super();
        this.spID = spID;
        this.tensp = tensp;
        this.dongia = dongia;
        this.giamgia = giamgia;
    }

    public String getSpID (){
        return spID;
    }
    public void setSpID  (String spID)
    {
        this.spID=spID;
    }
    public String getTensp (){
        return tensp;
    }
    public void setTensp(String tensp)
    {
        this.tensp=tensp;
    }
    public double getDongia (){
        return dongia;
    }
    public void setDongia(double dongia)
    {
        this.dongia=dongia;
    }
    public double getGiamgia (){
        return giamgia;
    }
    public void setGiamgia(double giamgia)
    {
        this.giamgia=giamgia;
    }
    public double getthuenhapkhau()
    {
        return 0.1*(this.dongia-this.giamgia);
    }
    public void Nhapsp(int i) {
        Scanner scanner = new Scanner(System.in);
            sanpham sp = new sanpham();
            System.out.printf("Nhập mã ID sản phẩm " + i + " :");
            sp.setSpID(scanner.nextLine());
            System.out.println("Nhập tên sản phẩm thứ " + i + " :");
            sp.setTensp(scanner.nextLine());
            System.out.println("Nhận đơn giá sp thứ " + i + " :");
            sp.setDongia(scanner.nextDouble());
            System.out.println("Nhập giảm giá sp thứ " + i + ":");
            sp.setGiamgia(scanner.nextDouble());
            sp.Xuatsp();
    }
    public void Xuatsp()
    {
        // Xuất ra đúng định dạng
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);
        System.out.println("Tên sản phẩm: "+ tensp);
        System.out.println("Đơn giá: "+ en.format(dongia));
        System.out.println("Giảm giá :"+ en.format(giamgia));
        System.out.println("Thuế nhập khẩu: "+en.format(getthuenhapkhau()));
    }
   }
