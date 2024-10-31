package k17lopPackega;

public class SinhVien {
    protected int MaSoSinhVien;
    String Ten;
    String HoLot;
    public SinhVien()
    {
        this.MaSoSinhVien=-1;
        this.Ten="";
        this.HoLot="";
    }
    public SinhVien(int m,String t , String h)
    {
        this.MaSoSinhVien=m;
        this.Ten=t;
        this.HoLot=h;
    }

    public voi HienThi() {
        System.out.println(this.MaSoSinhVien);
        System.out.println(this.HoLot);
        System.out.println(this.Ten);
    }

    public static void ThongBao()
    {
        System.out.println();
    }
}
