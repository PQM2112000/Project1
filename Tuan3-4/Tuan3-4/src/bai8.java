import java.util.Scanner;

public class bai8 {
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
        for(int i=0;i<n;i++){
            if ( arr[i] != 0  ) System.out.print(arr[i]+" ");
        }
        
        System.out.println("Phạm Quang Minh 20183800");
    }
}
