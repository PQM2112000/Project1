import java.util.Scanner;
public class bai14 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pham Quang Minh 20183800");
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        StringBuilder s = new StringBuilder("1111100000");
        for(int i=1;i<n;i++){
            s.insert(0, s.charAt(9));
            s.deleteCharAt(9);
        }
        System.out.println("Xau thu n la: "+s.toString());
    }
}
