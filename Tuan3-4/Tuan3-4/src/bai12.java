import java.util.Scanner;

public class bai12 {
    public static Scanner scanner = new Scanner(System.in);
     
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhap M: ");
        int m = scanner.nextInt();
        int b[] = new int[m];
        System.out.println("Nhap mang B: ");
        for(int i=0;i<m;i++){
            b[i]=scanner.nextInt();
        }
        
        int j=0;;
        for(int i=0;i<m;i++){
            if ( j < n ){
                if ( b[i] == arr[j] ) j++;
            }
        }
        if ( j == n ){
            System.out.println("A la day con cua B ");
        }
        else{
            System.out.println("A khong la day con cua B ");
        }
        System.out.println("Pham Quang Minh 20183800");
    }
}
