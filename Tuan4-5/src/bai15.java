import java.util.Scanner;
public class bai15 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pham Quang Minh 20183800");
        String s,s1,s2;
        System.out.print("Nhap xau s: ");
        s = scanner.nextLine();
        System.out.print("Nhap xau s2: ");
        s2 = scanner.nextLine();
        System.out.print("Nhap xau s1: ");
        s1 = scanner.nextLine();
        String s3 = s + s1 + s2;
        
        System.out.println("Ket qua abc: "+s3);

    }
}
