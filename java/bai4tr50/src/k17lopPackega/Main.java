package k17lopPackega;

public class Main{
    public static void main(String args[])
    {
        SinhVien.ThongBao();
        SinhVien sv=new SinhVien(m: 1,t: "minh",h: "lam");

        sv.HienThi();
        SinhVien sv2= new SinhVien(m:2, t:"kai", h:"van");
        sv2.HienThi();
    }

}