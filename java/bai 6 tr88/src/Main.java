class MyPham {
    String tenmp;
    String nhasx;
    int dongia;

    // Hàm khởi tạo mặc định
    public MyPham() {
    }

    // Hàm khởi tạo với các đối số
    public MyPham(String tenmp, String nhasx, int dongia) {
        this.tenmp = tenmp;
        this.nhasx = nhasx;
        this.dongia = dongia;
    }

    // Phương thức giaBan
    public double giaBan() {
        return dongia + dongia * 0.05;
    }

    // Phương thức tính thanhTien
    public double thanhTien(int soluong) {
        return soluong * dongia;
    }

    // Phương thức xuất thông tin
    public void xuat() {
        System.out.println("Tên mỹ phẩm: " + tenmp);
        System.out.println("Nhà sản xuất: " + nhasx);
        System.out.println("Đơn giá: " + dongia);
    }
}

// Lớp con DauGoi kế thừa từ lớp MyPham
class DauGoi extends MyPham {

    public DauGoi() {
    }

    public DauGoi(String tenmp, String nhasx, int dongia) {
        super(tenmp, nhasx, dongia);
    }

    // Ghi đè phương thức giaBan
    @Override
    public double giaBan() {
        return dongia * 1.5f;
    }

    // Ghi đè phương thức thanhTien
    @Override
    public double thanhTien(int soluong) {
        double tt = soluong * dongia;
        return tt + tt * 0.05;
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng MyPham
        MyPham mp = new MyPham("Kem dưỡng da", "Công ty ABC", 100000);
        System.out.println("Thông tin mỹ phẩm:");
        mp.xuat();
        System.out.println("Giá bán: " + mp.giaBan());
        System.out.println("Thành tiền (5 sản phẩm): " + mp.thanhTien(5));

        // Tạo đối tượng DauGoi
        DauGoi dg = new DauGoi("Dầu gội đầu", "Công ty XYZ", 50000);
        System.out.println("\nThông tin dầu gội:");
        dg.xuat();
        System.out.println("Giá bán: " + dg.giaBan());
        System.out.println("Thành tiền (3 sản phẩm): " + dg.thanhTien(3));
    }
}
