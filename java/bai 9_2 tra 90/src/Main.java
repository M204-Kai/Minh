import java.util.ArrayList;
import java.util.Scanner;

class Clock {
    int gio, phut, giay;

    // Hàm khởi tạo mặc định
    public Clock() {
    }

    // Hàm khởi tạo với các đối số
    public Clock(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    // Hàm nhập giá trị
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giờ: ");
        gio = scanner.nextInt();
        System.out.print("Nhập phút: ");
        phut = scanner.nextInt();
        System.out.print("Nhập giây: ");
        giay = scanner.nextInt();
    }

    // Hàm xuất giá trị
    public void xuat() {
        System.out.println(gio + ":" + phut + ":" + giay);
    }
}

class ChuyenBay extends Clock {
    Clock gioBay = new Clock();
    String maSoChuyenBay;
    String hangHangKhong;

    // Hàm khởi tạo mặc định
    public ChuyenBay() {
    }

    // Hàm khởi tạo với các đối số
    public ChuyenBay(Clock gioBay, String maSoChuyenBay, String hangHangKhong) {
        this.gioBay = gioBay;
        this.maSoChuyenBay = maSoChuyenBay;
        this.hangHangKhong = hangHangKhong;
    }

    // Hàm nhập giá trị
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giờ bay:");
        gioBay.nhap();
        System.out.print("Nhập mã số chuyến bay: ");
        maSoChuyenBay = scanner.nextLine();
        System.out.print("Nhập hãng hàng không: ");
        hangHangKhong = scanner.nextLine();
    }

    // Hàm xuất giá trị
    public void xuat() {
        System.out.print("Giờ bay: ");
        gioBay.xuat();
        System.out.println("Mã số chuyến bay: " + maSoChuyenBay);
        System.out.println("Hãng hàng không: " + hangHangKhong);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng chuyến bay: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới

        ArrayList<ChuyenBay> danhSach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin chuyến bay thứ " + (i + 1) + ":");
            ChuyenBay chuyenBay = new ChuyenBay();
            chuyenBay.nhap();
            danhSach.add(chuyenBay);
        }

        System.out.println("\nDanh sách các chuyến bay:");
        for (ChuyenBay chuyenBay : danhSach) {
            chuyenBay.xuat();
            System.out.println();
        }

        System.out.print("Nhập mã số chuyến bay để tìm giờ bay: ");
        String maSoCanTim = scanner.nextLine();
        boolean timThay = false;
        for (ChuyenBay chuyenBay : danhSach) {
            if (chuyenBay.maSoChuyenBay.equals(maSoCanTim)) {
                System.out.print("Giờ bay của chuyến bay có mã số " + maSoCanTim + ": ");
                chuyenBay.gioBay.xuat();
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy chuyến bay có mã số " + maSoCanTim);
        }

        System.out.println("\nDanh sách các chuyến bay có cùng giờ bay:");
        for (int i = 0; i < danhSach.size(); i++) {
            for (int j = i + 1; j < danhSach.size(); j++) {
                if (danhSach.get(i).gioBay.gio == danhSach.get(j).gioBay.gio &&
                        danhSach.get(i).gioBay.phut == danhSach.get(j).gioBay.phut &&
                        danhSach.get(i).gioBay.giay == danhSach.get(j).gioBay.giay) {
                    danhSach.get(i).xuat();
                    System.out.println();
                    danhSach.get(j).xuat();
                    System.out.println();
                }
            }
        }
    }
}
