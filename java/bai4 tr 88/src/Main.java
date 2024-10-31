import java.util.Scanner;

class Nguoi {
    String hoTen;
    int namSinh;
    String gioiTinh;
    String diaChi;
    String soCCCD;

    // Hàm khởi tạo
    public Nguoi() {
    }

    public Nguoi(String hoTen, int namSinh, String gioiTinh, String diaChi, String soCCCD) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soCCCD = soCCCD;
    }

    // Hàm nhập
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        boolean validName = false;
        while (!validName) {
            System.out.print("Nhập họ và tên: ");
            hoTen = scanner.nextLine();
            if (hoTen.matches(".*\\d.*")) {
                System.out.println("Họ và tên không được chứa số. Vui lòng nhập lại.");
            } else {
                validName = true;
            }
        }
        System.out.print("Nhập năm sinh: ");
        namSinh = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới còn sót lại
        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập số CCCD: ");
        soCCCD = scanner.nextLine();
    }

    // Hàm xuất
    public void xuat() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số CCCD: " + soCCCD);
    }
}

class DanhBaDienThoai {
    String soDienThoai;
    Nguoi chuThueBao;
    int soPhutGoi;

    // Hàm khởi tạo
    public DanhBaDienThoai() {
        chuThueBao = new Nguoi();
    }

    // Hàm nhập
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        soDienThoai = scanner.nextLine();
        System.out.println("Nhập thông tin chủ thuê bao:");
        chuThueBao.nhap();
        System.out.print("Nhập số phút gọi: ");
        soPhutGoi = scanner.nextInt();
    }

    // Hàm xuất
    public void xuat() {
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Thông tin chủ thuê bao:");
        chuThueBao.xuat();
        System.out.println("Số phút gọi: " + soPhutGoi);
    }

    // Hàm tính cước điện thoại chưa có thuế GTGT
    public double tinhCuoc() {
        double cuoc = 27000; // Thuê bao mỗi tháng
        if (soPhutGoi <= 200) {
            cuoc += soPhutGoi * 120;
        } else if (soPhutGoi <= 1000) {
            cuoc += 200 * 120 + (soPhutGoi - 200) * 80;
        } else {
            cuoc += 200 * 120 + 800 * 80 + (soPhutGoi - 1000) * 40;
        }
        return cuoc;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng thuê bao: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới

        DanhBaDienThoai[] danhSach = new DanhBaDienThoai[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin thuê bao thứ " + (i + 1) + ":");
            danhSach[i] = new DanhBaDienThoai();
            danhSach[i].nhap();
        }

        System.out.println("\nDanh sách các thuê bao:");
        double tongCuoc = 0;
        for (DanhBaDienThoai danhBa : danhSach) {
            danhBa.xuat();
            double cuoc = danhBa.tinhCuoc();
            System.out.println("Cước điện thoại chưa có thuế GTGT: " + cuoc);
            tongCuoc += cuoc;
        }

        System.out.println("Tổng số tiền thu được: " + tongCuoc);

        System.out.print("\nNhập số điện thoại cần tìm: ");
        String soDienThoaiCanTim = scanner.nextLine();
        boolean timThay = false;
        for (DanhBaDienThoai danhBa : danhSach) {
            if (danhBa.soDienThoai.equals(soDienThoaiCanTim)) {
                System.out.println("Thông tin thuê bao có số điện thoại " + soDienThoaiCanTim + ":");
                danhBa.xuat();
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy thuê bao có số điện thoại " + soDienThoaiCanTim);
        }
    }
}

