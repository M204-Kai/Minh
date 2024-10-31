import java.util.Scanner;

class Date {
    int ngay, thang, nam;

    // Hàm dựng để khởi tạo Date
    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    // Hàm nhập giá trị
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        ngay = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        thang = scanner.nextInt();
        System.out.print("Nhập năm: ");
        nam = scanner.nextInt();
    }

    // Hàm in thông tin
    public void in() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }

    // Hàm kiểm tra ngày có hợp lệ hay không
    public boolean kiemTraHopLe() {
        // Kiểm tra tháng hợp lệ
        if (thang < 1 || thang > 12) {
            return false;
        }

        // Kiểm tra ngày hợp lệ dựa trên tháng
        int[] ngayTrongThang = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Kiểm tra năm nhuận
        if (nam % 4 == 0 && (nam % 100 != 0 || nam % 400 == 0)) {
            ngayTrongThang[2] = 29;
        }

        // Kiểm tra ngày hợp lệ
        return ngay > 0 && ngay <= ngayTrongThang[thang];
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo 1 Date có giá trị là: 09/09/2005. In giá trị đó ra màn hình
        Date dateA = new Date(9, 9, 2005);
        System.out.print("Giá trị Date A: ");
        dateA.in();

        // Tạo 1 Date bất kỳ nhập giá trị cho nó. In ra màn hình
        Date dateB = new Date(0, 0, 0); // Sử dụng giá trị tạm thời để khởi tạo
        System.out.println("Nhập giá trị cho Date B:");
        dateB.nhap();
        System.out.print("Giá trị Date B: ");
        dateB.in();

        // Kiểm tra ngày vừa nhập có hợp lệ hay không và in ra màn hình
        if (dateB.kiemTraHopLe()) {
            System.out.println("Date B hợp lệ.");
        } else {
            System.out.println("Date B không hợp lệ.");
        }
    }
}
