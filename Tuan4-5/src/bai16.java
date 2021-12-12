import java.util.Scanner;
public class bai16 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pham Quang Minh 20183800");
        System.out.print("Nhap xau s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhap xau s2: ");
        String s2 = scanner.nextLine();
        int n = s1.length(),m = s2.length();
        int j=0;
        for(int i=0;i<m;i++){
            if ( j < n ){
                if ( s2.charAt(i) == s1.charAt(j) ) j++;
            }
        }
        if ( j == n ){
            System.out.println("s1 la xau con cua s2 ");
        }
        else{
            System.out.println("s1 khong la xau con cua s2 ");
        }
    }
}
