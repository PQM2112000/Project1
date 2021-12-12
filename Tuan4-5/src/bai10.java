import java.util.Scanner;

public class bai10 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pham Quang Minh 20183800");
        System.out.print("Nhap so luong xau n= ");
        int n = scanner.nextInt();
        int XauMax = 0, XauCT = 0;
        String s[] = new String[n];
        s[0] = scanner.nextLine();
        System.out.print("Nhap mang cac xau: ");
        for(int i=0; i<n; i++){
            s[i] = scanner.nextLine();
            if ( s[i].length() > XauMax ) {
                XauMax=s[i].length();
                XauCT=i;
            }
        }
        System.out.println("Xau co do dai lon nhat: "+s[XauCT]);
    }
}
