import java.util.Scanner;

public class bai9 {
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
        System.out.println("nhap so c:");
        int c = scanner.nextInt();
        int b1=0,b2=0,b3 =0;
        for(int i=0;i<n;i++){
            if ( arr[i] < c )  b1++;
            if ( arr[i] == c ) b2++;
            if ( arr[i] > c )  b3++;
        }
        System.out.println("So cac so nho hon "+c+": "+b1);
        System.out.println("So cac so bang "+c+": "+b2);
        System.out.println("So cac so lon hon "+c+": "+b3);

        System.out.println("Phạm Quang Minh 20183800");
    }
}
