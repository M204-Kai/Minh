import java.io.IOException;

public class bai1trang25 {
    public static int kta(int a) {
        int kta = 0;
        if (a >= '0' && a <= '9')
            kt = 1;
        return kt;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Nhap vao mot ki tu:");
            int a = System.in.read();
            if (kta(a) == 1)
                System.out.println("Nam trong khoang 0->9");
            else
                System.out.println("Nma trong khoang 0 - >9");

        } catch (IOException ex) {
        }
    }
}