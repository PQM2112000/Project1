import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int f0 = 1;
        int f1 = 2;
        int fn = 3;
        int s=0;
        int n;
        System.out.println("Nhap so N: ");
        Scanner Nhap = new Scanner(System.in);
        n = Nhap.nextInt();
        Nhap.close();
        if (n == 0 || n == 1) {
            System.out.println(n);
        } else {
            for (int i = 2; i < n; i++) {
                fn = f0 + f1;
                s=fn;
                f0 = f1;
                f1 = fn;
            }
        }
        System.out.println(s);
    }
}
