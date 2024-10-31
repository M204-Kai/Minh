public class SinhVien {
    private String hoten;
    private String mssv;
    private String lop;

    // Hàm khởi tạo mặc định
    public SinhVien() {
        this.hoten = "Nguyễn Văn A";
        this.mssv = "12345678";
        this.lop = "CNTT1";
    }

    // Hàm khởi tạo với các đối số
    public SinhVien(String hoten, String mssv, String lop) {
        this.hoten = hoten;
        this.mssv = mssv;
        this.lop = lop;
    }

    // Phương thức getHoten
    public void getHoten() {
        System.out.println("Họ tên sinh viên: " + hoten);
    }

    // Phương thức getMssv
    public void getMssv() {
        System.out.println("Mã số sinh viên: " + mssv);
    }

    // Phương thức getLop
    public void getLop() {
        System.out.println("Lớp: " + lop);
    }

    public static void main(String[] args) {
        // Tạo đối tượng SinhVien mặc định
        SinhVien sv1 = new SinhVien();
        sv1.getHoten();
        sv1.getMssv();
        sv1.getLop();

        // Tạo đối tượng SinhVien với các đối số
        SinhVien sv2 = new SinhVien("Lê Thị B", "87654321", "CNTT2");
        sv2.getHoten();
        sv2.getMssv();
        sv2.getLop();
    }
}
