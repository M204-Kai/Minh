import java.util.Scanner;

class Diem {
    int x, y;
    // Hàm gán tọa độ cho điểm
    void Gan(int hoanh, int tung) {
        x = hoanh;
        y = tung;
    }

    // Hàm nhập tọa độ cho điểm
    void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hoành độ: ");
        x = scanner.nextInt();
        System.out.print("Nhập tung độ: ");
        y = scanner.nextInt();
    }

    // Hàm in tọa độ điểm
    void Indiem() {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Hàm xuất giá trị hoành độ
    int PutX() {
        return x;
    }

    // Hàm xuất giá trị tung độ
    int PutY() {
        return y;
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo ra điểm A tọa độ (3,4)
        Diem A = new Diem();
        A.Gan(3, 4);
        System.out.print("Toạ độ điểm A: ");
        A.Indiem();

        // Tạo ra điểm B với giá trị nhập từ bàn phím
        Diem B = new Diem();
        System.out.println("Nhập toạ độ điểm B:");
        B.Nhap();
        System.out.print("Toạ độ điểm B: ");
        B.Indiem();

        // Tạo ra điểm C đối xứng với điểm B qua gốc tọa độ
        Diem C = new Diem();
        C.Gan(-B.PutX(), -B.PutY());
        System.out.print("Toạ độ điểm C: ");
        C.Indiem();

        // Tính khoảng cách từ điểm B đến gốc tọa độ
        double khoangCach = Math.sqrt(B.PutX() * B.PutX() + B.PutY() * B.PutY());
        System.out.println("Khoảng cách từ điểm B đến gốc tọa độ: " + khoangCach);
    }
}